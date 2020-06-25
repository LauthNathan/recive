package com.cesi.recive.services;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@Stateless
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class FileWebService {

    public String printHello(String name) {
        return "Hello " + name + " !";
    }
}
