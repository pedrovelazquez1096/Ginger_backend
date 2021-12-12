package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.Sensor;
import com.pvelazquez.gingerIoT.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class SensorService {
    @Autowired
    SensorRepository sensorRepository;

    public ArrayList<Sensor> getAllSensor(){
        return (ArrayList<Sensor>) sensorRepository.findAll();
    }

    public Optional<Sensor> getSensor(Long id){
        return sensorRepository.findById(id);
    }

    public Sensor createSensor(Sensor sensor){
        return sensorRepository.save(sensor);
    }

    public Sensor updateSensor(Sensor sensor, Long id){
        sensor.setId(id);
        return sensorRepository.save(sensor);
    }

    public void deleteSensor(Sensor sensor){
        sensorRepository.delete(sensor);
    }

    public void deleteSensor(Long id){
        sensorRepository.deleteById(id);
    }

    public Optional<ArrayList<Sensor>> findSensorByNombre(String nombre){
        return sensorRepository.findByNombre(nombre);
    }

    public Optional<ArrayList<Sensor>> findSensorByDescripcion(String desc){
        return sensorRepository.findByDescripcion(desc);
    }

    public Optional<ArrayList<Sensor>> findSensorByTipoSensor(String tipoSensor){
        return sensorRepository.findByTipoSensor(tipoSensor);
    }

    public Optional<ArrayList<Sensor>> findSensorByUbicacion(String ubi){
        return sensorRepository.findByUbicacion(ubi);
    }

    public Optional<ArrayList<Sensor>> findSensorByUnidades(String unidades){
        return sensorRepository.findByUnidades(unidades);
    }

    public Optional<ArrayList<Sensor>> findSensorByNombreAndDescripcion(String nombre, String desc){
        return  sensorRepository.findByNombreAndDescripcion(nombre, desc);
    }

    public Optional<ArrayList<Sensor>> findSensorByTipoSensorAndUbicacion(String tipoSensor, String ubicacion){
        return sensorRepository.findByTipoSensorAndUbicacion(tipoSensor, ubicacion);
    }
    public Optional<ArrayList<Sensor>> findSensorByNombreAndDescripcionLike(String nombre, String desc){
        return sensorRepository.findByNombreAndDescripcionLike(nombre, desc);
    }
}
