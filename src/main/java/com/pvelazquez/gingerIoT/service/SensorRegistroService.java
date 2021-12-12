package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.SensorRegistro;
import com.pvelazquez.gingerIoT.repositories.SensorRegistroRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class SensorRegistroService {
    @Autowired
    SensorRegistroRespository sensorRegistroRespository;

    public ArrayList<SensorRegistro> getAllSensorRegistro(){
        return (ArrayList<SensorRegistro>) sensorRegistroRespository.findAll();
    }

    public Optional<SensorRegistro> getSensorRegistro(Long id){
        return sensorRegistroRespository.findById(id);
    }

    public SensorRegistro createSensorRegistro(SensorRegistro sensorRegistro){
        return sensorRegistroRespository.save(sensorRegistro);
    }

    public SensorRegistro updateSensorRegistro(SensorRegistro sensorRegistro, Long id){
        sensorRegistro.setId(id);
        return sensorRegistroRespository.save(sensorRegistro);
    }

    public void deleteSensorRegistro(SensorRegistro sensorRegistro){
        sensorRegistroRespository.delete(sensorRegistro);
    }
    public void deleteSensorRegistro(Long id){
        sensorRegistroRespository.deleteById(id);
    }

    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByTimestampAndAplicado(Timestamp timestamp, Boolean aplicado){
        return sensorRegistroRespository.findByTimeStampAndAplicado(timestamp, aplicado);
    }

    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByTimestampBetween(Timestamp a, Timestamp b){
        return sensorRegistroRespository.findByTimeStampBetween(a, b);
    }

    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByTimestamp(Timestamp timestamp){
        return sensorRegistroRespository.findByTimeStamp(timestamp);
    }

    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByValor(Float valor){
        return sensorRegistroRespository.findByValor(valor);
    }

    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByIdSensor(Long id){
        return sensorRegistroRespository.findByIdSensor(id);
    }
}
