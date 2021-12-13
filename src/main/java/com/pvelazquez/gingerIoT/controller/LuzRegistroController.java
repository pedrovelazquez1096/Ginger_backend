package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.LuzRegistro;
import com.pvelazquez.gingerIoT.service.LuzRegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.sql.ClientInfoStatus;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,
        RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.HEAD,
        RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.TRACE})
@RequestMapping("/api/luzregistro")
public class LuzRegistroController {
    @Autowired
    LuzRegistroService luzRegistroService;

    @GetMapping("/")
    public ArrayList<LuzRegistro> getAllLuzRegistro(){
        return luzRegistroService.getAllLuzRegistro();
    }

    @GetMapping("/{id}")
    public Optional<LuzRegistro> getLuzRegistro(@PathVariable Long id){
        return luzRegistroService.getLuzRegistro(id);
    }

    @PostMapping("/")
    public LuzRegistro createLuzRegistro(@Validated @RequestBody LuzRegistro luzRegistro){
        return luzRegistroService.createLuzRegistro(luzRegistro);
    }

    @PutMapping("/{id}")
    public LuzRegistro updateLuzRegistro(@PathVariable Long id, @Validated @RequestBody LuzRegistro luzRegistro){
        return luzRegistroService.updateLuzRegistro(luzRegistro, id);
    }

    @DeleteMapping("/{id}")
    public int deleteLuzRegistroById(@PathVariable Long id){
        try{
            luzRegistroService.deleteLuzRegistro(id);
            return 0;
        }catch (Exception ex){
            return -1;
        }
    }

    @GetMapping("/timestamp_aplicado/")
    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByTimestampAndAplicado(@RequestParam("timestamp")Timestamp timestamp, @RequestParam("aplicado")Boolean aplicado){
        return luzRegistroService.getLuzRegistroByTimestampAndAplicado(timestamp,aplicado);
    }

    @GetMapping("/timestamp/")
    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByTimestamp(@RequestParam("timestamp")Timestamp timestamp){
        return luzRegistroService.getLuzRegistroByTimestamp(timestamp);
    }

    @GetMapping("/rangotimestamp/")
    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByTimestampBetween(@RequestParam("inicio")Timestamp start,@RequestParam("final")Timestamp end){
        return luzRegistroService.getLuzRegistroByTimestampBetween(start, end);
    }

    @GetMapping("/valor/")
    public Optional<ArrayList<LuzRegistro>> getLuzRegistroByValor(@RequestParam("valor")String valor){
        return  luzRegistroService.getLuzRegistroByValor(valor);
    }

    @GetMapping("/idluz/")
    public Optional<ArrayList<LuzRegistro>> findLuzByIdLuz(@RequestParam("id")Long id){
        return luzRegistroService.getLuzByIdLuz(id);
    }
}
