/*
 * Created by DC on 6/28/2019
 */

package it.dinokrodino.timebank.repositories;

import it.dinokrodino.timebank.model.Advert;
import org.springframework.data.repository.CrudRepository;

public interface AdvertRepository extends CrudRepository<Advert, Long> {
}
