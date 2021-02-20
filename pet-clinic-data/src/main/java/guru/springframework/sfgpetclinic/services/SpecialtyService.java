package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 7/31/18.
 */
@Service
public interface SpecialtyService extends CrudService<Speciality, Long> {
}
