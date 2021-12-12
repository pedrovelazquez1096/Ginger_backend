package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.LuzRegistro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface LuzRegistroRepository extends CrudRepository<LuzRegistro, Long> {
    public abstract Optional<ArrayList<LuzRegistro>> findByTimeStampAndAplicado(Timestamp timestamp,Boolean aplicado);
    public abstract Optional<ArrayList<LuzRegistro>> findByTimeStamp(Timestamp timestamp);
    public abstract Optional<ArrayList<LuzRegistro>> findByTimeStampBetween(Timestamp a, Timestamp b);
    public abstract Optional<ArrayList<LuzRegistro>> findByValor(String valor);
    public abstract Optional<ArrayList<LuzRegistro>> findByIdLuz(Long id);
}
