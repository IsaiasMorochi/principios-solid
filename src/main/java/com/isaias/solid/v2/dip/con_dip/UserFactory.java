package com.isaias.solid.v2.dip.con_dip;

public class UserFactory {

    public static UserRepository create(){
        return new LocalUserRepository();
    }
}
