package com.isaias.solid.v2.dip.con_dip;

/**
 * Alto nivel
 */
public class UserManager {

    public void showUser(){
        UserRepository userRepository = UserFactory.create();
        User user = userRepository.getUser(1);
        System.out.println(user.toString());
    }
}
