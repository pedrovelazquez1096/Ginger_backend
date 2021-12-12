package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.SensorRegistro;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface SensorRegistroRespository extends CrudRepository<SensorRegistro, Long> {
    public abstract Optional<ArrayList<SensorRegistro>> findByTimeStampAndAplicado(Timestamp timestamp, Boolean aplicado);
    public abstract Optional<ArrayList<SensorRegistro>> findByTimeStamp(Timestamp timestamp);
    public abstract Optional<ArrayList<SensorRegistro>> findByTimeStampBetween(Timestamp a, Timestamp b);
    public abstract Optional<ArrayList<SensorRegistro>> findByValor(Float valor);
    public abstract Optional<ArrayList<SensorRegistro>> findByIdSensor(Long id);
}
