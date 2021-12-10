package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.SensorRegistro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRegistroRespository extends CrudRepository<SensorRegistro, Long> {
}
