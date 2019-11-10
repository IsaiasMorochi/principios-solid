package com.isaias.solid.v2.dip.sin_dip;

/**
 * Bajoj nivel
 */
public class UserRepository {

    public User getUser(int id) {
        User user = new User(1,"Juan", "juan@mail.com");
        return user;
    }
}
