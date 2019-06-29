/*
 * Created by DC on 6/28/2019
 */

package it.dinokrodino.timebank.repositories;

import it.dinokrodino.timebank.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
}
