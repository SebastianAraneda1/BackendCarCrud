package io.cmartinez.carcrud.repository;

import io.cmartinez.carcrud.repository.model.CarEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository
        extends CrudRepository<CarEntity, Integer> {
}
