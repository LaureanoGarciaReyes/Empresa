package com.strappsconsulting.calendario.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.calendario.api.UsuarioApi;
import com.strappsconsulting.calendario.model.CalendarioDto;
import com.strappsconsulting.calendario.model.FechasDto;



@RestController
public class CalendarioController implements UsuarioApi {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return UsuarioApi.super.getRequest();
	}

	@Override
	public ResponseEntity<CalendarioDto> obtenerCalendario(String token) {
		// TODO Auto-generated method stub
		return UsuarioApi.super.obtenerCalendario(token);
	}

	@Override
	public ResponseEntity<FechasDto> obtenerFechas(String token) {
		// TODO Auto-generated method stub
		return UsuarioApi.super.obtenerFechas(token);
	}


	
}
