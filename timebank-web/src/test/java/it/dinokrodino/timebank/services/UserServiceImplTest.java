/*
 * Created by DC on 6/28/2019
 */

package it.dinokrodino.timebank.services;

import it.dinokrodino.timebank.model.User;
import it.dinokrodino.timebank.repositories.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceImplTest {

    UserServiceImpl userServiceImpl;

    @Mock
    UserRepository userRepository;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        userServiceImpl = new UserServiceImpl(userRepository);
    }

    @Test
    public void findAll() {
        User user = new User();
        Set<User> userData = new HashSet<>();
        userData.add(user);

        when(userRepository.findAll()).thenReturn(userData);

        Set<User> users = userServiceImpl.findAll();

        assertEquals(users.size(), 1);
        verify(userRepository, times(1)).findAll();
    }
}