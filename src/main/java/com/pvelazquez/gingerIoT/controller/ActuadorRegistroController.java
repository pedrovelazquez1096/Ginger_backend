package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.ActuadorRegistro;
import com.pvelazquez.gingerIoT.service.ActuadorRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.HEAD,
        RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.TRACE})
@RequestMapping("/api/actuadorregistro")
public class ActuadorRegistroController {
    @Autowired
    ActuadorRegistroService actuadorRegistroService;

    @GetMapping("/registros")
    public ArrayList<ActuadorRegistro> getAllActuadorRegistro(){
        return actuadorRegistroService.getAllActuadorRegistro();
    }

    @GetMapping("/{id}")
    public Optional<ActuadorRegistro> getActuadorRegistro(@PathVariable Long id){
        return actuadorRegistroService.getActuadorRegistro(id);
    }

    @PostMapping("/")
    public ActuadorRegistro addActuadorRegistro(@Validated @RequestBody ActuadorRegistro actuadorRegistro){
        return actuadorRegistroService.createActuadorRegistro(actuadorRegistro);
    }

    @PutMapping("/{id}")
    public ActuadorRegistro updateActuadorRegistro(@PathVariable Long id,
                                                   @Validated @RequestBody ActuadorRegistro actuadorRegistro){
        return actuadorRegistroService.updateActuadorRegistro(actuadorRegistro, id);
    }

    @DeleteMapping("/{id}")
    public void deleteActuadorRegistro(@PathVariable Long id){
        actuadorRegistroService.deleteActuadorRegistro(id);
    }

    @GetMapping("/timestamp/")
    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByTimestamp(@RequestParam("timestamp") Timestamp timestamp){
        return actuadorRegistroService.findActuadorRegistroByTimestamp(timestamp);
    }

    @GetMapping("/rangotimestamp/")
    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByTimstampBetween(@RequestParam("inicio")Timestamp start,
                                                                                       @RequestParam("final")Timestamp end){
        return actuadorRegistroService.findActuadorRegistroByTimstampBetween(start, end);
    }

    @GetMapping("/timestamp_aplicado/")
    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByTimestampAndAplicado(@RequestParam("timestamp")Timestamp timestamp,
                                                                                            @RequestParam("aplicado")Boolean aplicado){
        return actuadorRegistroService.findActuadorRegistroByTimestampAndAplicado(timestamp, aplicado);
    }

    @GetMapping("/valor/")
    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByValor(@RequestParam("valor")Boolean valor){
        return actuadorRegistroService.findActuadorRegistroByValor(valor);
    }

    @GetMapping("/idactuador/")
    public Optional<ArrayList<ActuadorRegistro>> findActuadorRegistroByIdActuador(@RequestParam("idactuador")Long id){
        return actuadorRegistroService.findActuadorRegistroByIdActuador(id);
    }
}
