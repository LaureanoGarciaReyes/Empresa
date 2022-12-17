package com.strappsconsulting.encuesta.service;



import org.springframework.stereotype.Service;

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

@Service
public class EncuestaService {
	
	
	public RespuestaNuevaEncuestaDto creaEncuesta(NuevaEncuestaDto nuevaEncuestaDto) {
		return new RespuestaNuevaEncuestaDto();
	}
	
	public RespuestaNuevaPreguntaDto creaPregunta(NuevaPreguntaDto nuevaPreguntaDto) {
		return new RespuestaNuevaPreguntaDto();
	}
	
	public RespuestaEditaEncuestaDto editaEncuesta(EditaEncuestaDto editaEncuestaDto) {
		return new RespuestaEditaEncuestaDto();
	}
	
	public RespuestaEditaPreguntaDto editaPregunta(EditaPreguntaDto editaPreguntaDto) {
		return new RespuestaEditaPreguntaDto();
	}
	
	public RespuestaEliminaPreguntaDto eliminaPregunta(String token, Integer idPregunta) {
		return new RespuestaEliminaPreguntaDto();
	}
	
	public RespuestaObtieneEncuestaDto obtieneEncuesta(Integer idTaller) {
		return new RespuestaObtieneEncuestaDto();
	}
	
	
	
	}
