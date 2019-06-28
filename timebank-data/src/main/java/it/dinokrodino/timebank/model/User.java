
/*
 * Created by DC on 6/23/2019
 */

package it.dinokrodino.timebank.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private String username;
    private String description;
    private String mail;
    private LocalDate dateOfBirth;
    private String interests;
    private int credits;

    @OneToMany(mappedBy = "user")
    private List<Advert> adverts;

    @OneToMany(mappedBy = "sender")
    private List<Message> sentMessages;

    @OneToMany(mappedBy = "receiver")
    private List<Message> receivedMessages;

    @OneToMany(mappedBy = "acceptor")
    List<Event> eventAccepted;
}
