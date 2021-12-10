package com.pvelazquez.gingerIoT.service;

import com.pvelazquez.gingerIoT.model.Luz;
import com.pvelazquez.gingerIoT.repositories.LuzRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LuzService {
    @Autowired
    LuzRepository luzRepository;

    public ArrayList<Luz> getAllLuz(){
        ArrayList<Luz> luces = new ArrayList<Luz>();
        try{
            luces = (ArrayList<Luz>)luzRepository.findAll();
        }catch (Exception ex){

        }
        return luces;
    }

    public Luz createLuz(Luz luz){
        Luz luz1 = null;
        try {
            luz1 = luzRepository.save(luz);
        }catch (Exception ex){

        }
        return luz1;
    }
}
