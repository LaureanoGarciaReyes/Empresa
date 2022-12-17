package com.strappsconsulting.encuesta.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.encuesta.api.EncuestaApi;
import com.strappsconsulting.encuesta.model.EditaEncuestaDto;
import com.strappsconsulting.encuesta.model.EditaPreguntaDto;
import com.strappsconsulting.encuesta.model.NuevaEncuestaDto;
import com.strappsconsulting.encuesta.model.NuevaPreguntaDto;
import com.strappsconsulting.encuesta.model.RespuestaEditaEncuestaDto;
import com.strappsconsulting.encuesta.model.RespuestaEditaPreguntaDto;
import com.strappsconsulting.encuesta.model.RespuestaEliminaPreguntaDto;
import com.strappsconsulting.encuesta.model.RespuestaNuevaEncuestaDto;
import com.strappsconsulting.encuesta.model.RespuestaNuevaPreguntaDto;
import com.strappsconsulting.encuesta.model.RespuestaObtieneEncuestaDto;
import com.strappsconsulting.encuesta.service.EncuestaService;

@RestController
public class EncuestaController implements EncuestaApi {
	
	
	@Autowired
	private EncuestaService encuestaService;

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return EncuestaApi.super.getRequest();
	}

	@Override
	public ResponseEntity<RespuestaNuevaEncuestaDto> creaEncuesta(@Valid NuevaEncuestaDto nuevaEncuestaDto) {
		RespuestaNuevaEncuestaDto respuesta = encuestaService.creaEncuesta(nuevaEncuestaDto);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaNuevaPreguntaDto> creaPregunta(@Valid NuevaPreguntaDto nuevaPreguntaDto) {
		RespuestaNuevaPreguntaDto respuesta = encuestaService.creaPregunta(nuevaPreguntaDto);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaEditaEncuestaDto> editaEncuesta(@Valid EditaEncuestaDto editaEncuestaDto) {
		RespuestaEditaEncuestaDto respuesta = encuestaService.editaEncuesta(editaEncuestaDto);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaEditaPreguntaDto> editaPregunta(@Valid EditaPreguntaDto editaPreguntaDto) {
		RespuestaEditaPreguntaDto respuesta = encuestaService.editaPregunta(editaPreguntaDto);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaEliminaPreguntaDto> eliminaPregunta(String token, Integer idPregunta) {
		RespuestaEliminaPreguntaDto respuesta = encuestaService.eliminaPregunta(token, idPregunta);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaObtieneEncuestaDto> obtieneEncuesta(Integer idTaller) {
		RespuestaObtieneEncuestaDto respuesta = encuestaService.obtieneEncuesta(idTaller);
		return ResponseEntity.ok(respuesta);
	}

	
	

}
