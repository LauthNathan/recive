package com.cesi.recive;

import com.cesi.recive.services.FileWebService;
import com.cesi.recive.wcfService.IComposantService;
import com.cesi.recive.wcfService.MSG;
import com.cesi.recive.wcfService.SVR;

import javax.xml.ws.Endpoint;

public class Main {
    final static String URL_HELLO = "http://localhost:8001/hello";
    public static void main(String[] args) {
        Endpoint.publish(URL_HELLO, new FileWebService());
        System.out.println("Service web démarre url " + URL_HELLO);
/*        SVR service = new SVR();
        IComposantService test = service.getBasicHttpBindingIComposantService();
        MSG msg = new MSG();
        msg.setStatutOp(true);
        test.mService(msg);*/
    }
}
