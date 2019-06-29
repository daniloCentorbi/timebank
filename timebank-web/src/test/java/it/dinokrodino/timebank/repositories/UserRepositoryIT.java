/*
 * Created by DC on 6/29/2019
 */

package it.dinokrodino.timebank.repositories;

import it.dinokrodino.timebank.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UserRepositoryIT {

    @Autowired
    UserRepository userRepository;

    @Test
    public void findByUsername() {

        Optional<User> optionalUser = userRepository.findByUsername("Terry");

        assertEquals("Terry", optionalUser.get().getUsername());
    }
}