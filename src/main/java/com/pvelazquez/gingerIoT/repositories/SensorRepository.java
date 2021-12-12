package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.Sensor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface SensorRepository extends CrudRepository<Sensor, Long> {
    public abstract Optional<ArrayList<Sensor>> findByNombre(String nombre);
    public abstract Optional<ArrayList<Sensor>> findByDescripcion(String descripcion);
    public abstract Optional<ArrayList<Sensor>> findByTipoSensor(String tipoSensor);
    public abstract Optional<ArrayList<Sensor>> findByUbicacion(String ubicacion);
    public abstract Optional<ArrayList<Sensor>> findByUnidades(String unidades);
    public abstract Optional<ArrayList<Sensor>> findByNombreAndDescripcion(String nombre, String descripcion);
    public abstract Optional<ArrayList<Sensor>> findByNombreAndDescripcionLike(String nombre, String descripcion);
    public abstract Optional<ArrayList<Sensor>> findByTipoSensorAndUbicacion(String tipoSensor, String ubicacion);
}
