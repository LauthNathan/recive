package com.cesi.recive.services;

import com.cesi.recive.wcfService.*;

import javax.ejb.Stateless;
import java.util.ArrayList;

@Stateless
public class AnswerService implements AnswerServiceLocal {

    /**
     * Send a response to the C# server.
     *
     * @param secret - The secret to find in the file(s).
     * @param path - The path of the file containing the secret message.
     * @param key - The key to decrypt the file.
     * @param confidence - The probability of the file to be in french.
     * @param appVersion - The version of the app.
     * @param operationVersion - The version of the operation.
     * @param tokenApp - The token of the application.
     * @param tokenUser - The token of the user.
     */
    @Override
    public void sendResponse(String secret, String path, String key, String confidence, String appVersion,
                             String operationVersion, String tokenApp, String tokenUser) {

        ArrayList<Object> stringArrayList = new ArrayList<>();
        ArrayOfanyType arrayOfanyType = new ArrayOfanyType();
        stringArrayList.add(secret);
        stringArrayList.add(path);
        stringArrayList.add(key);
        stringArrayList.add(confidence);
        arrayOfanyType.anyType = stringArrayList;

        ObjectFactory objectFactory = new ObjectFactory();
        SVR svr = new SVR();
        IComposantService composantService = svr.getBasicHttpBindingIComposantService();
        MSG msg = new MSG();
        msg.setAppVersion(objectFactory.createMSGAppVersion(appVersion));
        msg.setData(objectFactory.createMSGData(arrayOfanyType));
        msg.setInfo(objectFactory.createMSGInfo("Secret found"));
        msg.setOperationName(objectFactory.createMSGOperationName("Stop"));
        msg.setOperationVersion(objectFactory.createMSGOperationVersion(operationVersion));
        msg.setStatutOp(true);
        msg.setTokenApp(objectFactory.createMSGTokenApp(tokenApp));
        msg.setTokenUser(objectFactory.createMSGTokenUser(tokenUser));
        composantService.mService(msg);
    }
}
