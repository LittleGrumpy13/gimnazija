package com.example.demo.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Cenovnik;
import com.example.demo.entities.ModeliPlacanjaIStipendije;
import com.example.demo.entities.Role;
import com.example.demo.entities.SkolskaGodina;
import com.example.demo.repository.CenovnikRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.CenovnikService;
import com.example.demo.service.CenovnikServiceImpl;
import com.example.demo.service.ModeliPlacanjaIStipendijeServiceImpl;
import com.example.demo.service.SkolskaGodinaServiceImpl;

@Controller
public class UserController {

	@Autowired
    CenovnikServiceImpl cenovnikRepository;
	
	@Autowired
	ModeliPlacanjaIStipendijeServiceImpl modeliRepository;
	
	@Autowired
	SkolskaGodinaServiceImpl skolskaGodinaRepository;
	
    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("lists", cenovnikRepository.getAllCenovnik());
        
        List<SkolskaGodina> godine = skolskaGodinaRepository.getAllSkolskaGodina();
        mv.addObject("godine", godine);
        
        List<ModeliPlacanjaIStipendije> models = modeliRepository.getAllModeliPlacanjaIStipendije();
        mv.addObject("models", models);
        
        return mv;
    }
    
    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("cenovnik_ID") String cenovnik_ID, @RequestParam("cena_stavke") String cena_stavke,
    	@RequestParam("naziv_stavke") String naziv_stavke, @RequestParam("sifra") String sifra, @RequestParam("valuta") String valuta,
    	@RequestParam("date_created") String date_created, @RequestParam("created_by") String created_by, @RequestParam("date_modified") String date_modified,
    	@RequestParam("modified_by") String modified_by, @RequestParam("model_placanja_ID") String model_placanja_ID,
    	@RequestParam("skolska_godina_ID") String skolska_godina_ID)throws ParseException{
        ModelAndView mv = new ModelAndView("redirect:/");
        Cenovnik cenovnik;
        if(!cenovnik_ID.isEmpty()){
        	cenovnik =(Cenovnik)cenovnikRepository.getCenovnikById(Integer.parseInt(cenovnik_ID));
        } else {
        	cenovnik = new Cenovnik();
        }
        
        cenovnik.setCena_stavke(Float.parseFloat(cena_stavke));
        cenovnik.setSifra(Integer.parseInt(sifra));
        
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date = df.parse(date_created);
        java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());  
        
        cenovnik.setDate_created(sqlStartDate);
        cenovnik.setCreated_by(Integer.parseInt(created_by));
        
        DateFormat dm = new SimpleDateFormat("dd/MM/yyyy");
        
        Date date2 = dm.parse(date_modified);
        java.sql.Date sqlStartDate2 = new java.sql.Date(date2.getTime());  
        
        cenovnik.setDate_modified(sqlStartDate2);
        cenovnik.setModified_by(Integer.parseInt(modified_by));
        cenovnik.setNaziv_stavke(naziv_stavke);
        cenovnik.setValuta(valuta);
        
        cenovnik.setModeli(modeliRepository.getModeliPlacanjaIStipendijeById(Integer.parseInt(model_placanja_ID)));
        cenovnik.setSkolskaGodina(skolskaGodinaRepository.getSkolskaGodinaById(Integer.parseInt(skolska_godina_ID)));
        
        cenovnikRepository.saveOrUpdate(cenovnik);
        return mv;
    }
    
    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists", cenovnikRepository.getCenovnikById(id));
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        cenovnikRepository.deleteCenovnik(id);
        return mv;
    }

    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists", cenovnikRepository.getCenovnikById(id));
        return mv;
    }
}
