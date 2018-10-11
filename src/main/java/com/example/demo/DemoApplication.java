package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.entities.Roditelj;
import com.example.demo.entities.Role;
import com.example.demo.entities.Ucenik;
import com.example.demo.entities.User;
import com.example.demo.entities.Zaposleni;
import com.example.demo.repository.RoditeljRepository;
import com.example.demo.repository.RoleRepository;
import com.example.demo.repository.UcenikRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.ZaposleniRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private UcenikRepository ucenikRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ZaposleniRepository zaposleniRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		// Cleanup the tables
//		userRepository.deleteAllInBatch();
//		roleRepository.deleteAllInBatch();		
//		zaposleniRepository.deleteAllInBatch();
//		ucenikRepository.deleteAllInBatch();

        // =======================================

//		User user = new User();
//
//		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//		Date date = dateFormat.parse("17/07/1989");
//
//		user.setAdresa("Aleksandrovo");
//		user.setDisplay_name("StrahinjaJ");
//		user.setEmail("strahinja@gmail.com");
//		user.setGrad("Nis");
//		user.setIme("Strahinja");
//		user.setJMBG("123");
//		user.setLDAPCN("456");
//		user.setPassword("test123");
//		user.setPrezime("Pantovic");
//		user.setTelefon("555333");
//		user.setUsername("strahinja123");
//		user.setDatum_rodjenja(date);
//		
//		Role role = new Role();
//		role.setNaziv_role("student");
//		role.addUser(user);
//		
//		user.addRoles(role);
//		
//	    Zaposleni zaposleni = new Zaposleni();
//	
//		zaposleni.setBanka("KOMBANK");
//		zaposleni.setBroj_racuna("111222");
//		zaposleni.setPozicija("programer");
//	    zaposleni.setSSS("gimnazija");
//		zaposleni.setUser(user);
		
//		zaposleniRepository.save(zaposleni);
	}
}
