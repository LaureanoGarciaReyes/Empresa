package com.strappsconsulting.aulaVirtual.Controllers;


import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.aulaVirtual.api.UsuarioApi;
import com.strappsconsulting.aulaVirtual.model.IdSesionDto;
import com.strappsconsulting.aulaVirtual.model.IdTallerDto;

@RestController

public class AulaVirtualControllers implements UsuarioApi {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return UsuarioApi.super.getRequest();
	}

	@Override
	public ResponseEntity<IdSesionDto> idSesion(String token) {
		// TODO Auto-generated method stub
		return UsuarioApi.super.idSesion(token);
	}

	@Override
	public ResponseEntity<IdTallerDto> sesionesTaller(String token) {
		// TODO Auto-generated method stub
		return UsuarioApi.super.sesionesTaller(token);
	}
	
	
	
}
