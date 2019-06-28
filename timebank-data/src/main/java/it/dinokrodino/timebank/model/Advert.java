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
public class Advert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate creationDate;
    private String category;
    private String title;
    private String description;

    @Enumerated(value = EnumType.STRING)
    private Tipology tipology;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "advert")
    private List<Event> events;

  }
