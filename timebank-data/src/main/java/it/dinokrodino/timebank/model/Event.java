/*
 * Created by DC on 6/23/2019
 */

package it.dinokrodino.timebank.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate creationDate;
    private int vote;
    private String feedback;
    private int hours;

    @ManyToOne
    private Advert advert;

    @ManyToOne
    private User acceptor;

}
