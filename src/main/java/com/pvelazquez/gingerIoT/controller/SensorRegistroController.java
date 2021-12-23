package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.SensorRegistro;
import com.pvelazquez.gingerIoT.service.SensorRegistroService;
import com.pvelazquez.gingerIoT.service.SensorService;
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
@RequestMapping("/api/sensorregistro")
public class SensorRegistroController {
    @Autowired
    SensorRegistroService sensorRegistroService;

    @GetMapping("/registros")
    public ArrayList<SensorRegistro> getAllSensorRegistro(){
        return sensorRegistroService.getAllSensorRegistro();
    }

    @GetMapping("/{id}")
    public Optional<SensorRegistro> getSensorRegistro(@PathVariable Long id){
        return sensorRegistroService.getSensorRegistro(id);
    }

    @PostMapping("/")
    public SensorRegistro addSensorRegistro(@Validated @RequestBody SensorRegistro sensorRegistro){
        return sensorRegistroService.createSensorRegistro(sensorRegistro);
    }

    @PutMapping("/{id}")
    public SensorRegistro updateSensorRegistro(@PathVariable Long id, @Validated @RequestBody SensorRegistro sensorRegistro){
        return sensorRegistroService.updateSensorRegistro(sensorRegistro,id);
    }

    @DeleteMapping("/{id}")
    public void deleteSensorRegistro(@PathVariable Long id){
        sensorRegistroService.deleteSensorRegistro(id);
    }

    @GetMapping("/timestamp_aplicado/")
    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByTimestampAndAplicado(@RequestParam("timestamp")Timestamp timestamp,
                                                                                        @RequestParam("aplicado") Boolean aplicado){
        return sensorRegistroService.findSensorRegistroByTimestampAndAplicado(timestamp, aplicado);
    }

    @GetMapping("/rangotimestamp/")
    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByTimestampBetween(@RequestParam("inicio")Timestamp a,
                                                                                    @RequestParam("final")Timestamp b){
        return sensorRegistroService.findSensorRegistroByTimestampBetween(a,b);
    }

    @GetMapping("/timestamp/")
    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByTimestamp(@RequestParam("timestamp")Timestamp timestamp){
        return sensorRegistroService.findSensorRegistroByTimestamp(timestamp);
    }

    @GetMapping("/valor/")
    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByValor(@RequestParam("valor")Float valor){
        return sensorRegistroService.findSensorRegistroByValor(valor);
    }

    @GetMapping("/idsensor/")
    public Optional<ArrayList<SensorRegistro>> findSensorRegistroByIdSensor(@RequestParam("id")Long id){
        return sensorRegistroService.findSensorRegistroByIdSensor(id);
    }
}
