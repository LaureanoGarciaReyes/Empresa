package com.strappsconsulting.grupo.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.grupo.api.GrupoApi;
import com.strappsconsulting.grupo.model.ActualizaGrupoDto;
import com.strappsconsulting.grupo.model.GrupoDto;
import com.strappsconsulting.grupo.model.NuevoGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaActualizaGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaEliminaGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaNuevoGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaObtieneGruposDto;
import com.strappsconsulting.grupo.service.GrupoService;


@RestController
public class GrupoController implements GrupoApi {
	
	@Autowired
	private GrupoService grupoService;
	
	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return GrupoApi.super.getRequest();
	}

	@Override
	public ResponseEntity<RespuestaActualizaGrupoDto> actualiza(@Valid ActualizaGrupoDto actualizaGrupoDto) {
		RespuestaActualizaGrupoDto respuestaActualizaGrupoDto = grupoService.actualiza(actualizaGrupoDto);
		return ResponseEntity.ok(respuestaActualizaGrupoDto);
	}

	@Override
	public ResponseEntity<RespuestaNuevoGrupoDto> crear(@Valid NuevoGrupoDto nuevoGrupoDto) {
		RespuestaNuevoGrupoDto respuesta = grupoService.crear(nuevoGrupoDto);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaEliminaGrupoDto> elimina(Integer idGrupo) {
		RespuestaEliminaGrupoDto respuestaEliminaGrupoDto = grupoService.elimina(idGrupo);
		return ResponseEntity.ok(respuestaEliminaGrupoDto);
	}

	@Override
	public ResponseEntity<List<GrupoDto>> filtro(String idGrupo) {
		List<GrupoDto> respuestaGrupoDtos = grupoService.filtro(idGrupo);
		return ResponseEntity.ok(respuestaGrupoDtos);
	}

	@Override
	public ResponseEntity<RespuestaObtieneGruposDto> obtiene() {
		RespuestaObtieneGruposDto respuestaObtieneGruposDto = grupoService.obtiene();
		return ResponseEntity.ok(respuestaObtieneGruposDto);
	}

	

	

	

}
