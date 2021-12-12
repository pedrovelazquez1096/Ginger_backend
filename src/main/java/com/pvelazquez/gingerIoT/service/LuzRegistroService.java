package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.LuzRegistro;
import com.pvelazquez.gingerIoT.repositories.LuzRegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class LuzRegistroService {
    @Autowired
    LuzRegistroRepository luzRegistroRepository;

    public ArrayList<LuzRegistro> getAllLuzRegistro(){
        return (ArrayList<LuzRegistro>)luzRegistroRepository.findAll();
    }

    public Optional<LuzRegistro> getLuzRegistro(Long id){
        return luzRegistroRepository.findById(id);
    }

    public LuzRegistro createLuzRegistro(LuzRegistro luzRegistro){
        return luzRegistroRepository.save(luzRegistro);
    }

    public LuzRegistro updateLuzRegistro(LuzRegistro luzRegistro, Long id){
        luzRegistro.setId(id);
        return luzRegistroRepository.save(luzRegistro);
    }

    public void deleteLuzRegistro(Long id){
        luzRegistroRepository.deleteById(id);
    }
    public void deleteLuzRegistro(LuzRegistro luzRegistro){
        luzRegistroRepository.delete(luzRegistro);
    }

    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByTimestampAndAplicado(Timestamp timestamp, boolean aplicado){
        return luzRegistroRepository.findByTimeStampAndAplicado(timestamp,aplicado);
    }

    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByTimestamp(Timestamp timestamp){
        return luzRegistroRepository.findByTimeStamp(timestamp);
    }

    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByTimestampBetween(Timestamp start, Timestamp end){
        return luzRegistroRepository.findByTimeStampBetween(start, end);
    }

    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByValor(String valor){
        return luzRegistroRepository.findByValor(valor);
    }


    public Optional<ArrayList<LuzRegistro>> getLuzByIdLuz(Long id){
        return luzRegistroRepository.findByIdLuz(id);
    }
}
