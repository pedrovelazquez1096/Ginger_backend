package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.Actuador;
import com.pvelazquez.gingerIoT.model.Luz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface ActuadorRepository extends CrudRepository<Actuador,Long> {
    public abstract Optional<ArrayList<Actuador>> findByNombre(String nombre);
    public abstract Optional<ArrayList<Actuador>> findByDescripcion(String descripcion);
    public abstract Optional<ArrayList<Actuador>> findByTipoActuador(String tipoActuador);
    public abstract Optional<ArrayList<Actuador>> findByUbicacion(String ubicacion);
    public abstract Optional<ArrayList<Actuador>> findByUnidades(String unidades);
    public abstract Optional<ArrayList<Actuador>> findByNombreAndDescripcion(String nombre, String decripcion);
    public abstract Optional<ArrayList<Actuador>> findByTipoActuadorAndUbicacion(String tipoActuador, String ubicacion);
    public abstract Optional<ArrayList<Actuador>> findByNombreAndDescripcionLike(String nombre, String descripcion);
}
