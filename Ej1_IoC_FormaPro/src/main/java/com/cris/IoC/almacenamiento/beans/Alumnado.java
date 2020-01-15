package com.cris.IoC.almacenamiento.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cris.IoC.almacenamiento.Almacenamiento;

@Component
@Qualifier("alumnado")
public class Alumnado implements Almacenamiento{

	@Override
	public String getPath() {
		
		return "/ficheros/alumnado";
	}

	@Override
	public float getTamanio() {

		return 0.1f;
	}

}
