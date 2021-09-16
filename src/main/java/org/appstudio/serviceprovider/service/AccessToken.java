package org.appstudio.serviceprovider.service;

public class AccessToken {
    private String token;
    private String serviceProviderUrl;
    private String serviceProviderUserName;
    private String serviceProviderUserId;
    private String userId;
    private String expiredAfter;
    private String name;

    public AccessToken(String token, String serviceProviderUrl, String serviceProviderUserName, String serviceProviderUserId, String userId, String expiredAfter, String name) {
        this.token = token;
        this.serviceProviderUrl = serviceProviderUrl;
        this.serviceProviderUserName = serviceProviderUserName;
        this.serviceProviderUserId = serviceProviderUserId;
        this.userId = userId;
        this.expiredAfter = expiredAfter;
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getServiceProviderUrl() {
        return serviceProviderUrl;
    }

    public void setServiceProviderUrl(String serviceProviderUrl) {
        this.serviceProviderUrl = serviceProviderUrl;
    }

    public String getServiceProviderUserName() {
        return serviceProviderUserName;
    }

    public void setServiceProviderUserName(String serviceProviderUserName) {
        this.serviceProviderUserName = serviceProviderUserName;
    }

    public String getServiceProviderUserId() {
        return serviceProviderUserId;
    }

    public void setServiceProviderUserId(String serviceProviderUserId) {
        this.serviceProviderUserId = serviceProviderUserId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExpiredAfter() {
        return expiredAfter;
    }

    public void setExpiredAfter(String expiredAfter) {
        this.expiredAfter = expiredAfter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
