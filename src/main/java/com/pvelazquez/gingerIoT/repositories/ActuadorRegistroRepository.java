package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.ActuadorRegistro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActuadorRegistroRepository extends CrudRepository<ActuadorRegistro, Long> {
}
