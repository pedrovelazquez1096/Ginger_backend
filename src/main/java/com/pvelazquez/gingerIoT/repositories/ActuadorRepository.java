package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.Actuador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActuadorRepository extends CrudRepository<Actuador,Long> {

}
