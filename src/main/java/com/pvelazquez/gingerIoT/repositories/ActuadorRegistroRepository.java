package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.ActuadorRegistro;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ActuadorRegistroRepository extends CrudRepository<ActuadorRegistro, Long> {
    public abstract Optional<ArrayList<ActuadorRegistro>> findByTimeStamp(Timestamp timestamp);
    public abstract Optional<ArrayList<ActuadorRegistro>> findByTimeStampBetween(Timestamp a, Timestamp b);
    public abstract Optional<ArrayList<ActuadorRegistro>> findByTimeStampAndAplicado(Timestamp timestamp, Boolean aplicado);
    public abstract Optional<ArrayList<ActuadorRegistro>> findByValor(Boolean valor);
    public abstract Optional<ArrayList<ActuadorRegistro>> findByIdActuador(Long id);
}
