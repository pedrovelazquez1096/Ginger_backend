package com.pvelazquez.gingerIoT.controller;

import com.pvelazquez.gingerIoT.model.Luz;
import com.pvelazquez.gingerIoT.service.LuzService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/api/luces")
public class LuzController {
    @Autowired
    LuzService luzService;

    @GetMapping()
    public ArrayList<Luz> getAllLuces(){
        return luzService.getAllLuz();
    }

    @PostMapping()
    public Luz addLuz(@RequestBody Luz luz){
        return luzService.createLuz(luz);
    }
}
