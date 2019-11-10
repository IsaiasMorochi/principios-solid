package com.isaias.solid.v2.dip.sin_dip;

/**
 * Alto nivel
 */
public class UserManager {

    public void showUser(int id){
        UserRepository userRepository = new UserRepository();
        User user = userRepository.getUser(1);
        System.out.println(user.toString());
    }
}
