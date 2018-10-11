package com.example.demo.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Cenovnik;
import com.example.demo.entities.ModeliPlacanjaIStipendije;
import com.example.demo.service.ModeliPlacanjaIStipendijeServiceImpl;

@Controller
public class ModelController {

	@Autowired
	ModeliPlacanjaIStipendijeServiceImpl modeliRepository;
	
	@RequestMapping("/modeli_placanja")
    public ModelAndView doModel(){
        ModelAndView mv = new ModelAndView("modeli_placanja");
        mv.addObject("models", modeliRepository.getAllModeliPlacanjaIStipendije());
        
        return mv;
    }
	
	@RequestMapping( value = "/saveModel", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("model_placanja_ID") String model_placanja_ID, @RequestParam("naziv_modela") String naziv_modela,
    	@RequestParam("opis") String opis, @RequestParam("popust") String popust, @RequestParam("kamata") String kamata,
    	@RequestParam("zatezna_kamata") String zatezna_kamata){
        ModelAndView mv = new ModelAndView("redirect:/modeli_placanja");
        ModeliPlacanjaIStipendije model;
        if(!model_placanja_ID.isEmpty()){
        	model =(ModeliPlacanjaIStipendije)modeliRepository.getModeliPlacanjaIStipendijeById(Integer.parseInt(model_placanja_ID));
        } else {
        	model = new ModeliPlacanjaIStipendije();
        }
        
        model.setKamata(Double.parseDouble(kamata));
        model.setNaziv_modela(naziv_modela);
        model.setOpis(opis);
        model.setPopust(Double.parseDouble(popust));
        model.setZatezna_kamata(Double.parseDouble(zatezna_kamata));
        
        modeliRepository.saveOrUpdate(model);
        
        return mv;
    }
    
    @RequestMapping( value = "/viewModel/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("modeli_placanja_view");
        mv.addObject("models", modeliRepository.getModeliPlacanjaIStipendijeById(id));
        return mv;
    }

    @RequestMapping( value = "/deleteModel/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/modeli_placanja");
        modeliRepository.deleteModeliPlacanjaIStipendije(id);
        return mv;
    }

    @RequestMapping( value = "/editModel/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("modeli_placanja_edit");
        mv.addObject("models", modeliRepository.getModeliPlacanjaIStipendijeById(id));
        
        return mv;
    }
}
