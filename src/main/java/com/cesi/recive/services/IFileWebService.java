package com.cesi.recive.services;

import com.cesi.recive.Msg;

import javax.jms.JMSException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.DOCUMENT)
public interface IFileWebService {
    @WebMethod
    void fileCheck(@WebParam(name="msg") final Msg msg) throws JMSException;
}
