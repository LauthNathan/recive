package com.cesi.recive.consumer;

import com.cesi.recive.wcfService.*;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import java.util.ArrayList;

@MessageDriven(mappedName = "jms/responseQueue", activationConfig = {
        @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/responseQueue"),
        @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class ConsumerMdb implements MessageListener {
    @Override
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try {
            ArrayList<Object> stringArrayList = new ArrayList<>();
            ArrayOfanyType arrayOfanyType = new ArrayOfanyType();
            stringArrayList.add(textMessage.getText());
            stringArrayList.add(textMessage.getStringProperty("path"));
            stringArrayList.add(textMessage.getStringProperty("key"));
            stringArrayList.add(textMessage.getStringProperty("confidence"));
            arrayOfanyType.anyType = stringArrayList;

            System.out.println("information secrete :  " + textMessage.getText());

            ObjectFactory objectFactory = new ObjectFactory();
            SVR svr = new SVR();
            IComposantService composantService = svr.getBasicHttpBindingIComposantService();
            MSG msg = new MSG();
            msg.setAppVersion(objectFactory.createMSGAppVersion(textMessage.getStringProperty("appVersion")));
            msg.setData(objectFactory.createMSGData(arrayOfanyType));
            msg.setInfo(objectFactory.createMSGInfo("Secret found"));
            msg.setOperationName(objectFactory.createMSGOperationName("Stop"));
            msg.setOperationVersion(objectFactory.createMSGOperationVersion(textMessage.getStringProperty("operationVersion")));
            msg.setStatutOp(true);
            msg.setTokenApp(objectFactory.createMSGTokenApp(textMessage.getStringProperty("tokenApp")));
            msg.setTokenUser(objectFactory.createMSGTokenUser(textMessage.getStringProperty("userName")));
            composantService.mService(msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
