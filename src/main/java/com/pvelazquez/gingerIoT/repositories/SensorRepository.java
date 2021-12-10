package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.Sensor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends CrudRepository<Sensor, Long> {

}
