package com.example.demo.controllers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.ModeliPlacanjaIStipendije;
import com.example.demo.entities.SkolskaGodina;
import com.example.demo.service.SkolskaGodinaServiceImpl;

@Controller
public class SGController {

	@Autowired
	SkolskaGodinaServiceImpl skolskaGodinaRepository;

	@RequestMapping("/skolska_godina")
	public ModelAndView doSkolskaGodina() {
		ModelAndView mv = new ModelAndView("skolska_godina");
		mv.addObject("skolskaGodina", skolskaGodinaRepository.getAllSkolskaGodina());
		return mv;
	}

	@RequestMapping(value = "/saveSG", method = RequestMethod.POST)
	public ModelAndView doSave(@RequestParam("skolska_godina_ID") String skolska_godina_ID,
			@RequestParam("datum_pocetka") String datum_pocetka, @RequestParam("datum_kraja") String datum_kraja)
			throws ParseException {
		ModelAndView mv = new ModelAndView("redirect:/skolska_godina");
		SkolskaGodina sg;
		if (!skolska_godina_ID.isEmpty()) {
			sg = (SkolskaGodina) skolskaGodinaRepository.getSkolskaGodinaById(Integer.parseInt(skolska_godina_ID));
		} else {
			sg = new SkolskaGodina();
		}

		DateFormat df = new SimpleDateFormat("yyyy");

		Date date = df.parse(datum_kraja);
		java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
		
		sg.setDatum_pocetka(sqlStartDate);

		DateFormat df2 = new SimpleDateFormat("yyyy");

		Date date2 = df2.parse(datum_kraja);
		java.sql.Date sqlStartDate2 = new java.sql.Date(date2.getTime());

		sg.setDatum_kraja(sqlStartDate2);

		skolskaGodinaRepository.saveOrUpdate(sg);

		return mv;
	}

	@RequestMapping(value = "/viewSG/{id}", method = RequestMethod.GET)
	public ModelAndView doView(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("skolska_godina_view");
		mv.addObject("skolskaGodina", skolskaGodinaRepository.getSkolskaGodinaById(id));
		return mv;
	}

	@RequestMapping(value = "/deleteSG/{id}", method = RequestMethod.GET)
	public ModelAndView doDelete(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("redirect:/skolska_godina");
		skolskaGodinaRepository.deleteSkolskaGodina(id);
		return mv;
	}

	@RequestMapping(value = "/editSG/{id}", method = RequestMethod.GET)
	public ModelAndView doEdit(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("skolska_godina_edit");
		mv.addObject("skolskaGodina", skolskaGodinaRepository.getSkolskaGodinaById(id));
		return mv;
	}
}
