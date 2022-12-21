package ge.me.springmvcdemo.repository;

import ge.me.springmvcdemo.model.Aircraft;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AircraftRepository extends ReactiveCrudRepository<Aircraft, Long> {}
