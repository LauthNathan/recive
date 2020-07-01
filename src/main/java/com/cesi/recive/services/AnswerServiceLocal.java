package com.cesi.recive.services;

import javax.ejb.Local;

@Local
public interface AnswerServiceLocal {
    public void sendResponse(String secret, String path, String key, String confidence, String appVersion,
                             String operationVersion, String tokenApp, String tokenUser);
}
