package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 8/7/18.
 */
@Service
public interface VisitService extends CrudService<Visit, Long> {
}
