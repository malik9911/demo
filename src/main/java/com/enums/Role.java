package com.enums;

public enum  Role {
    admin("admin"),user("user");
    String value;

    private Role(String value ){ this.value =value ; }
    private String getKey(){return value;}

    @Override
    public String toString() {
        return this.getKey();
    }
}
