package io.satendra.stateservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StateDao extends CrudRepository<StateEntity, Long>
{
    List<StateEntity> findAll();
}
