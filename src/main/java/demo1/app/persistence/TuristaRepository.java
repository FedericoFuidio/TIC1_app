package demo1.app.persistence;


import demo1.app.business.entities.Turista;
import org.springframework.data.repository.CrudRepository;

public interface TuristaRepository extends CrudRepository<Turista, Long> {

    Turista findTuristaBy(Long documento);

}
