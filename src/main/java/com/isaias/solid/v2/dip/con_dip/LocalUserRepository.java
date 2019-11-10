package com.isaias.solid.v2.dip.con_dip;

/**
 * Bajo nivel
 */
public class LocalUserRepository implements UserRepository {

    @Override
    public User getUser(int id) {
        User user = new User(1,"Juan", "juan@mail.com");
        return user;
    }
}
