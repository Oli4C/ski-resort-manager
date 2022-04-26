package com.me.skiresortmanager.services;

import com.me.skiresortmanager.Exceptions.SlopeNotFoundException;
import com.me.skiresortmanager.domains.Slope;
import com.me.skiresortmanager.repositories.SlopeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class SlopeService {
    private SlopeRepo slopeRepo;

    @Autowired
    public SlopeService(SlopeRepo slopeRepo) {
        this.slopeRepo = slopeRepo;
    }


    //Find All Slopes
    public List<Slope> findAll(){
        return slopeRepo.findAll();
    }

    //Find Slope By ID
    public Slope findById(Long id) {
        return slopeRepo.findById(id).orElseThrow(()-> new SlopeNotFoundException("Slope by id " + id + "was not found"));
    }

    //Save Slope
    @Transactional
    public Slope save(Slope slope) {
        return slopeRepo.save(slope);
    }

    //Update Slope
    @Transactional
    public Slope update(Slope slope) {
        return slopeRepo.save(slope);
    }


    //Delete Slope
    @Transactional
    public void delete(Long id) {
        slopeRepo.deleteById(id);
    }
}
