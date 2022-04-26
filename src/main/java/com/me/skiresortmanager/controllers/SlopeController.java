package com.me.skiresortmanager.controllers;

import com.me.skiresortmanager.domains.Difficulty;
import com.me.skiresortmanager.domains.Lift;
import com.me.skiresortmanager.domains.Resort;
import com.me.skiresortmanager.domains.Slope;
import com.me.skiresortmanager.services.LiftService;
import com.me.skiresortmanager.services.ResortService;
import com.me.skiresortmanager.services.SlopeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class SlopeController {

    private ResortService resortService;
   private LiftService liftService;
    private SlopeService slopeService;

    @Autowired
    public SlopeController(ResortService resortService, LiftService liftService, SlopeService slopeService) {
        this.resortService = resortService;
        this.liftService = liftService;
        this.slopeService = slopeService;
    }




    @GetMapping(value = "slopes")
    public String showAllSlopes(Model model){
        model.addAttribute("slopes", slopeService.findAll());
        model.addAttribute("difficulty", Difficulty.values());
        List<Lift> lifts = liftService.findAll();
        model.addAttribute("lifts", lifts );
        List<Resort> resorts = resortService.findAll();
        model.addAttribute("resorts", resorts );

        return "slope";
    }

    @RequestMapping("slopes/findById")
    @ResponseBody
    public Slope findSlopeById(Long id) {
        return slopeService.findById(id);
    }

    @PostMapping(value = "slopes/addNew")
    public String addNew(Slope slope) {

        slopeService.save(slope);
        return "redirect:/slopes";
    }

    @RequestMapping(value="slopes/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update (Slope slope) {

        slopeService.update(slope);
        return "redirect:/slopes";
    }

    @RequestMapping(value="slopes/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteSlope(Long id) {
        slopeService.delete(id);
        return "redirect:/slopes";
    }

}
