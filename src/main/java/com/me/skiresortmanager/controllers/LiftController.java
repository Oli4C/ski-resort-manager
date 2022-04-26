package com.me.skiresortmanager.controllers;

import com.me.skiresortmanager.domains.Lift;

import com.me.skiresortmanager.services.LiftService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller

public class LiftController {
    
    private LiftService liftService;

    @Autowired
    public LiftController(LiftService liftService) {
        this.liftService = liftService;
    }


    @GetMapping(value = "/lifts")
    public String showAllLifts(Model model){
        model.addAttribute("lifts", liftService.findAll());

        return "lift";
    }

    @RequestMapping("lifts/findById")
    @ResponseBody
    public Lift findLiftById(Long id) {
        return liftService.findById(id);
    }

    @PostMapping(value = "lifts/addNew")
    public String addNew(Lift lift) {

        liftService.save(lift);
        return "redirect:/lifts";
    }

    @RequestMapping(value="lifts/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateLift (Lift lift) {

        liftService.update(lift);
        return "redirect:/lifts";
    }

    @RequestMapping(value="lifts/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteLift(Long id) {
        liftService.delete(id);
        return "redirect:/lifts";
    }

}
