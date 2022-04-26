package com.me.skiresortmanager.services;

import com.me.skiresortmanager.domains.Resort;
import com.me.skiresortmanager.domains.Slope;
import com.me.skiresortmanager.repositories.ResortRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResortService {

    private ResortRepo resortRepo;

    @Autowired
    public ResortService(ResortRepo resortRepo) {
        this.resortRepo = resortRepo;
    }

    public List<Resort> findAll(){
        return resortRepo.findAll();
    }
}
