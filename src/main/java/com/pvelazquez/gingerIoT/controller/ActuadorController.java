package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.Actuador;
import com.pvelazquez.gingerIoT.service.ActuadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.HEAD,
        RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.TRACE})
@RequestMapping("/api/actuador")
public class ActuadorController {
    @Autowired
    ActuadorService actuadorService;

    @GetMapping("/acturadores")
    public ArrayList<Actuador> getAllActuador(){
        return actuadorService.getAllActuador();
    }

    @GetMapping("/{id}")
    public Optional<Actuador> getActuador(@PathVariable Long id){
        return actuadorService.getActuador(id);
    }

    @PostMapping()
    public Actuador addActuador(@Validated @RequestBody Actuador actuador){
        return actuadorService.createActuador(actuador);
    }

    @PutMapping("/{id}")
    public Actuador updateActuador(@PathVariable Long id, @Validated @RequestBody Actuador actuador){
        return actuadorService.updateActuador(actuador,id);
    }

    @DeleteMapping("/{id}")
    public void deleteActuador(@PathVariable Long id){
        actuadorService.deleteActuador(id);
    }

    @GetMapping("/nombre/")
    public Optional<ArrayList<Actuador>> findActuadorByNombre(@RequestParam("nombre")String nombre){
        return actuadorService.findActuadorByNombre(nombre);
    }

    @GetMapping("/descripcion/")
    public Optional<ArrayList<Actuador>> findActuadorByDecripcion(@RequestParam("descripcion")String desc){
        return actuadorService.findActuadorByDecripcion(desc);
    }

    @GetMapping("/tipo/")
    public Optional<ArrayList<Actuador>> findActuadorByTipoActuador(@RequestParam("tipo")String tipo){
        return actuadorService.findActuadorByTipoActuador(tipo);
    }

    @GetMapping("/ubicacion/")
    public Optional<ArrayList<Actuador>> findActuadorByUbicacion(@RequestParam("ubicacion")String ubicacion){
        return actuadorService.findActuadorByUbicacion(ubicacion);
    }

    @GetMapping("/unidades/")
    public Optional<ArrayList<Actuador>> findActuadorByUnidades(@RequestParam("unidades")String unidades){
        return actuadorService.findActuadorByUnidades(unidades);
    }

    @GetMapping("/nombre_descripcion/")
    public Optional<ArrayList<Actuador>> findActuadorByNombreAndDescripcion(@RequestParam("nombre")String nombre,
                                                                            @RequestParam("descripcion")String desc){
        return actuadorService.findActuadorByNombreAndDescripcion(nombre, desc);
    }

    @GetMapping("/tipo_ubicacion/")
    public Optional<ArrayList<Actuador>> findActuadorByTipoActuadorAndUbicacion(@RequestParam("tipo")String tipo,
                                                                                @RequestParam("ubicacion")String ubicacion){
        return actuadorService.findActuadorByTipoActuadorAndUbicacion(tipo, ubicacion);
    }

    @GetMapping("/nombre_descripcionlike/")
    public Optional<ArrayList<Actuador>> findActuadorByNombreAndDescripcionLike(@RequestParam("nombre")String nombre,
                                                                                @RequestParam("descripcion")String desc){
        return actuadorService.findActuadorByNombreAndDescripcionLike(nombre, desc);
    }
}
