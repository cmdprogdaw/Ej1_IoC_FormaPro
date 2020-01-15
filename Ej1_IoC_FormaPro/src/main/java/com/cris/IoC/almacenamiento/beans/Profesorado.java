package com.cris.IoC.almacenamiento.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cris.IoC.almacenamiento.Almacenamiento;

@Component
@Qualifier("profesorado")
public class Profesorado implements Almacenamiento{

	@Override
	public String getPath() {
	
		return "/ficheros/profesorado";
	}

	@Override
	public float getTamanio() {
	
		return 2;
	}

}
