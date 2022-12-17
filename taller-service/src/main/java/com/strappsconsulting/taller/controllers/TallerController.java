package com.strappsconsulting.taller.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.taller.api.TallerApi;
import com.strappsconsulting.taller.model.ActualizaTaller;
import com.strappsconsulting.taller.model.NuevoTaller;
import com.strappsconsulting.taller.model.RespuestaActualizaTaller;
import com.strappsconsulting.taller.model.RespuestaEliminaTaller;
import com.strappsconsulting.taller.model.RespuestaNuevoTaller;
import com.strappsconsulting.taller.model.RespuestaObtenerTalleres;
import com.strappsconsulting.taller.model.Taller;
import com.strappsconsulting.taller.service.TallerService;

@RestController
public class TallerController implements TallerApi{
	
	@Autowired
	private TallerService tallerService;

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return TallerApi.super.getRequest();
	}

	@Override
	public ResponseEntity<RespuestaActualizaTaller> actualizar(@Valid ActualizaTaller actualizaTaller) {
		RespuestaActualizaTaller respuesta = tallerService.actualizar(actualizaTaller);
		return ResponseEntity.ok(respuesta);
	}
	
	@Override
	public ResponseEntity<RespuestaNuevoTaller> crear(@Valid NuevoTaller nuevoTaller) {
		RespuestaNuevoTaller respuesta = tallerService.crear(nuevoTaller);
		return ResponseEntity.ok(respuesta);
	}

	
	@Override
	public ResponseEntity<RespuestaEliminaTaller> eliminaTaller(Long idTaller) {
		RespuestaEliminaTaller respuesta = tallerService.eliminaTaller(idTaller);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<List<Taller>> filtrar(String idTaller) {
		List<Taller> respuesta = tallerService.filtrar(idTaller);
		return ResponseEntity.ok(respuesta);
	}


	@Override
	public ResponseEntity<RespuestaObtenerTalleres> obtener() {
		RespuestaObtenerTalleres respuesta = tallerService.obtener();
		return ResponseEntity.ok(respuesta);
	}

	
	
}
