package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.ActuadorRegistro;
import com.pvelazquez.gingerIoT.repositories.ActuadorRegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class ActuadorRegistroService {
    @Autowired
    ActuadorRegistroRepository actuadorRegistroRepository;

    public ArrayList<ActuadorRegistro> getAllActuadorRegistro(){
        return (ArrayList<ActuadorRegistro>) actuadorRegistroRepository.findAll();
    }

    public Optional<ActuadorRegistro> getActuadorRegistro(Long id){
        return actuadorRegistroRepository.findById(id);
    }

    public ActuadorRegistro createActuadorRegistro(ActuadorRegistro actuadorRegistro){
        return actuadorRegistroRepository.save(actuadorRegistro);
    }

    public ActuadorRegistro updateActuadorRegistro(ActuadorRegistro actuadorRegistro, Long id){
        actuadorRegistro.setId(id);
        return actuadorRegistroRepository.save(actuadorRegistro);
    }

    public void deleteActuadorRegistro(ActuadorRegistro actuadorRegistro){
        actuadorRegistroRepository.delete(actuadorRegistro);
    }

    public void deleteActuadorRegistro(Long id){
        actuadorRegistroRepository.deleteById(id);
    }

    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByTimestamp(Timestamp timestamp){
        return actuadorRegistroRepository.findByTimeStamp(timestamp);
    }

    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByTimstampBetween(Timestamp start, Timestamp end){
        return actuadorRegistroRepository.findByTimeStampBetween(start, end);
    }

    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByTimestampAndAplicado(Timestamp timestamp, Boolean aplicado){
        return actuadorRegistroRepository.findByTimeStampAndAplicado(timestamp,aplicado);
    }

    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByValor(Boolean valor){
        return actuadorRegistroRepository.findByValor(valor);
    }

    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByIdActuador(Long id){
        return actuadorRegistroRepository.findByIdActuador(id);
    }
}
