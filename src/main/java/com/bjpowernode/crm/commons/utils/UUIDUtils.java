package com.bjpowernode.crm.commons.utils;

import java.util.UUID;

public class UUIDUtils {
    public  static String getUUID(){
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }
}
