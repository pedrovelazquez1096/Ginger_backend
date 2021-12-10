package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.LuzRegistro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuzRegistroRepository extends CrudRepository<LuzRegistro, Long> {
}
