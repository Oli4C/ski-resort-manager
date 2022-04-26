package com.me.skiresortmanager.services;

import com.me.skiresortmanager.Exceptions.LiftNotFoundException;
import com.me.skiresortmanager.domains.Lift;
import com.me.skiresortmanager.repositories.LiftRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class LiftService {


    private LiftRepo liftRepo;

    @Autowired
    public LiftService(LiftRepo liftRepo) {
        this.liftRepo = liftRepo;
    }


    //Find All Lifts
    public List<Lift> findAll(){
        return liftRepo.findAll();
    }

    //Find Lift By ID
    public Lift findById(Long id) {
        return liftRepo.findById(id).orElseThrow(()-> new LiftNotFoundException("Lift by id " + id + "was not found"));
    }

    //Save Lift
    @Transactional
    public Lift save(Lift lift) {
     return liftRepo.save(lift);
    }

    //Update Lift
    @Transactional
    public Lift update(Lift lift) {
        return liftRepo.save(lift);
    }


    //Delete Lift
    @Transactional
    public void delete(Long id) {
         liftRepo.deleteById(id);
    }


}
