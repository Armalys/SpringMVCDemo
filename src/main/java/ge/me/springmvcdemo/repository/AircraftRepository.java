package ge.me.springmvcdemo.repository;

import ge.me.springmvcdemo.model.Aircraft;
import org.springframework.data.repository.CrudRepository;

public interface AircraftRepository extends CrudRepository<Aircraft, Long> {
}
