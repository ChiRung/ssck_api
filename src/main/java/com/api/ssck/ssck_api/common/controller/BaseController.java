package com.api.ssck.ssck_api.common.controller;

import java.util.HashMap;
import java.util.Map;

public class BaseController {
    
    protected Map<String, Object> setResponseObject(String key, Object obj){
        Map<String, Object> returnValue = new HashMap<>();  
        returnValue.put(key, obj);
        return returnValue;
    }
    protected Map<String, Object> setResponseObject(Object obj){
        return setResponseObject("data", obj);
    }
    protected Map<String, Object> setResponseObject(boolean flag){
        return setResponseObject("success", flag);
    }
    protected Map<String, Object> setResponseObject(String comment){
        return setResponseObject("message", comment);
    }
    protected Map<String, Object> setResponseSuccess(Object obj){
        return setResponseObject(true);
    }
    protected Map<String, Object> setResponseFail(Object obj){
        return setResponseObject(false);
    }
}
