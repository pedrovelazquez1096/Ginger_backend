package com.pvelazquez.gingerIoT.repositories;

import com.pvelazquez.gingerIoT.model.Actuador;
import com.pvelazquez.gingerIoT.model.Luz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface LuzRepository extends CrudRepository<Luz, Long> {
    public abstract Optional<ArrayList<Luz>> findByNombre(String nombre);
    public abstract Optional<ArrayList<Luz>> findByDescripcion(String descripcion);
    public abstract Optional<ArrayList<Luz>> findByTipoLuz(String tipoLuz);
    public abstract Optional<ArrayList<Luz>> findByUbicacion(String ubicacion);
    public abstract Optional<ArrayList<Luz>> findByUnidades(String unidades);
    public abstract Optional<ArrayList<Luz>> findByNombreAndDescripcion(String nombre, String descripcion);
    public abstract Optional<ArrayList<Luz>> findByTipoLuzAndUbicacion(String tipoLuz, String ubicacion);
    public abstract Optional<ArrayList<Luz>> findByNombreAndDescripcionLike(String nombre, String descripcion);
}
