package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.Luz;
import com.pvelazquez.gingerIoT.repositories.LuzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class LuzService {
    @Autowired
    LuzRepository luzRepository;

    public ArrayList<Luz> getAllLuz(){
        return (ArrayList<Luz>)luzRepository.findAll();
    }

    public Optional<Luz> getLuz(Long id){
        return luzRepository.findById(id);
    }

    public Luz createLuz(Luz luz){
        return luzRepository.save(luz);
    }

    public Luz updateLuz(Luz luz, Long id){
        luz.setId(id);
        return luzRepository.save(luz);
    }

    public void deleteLuz(Luz luz){
        luzRepository.delete(luz);
    }

    public void deleteLuzById(Long id){
        luzRepository.deleteById(id);
    }

    public Optional<ArrayList<Luz>> findLuzByNombre(String nombre){
        return luzRepository.findByNombre(nombre);
    }

    public Optional<ArrayList<Luz>> findLuzByDescripcion(String descrip){
        return luzRepository.findByDescripcion(descrip);
    }

    public Optional<ArrayList<Luz>> findLuzByTipoLuz(String tipo){
        return luzRepository.findByTipoLuz(tipo);
    }

    public Optional<ArrayList<Luz>> findLuzByUbicacion(String ubi){
        return luzRepository.findByUbicacion(ubi);
    }

    public Optional<ArrayList<Luz>> findLuzByUnidades(String unidades){
        return luzRepository.findByUnidades(unidades);
    }

    public Optional<ArrayList<Luz>> findLuzByNombreAndDescripcion(String nombre, String descr){
        return luzRepository.findByNombreAndDescripcion(nombre, descr);
    }

    public Optional<ArrayList<Luz>> findLuzByTipoLuzAndUbicacion(String tipo, String ubi){
        return luzRepository.findByTipoLuzAndUbicacion(tipo, ubi);
    }

    public Optional<ArrayList<Luz>> findLuzByNombreAndDescripcionLike(String nombre, String descr){
        return luzRepository.findByNombreAndDescripcionLike(nombre,descr);
    }
}
