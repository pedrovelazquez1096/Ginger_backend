package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.Luz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LuzRepository extends CrudRepository<Luz, Long> {
}
