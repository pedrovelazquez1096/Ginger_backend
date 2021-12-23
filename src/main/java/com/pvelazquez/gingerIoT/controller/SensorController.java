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

    @GetMapping("/sensores")
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

    @GetMapping("/nombre/")
    public Optional<ArrayList<Sensor>> getSensoresByNombre(@RequestParam("nombre")String nombre){
        return sensorService.findSensorByNombre(nombre);
    }

    @GetMapping("/descripcion/")
    public Optional<ArrayList<Sensor>> getSensorByDescripcion(@RequestParam("descripcion")String desc){
        return sensorService.findSensorByDescripcion(desc);
    }

    @GetMapping("/tiposensor/")
    public Optional<ArrayList<Sensor>> getSensorByTipoSensor(@RequestParam("tipo")String tipoSensor){
        return sensorService.findSensorByTipoSensor(tipoSensor);
    }

    @GetMapping("/ubicacion/")
    public Optional<ArrayList<Sensor>> getSensorByUbicacion(@RequestParam("ubicacion")String ubi){
        return sensorService.findSensorByUbicacion(ubi);
    }

    @GetMapping("/unidades/")
    public Optional<ArrayList<Sensor>> getSensorByUnidades(@RequestParam("unidades")String unidades){
        return sensorService.findSensorByUnidades(unidades);
    }

    @GetMapping("/nombre_descripcion/")
    public Optional<ArrayList<Sensor>> getSensorByNombreAndDescripcion(@RequestParam("nombre")String nombre,
                                                                        @RequestParam("descripcion")String desc){
        return sensorService.findSensorByNombreAndDescripcion(nombre, desc);
    }

    @GetMapping("/tipo_ubicacion")
    public Optional<ArrayList<Sensor>> getSensorByTipoSensorAndUbicacion(@RequestParam("tipo")String tipoSensor,
                                                                         @RequestParam("ubicacion")String ubicacion){
        return sensorService.findSensorByTipoSensorAndUbicacion(tipoSensor, ubicacion);
    }

    @GetMapping("/nombre_descripcionlike")
    public Optional<ArrayList<Sensor>> getSensorByNombreAndDescripcionLike(@RequestParam("nombre")String nombre,
                                                                           @RequestParam("descripcion")String desc){
        return sensorService.findSensorByNombreAndDescripcionLike(nombre, desc);
    }

}
