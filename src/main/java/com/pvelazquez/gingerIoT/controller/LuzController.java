package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.Luz;
import com.pvelazquez.gingerIoT.service.LuzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,
                RequestMethod.DELETE, RequestMethod.PUT, RequestMethod.HEAD,
                RequestMethod.OPTIONS, RequestMethod.PATCH, RequestMethod.TRACE})
@RequestMapping("/api/luz")
public class LuzController {
    @Autowired
    LuzService luzService;

    @GetMapping("/")
    public ArrayList<Luz> getAllLuces(){
        return luzService.getAllLuz();
    }

    @GetMapping("/{id}")
    public Optional<Luz> getLuz(@PathVariable Long id){
        return luzService.getLuz(id);
    }

    @PostMapping()
    public Luz addLuz(@Validated @RequestBody Luz luz){
        return luzService.createLuz(luz);
    }

    @PutMapping("/{id}")
    public Luz updateLuz(@PathVariable Long id, @Validated @RequestBody Luz luz){
        return luzService.updateLuz(luz,id);
    }

    @DeleteMapping("/{id}")
    public void deleteLuzById(@PathVariable Long id){
        luzService.deleteLuzById(id);
    }

    // /api/luz/nombre?nombre=hola
    @GetMapping("/nombre/")
    public Optional<ArrayList<Luz>> getLucesByNombre(@RequestParam("nombre")String nombre){
        return luzService.findLuzByNombre(nombre);
    }

    @GetMapping("/description/")
    public Optional<ArrayList<Luz>> getLucesByDescripcion(@RequestParam("descripcion")String descripcion){
        return luzService.findLuzByDescripcion(descripcion);
    }

    @GetMapping("/tipoluz/")
    public Optional<ArrayList<Luz>> getLuzByTipoLuz(@RequestParam("tipo")String tipo){
        return luzService.findLuzByTipoLuz(tipo);
    }

    @GetMapping("/ubicacion/")
    public Optional<ArrayList<Luz>> getLuzByUbicacion(@RequestParam("ubicacion")String ubi){
        return luzService.findLuzByUbicacion(ubi);
    }

    @GetMapping("/unidades/")
    public Optional<ArrayList<Luz>> getLuzByUnidades(@RequestParam("unidades")String unidades){
        return luzService.findLuzByUnidades(unidades);
    }

    @GetMapping("/nombre_descripcion/")
    public Optional<ArrayList<Luz>> getLuzByNombreAndDescripcion(@RequestParam("nombre")String nombre, @RequestParam("descripcion")String descripcion){
        return luzService.findLuzByNombreAndDescripcion(nombre, descripcion);
    }

    @GetMapping("/tipoluz_ubicacion/")
    public Optional<ArrayList<Luz>> getLuzByTipoLuzAndUbicacion(@RequestParam("tipo")String tipo,@RequestParam("ubicacion")String ubi){
        return luzService.findLuzByTipoLuzAndUbicacion(tipo, ubi);
    }

    @GetMapping("/nombre_descripcionlike/")
    public Optional<ArrayList<Luz>> getLuzByNombreAndDescripcionLike(@RequestParam("nombre")String nombre, @RequestParam("descripcion")String descripcion){
        return luzService.findLuzByNombreAndDescripcionLike(nombre, descripcion);
    }
}
