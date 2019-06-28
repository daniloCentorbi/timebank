/*
 * Created by DC on 6/28/2019
 */

package it.dinokrodino.timebank.repositories;

import it.dinokrodino.timebank.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
