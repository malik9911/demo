package com.permission;


 import com.enums.Role;
 import org.slf4j.LoggerFactory;
 import org.slf4j.Logger;
 import org.springframework.beans.factory.support.ManagedMap;

 import java.util.HashMap;
 import java.util.Map;

public class PermissionAssigner {

    private Logger LOGGER=LoggerFactory.getLogger(PermissionAssigner.class);
     Map<Role , Map<String,String>> mainPermissionMap=new ManagedMap<Role, Map<String, String>>();
     Map<String,String> admin=new HashMap<String, String>();
     Map<String,String> user =new HashMap<String, String>();









}
