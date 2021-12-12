package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.Actuador;
import com.pvelazquez.gingerIoT.repositories.ActuadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ActuadorService {
    @Autowired
    ActuadorRepository actuadorRepository;

    public ArrayList<Actuador> getAllActuador(){
        return (ArrayList<Actuador>) actuadorRepository.findAll();
    }

    public Optional<Actuador> getActuador(Long id){
        return actuadorRepository.findById(id);
    }

    public Actuador createActuador(Actuador actuador){
        return  actuadorRepository.save(actuador);
    }

    public Actuador updateActuador(Actuador actuador,Long id){
        actuador.setId(id);
        return actuadorRepository.save(actuador);
    }

    public void deleteActuador(Actuador actuador){
        actuadorRepository.delete(actuador);
    }

    public void deleteActuador(Long id){
        actuadorRepository.deleteById(id);
    }

    public Optional<ArrayList<Actuador>> findActuadorByNombre(String nombre){
        return actuadorRepository.findByNombre(nombre);
    }

    public Optional<ArrayList<Actuador>> findActuadorByDecripcion(String desc){
        return actuadorRepository.findByDescripcion(desc);
    }

    public Optional<ArrayList<Actuador>> findActuadorByTipoActuador(String tipo){
        return actuadorRepository.findByTipoActuador(tipo);
    }

    public Optional<ArrayList<Actuador>> findActuadorByUbicacion(String ubicacion){
        return actuadorRepository.findByUbicacion(ubicacion);
    }

    public Optional<ArrayList<Actuador>> findActuadorByUnidades(String unidades){
        return actuadorRepository.findByUnidades(unidades);
    }

    public Optional<ArrayList<Actuador>> findActuadorByNombreAndDescripcion(String nombre, String desc){
        return actuadorRepository.findByNombreAndDescripcion(nombre, desc);
    }

    public Optional<ArrayList<Actuador>> findActuadorByTipoActuadorAndUbicacion(String tipo, String ubicacion){
        return actuadorRepository.findByTipoActuadorAndUbicacion(tipo, ubicacion);
    }

    public Optional<ArrayList<Actuador>> findActuadorByNombreAndDescripcionLike(String nombre, String desc){
        return actuadorRepository.findByNombreAndDescripcionLike(nombre, desc);
    }
}
