package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 7/29/18.
 */
@Service
public interface PetTypeService extends CrudService<PetType, Long> {
}
