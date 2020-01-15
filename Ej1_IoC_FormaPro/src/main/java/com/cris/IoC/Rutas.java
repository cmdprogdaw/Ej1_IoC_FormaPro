package com.cris.IoC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cris.IoC.almacenamiento.Almacenamiento;


@Controller
public class Rutas {

	@Autowired
	@Qualifier("profesorado")
	Almacenamiento profesorado;
	
	@Autowired
	@Qualifier("alumnado")
	Almacenamiento alumnado;

	
	
	@GetMapping("/almacenamientoProfesorado")
	@ResponseBody
	public String profesorado() {
		
		return "Path: "+profesorado.getPath()+"<br> Tamaño: "+profesorado.getTamanio();
	}
	
	@GetMapping("/almacenamientoAlumnado")
	@ResponseBody
	public String alumnado() {
		
		return "Path: "+alumnado.getPath()+"<br> Tamaño: "+alumnado.getTamanio();
	}
}
