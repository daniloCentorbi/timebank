/*
 * Created by DC on 6/28/2019
 */

package it.dinokrodino.timebank.bootstrap;

import it.dinokrodino.timebank.model.User;
import it.dinokrodino.timebank.repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;

    public DataLoader(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
            loadData();

    }

    private void loadData(){
        User user1 = new User();
        user1.setName("Tim");
        user1.setLastName("Grahm");
        user1.setUsername("Timmy");
        user1.setCredits(10);
        userRepository.save(user1);

        log.info("user added from DataLoader");
    }
}
