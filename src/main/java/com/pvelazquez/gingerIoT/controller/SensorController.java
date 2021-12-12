package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.Sensor;
import com.pvelazquez.gingerIoT.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Version;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.HEAD,
        RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.TRACE})
@RequestMapping("/api/sensor")
public class SensorController {
    @Autowired
    SensorService sensorService;

    @GetMapping("/")
    public ArrayList<Sensor> getAllSensor(){
        return sensorService.getAllSensor();
    }

    @GetMapping("/{id}")
    public Optional<Sensor> getSensor(@PathVariable Long id){
        return sensorService.getSensor(id);
    }

    @PostMapping()
    public Sensor addSensor(@Validated @RequestBody Sensor sensor){
        return sensorService.createSensor(sensor);
    }

    @PutMapping("/{id}")
    public Sensor updateSensor(@PathVariable Long id, @Validated @RequestBody Sensor sensor){
        return sensorService.updateSensor(sensor, id);
    }

    @DeleteMapping("/{id}")
    public void deleteSensorById(@PathVariable Long id){
        sensorService.deleteSensor(id);
    }

    @GetMapping("/nombre")
    public Optional<ArrayList<Sensor>> getSensoresByNombre(@RequestParam("nombre")String nombre){
        return sensorService.findSensorByNombre(nombre);
    }
}
