/*
 * Created by DC on 6/23/2019
 */

package it.dinokrodino.timebank.services;

import it.dinokrodino.timebank.model.User;

import java.util.Set;

public interface   UserService {
    User findById(Long id);
    User findByUsername(String username);
    User save(User user);
    Set<User> findAll();
}
