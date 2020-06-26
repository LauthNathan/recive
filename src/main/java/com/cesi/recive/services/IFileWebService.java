package com.cesi.recive.services;

import com.cesi.recive.message.ProducerSbLocal;


import javax.ejb.Stateless;
import javax.jms.JMSException;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@Stateless
@WebService
@SOAPBinding(style=Style.RPC)
public interface IFileWebService {
    @WebMethod
    String say(@WebParam(name="nom") final String name) throws JMSException;
}
