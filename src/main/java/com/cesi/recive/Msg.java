package com.cesi.recive;

import java.io.Serializable;
import java.util.ArrayList;

public class Msg implements Serializable {
    private String appVersion;
    private ArrayList<Object> data;
    private String info;
    private String operationName;
    private String operationVersion;
    private boolean statutOp;
    private String tokenApp;
    private String tokenUser;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ArrayList<Object> getData() {
        return data;
    }

    public void setData(ArrayList<Object> data) {
        this.data = data;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationVersion() {
        return operationVersion;
    }

    public void setOperationVersion(String operationVersion) {
        this.operationVersion = operationVersion;
    }

    public boolean getStatutOp() {
        return statutOp;
    }

    public void setStatutOp(boolean statutOp) {
        this.statutOp = statutOp;
    }

    public String getTokenApp() {
        return tokenApp;
    }

    public void setTokenApp(String tokenApp) {
        this.tokenApp = tokenApp;
    }

    public String getTokenUser() {
        return tokenUser;
    }

    public void setTokenUser(String tokenUser) {
        this.tokenUser = tokenUser;
    }

    @Override
    public String toString() {
        return "Msg [appVersion=" + appVersion + ", data=" + data + " info=" + info + ", operationName="
                + operationName + ", operationVersion=" + operationVersion + ", statutOp=," + statutOp
                + " tokenApp=" + tokenApp + ", tokenUser=" + tokenUser + "]";
    }
}
