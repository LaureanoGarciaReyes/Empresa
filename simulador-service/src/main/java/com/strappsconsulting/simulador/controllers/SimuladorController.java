package com.strappsconsulting.simulador.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.simulador.api.SimuladorApi;
import com.strappsconsulting.simulador.model.SimuladorEstudianteIdTallerPost200Response;
import com.strappsconsulting.simulador.model.SimuladorEstudianteIdTallerPostRequest;
import com.strappsconsulting.simulador.model.SimuladorExternoIdTallerDelete200Response;
import com.strappsconsulting.simulador.model.SimuladorExternoIdTallerDelete200Response1;
import com.strappsconsulting.simulador.model.SimuladorExternoIdTallerDelete200Response2;
import com.strappsconsulting.simulador.model.SimuladorExternoIdTallerDelete200Response3;
import com.strappsconsulting.simulador.model.SimuladorExternoIdTallerDeleteRequest;
import com.strappsconsulting.simulador.model.SimuladorInternoIdTallerGet200Response;
import com.strappsconsulting.simulador.model.SimuladorInternoIdTallerGet200ResponseInner;
import com.strappsconsulting.simulador.model.SimuladorInternoIdTallerGetRequest;
import com.strappsconsulting.simulador.model.SimuladorPreguntaIdPreguntaDelete200Response;
import com.strappsconsulting.simulador.model.SimuladorPreguntaIdPreguntaDelete200Response1;
import com.strappsconsulting.simulador.model.SimuladorPreguntaIdPreguntaDeleteRequest;
import com.strappsconsulting.simulador.model.SimuladorPreguntaPost200Response;
import com.strappsconsulting.simulador.model.SimuladorPreguntaPostRequest;
import com.strappsconsulting.simulador.model.SimuladorResultadoIdPreguntaGet200Response;



@RestController
public class SimuladorController implements SimuladorApi{

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return SimuladorApi.super.getRequest();
	}

	@Override
	public ResponseEntity<SimuladorEstudianteIdTallerPost200Response> simuladorEstudianteIdTallerPost(String token,
			Integer idTaller, @Valid SimuladorEstudianteIdTallerPostRequest simuladorEstudianteIdTallerPostRequest) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorEstudianteIdTallerPost(token, idTaller, simuladorEstudianteIdTallerPostRequest);
	}

	@Override
	public ResponseEntity<SimuladorExternoIdTallerDelete200Response3> simuladorExternoIdTallerDelete(String token,
			Integer idTaller) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorExternoIdTallerDelete(token, idTaller);
	}

	@Override
	public ResponseEntity<SimuladorExternoIdTallerDelete200Response> simuladorExternoIdTallerGet(String token,
			Integer idTaller) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorExternoIdTallerGet(token, idTaller);
	}

	@Override
	public ResponseEntity<SimuladorExternoIdTallerDelete200Response2> simuladorExternoIdTallerPost(String token,
			Integer idTaller,
			@Valid SimuladorExternoIdTallerDelete200Response simuladorExternoIdTallerDelete200Response) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorExternoIdTallerPost(token, idTaller, simuladorExternoIdTallerDelete200Response);
	}

	@Override
	public ResponseEntity<SimuladorExternoIdTallerDelete200Response1> simuladorExternoIdTallerPut(String token,
			Integer idTaller, @Valid SimuladorExternoIdTallerDeleteRequest simuladorExternoIdTallerDeleteRequest) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorExternoIdTallerPut(token, idTaller, simuladorExternoIdTallerDeleteRequest);
	}

	@Override
	public ResponseEntity<List<SimuladorInternoIdTallerGet200ResponseInner>> simuladorInternoIdTallerGet(String token,
			Integer idTaller) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorInternoIdTallerGet(token, idTaller);
	}

	@Override
	public ResponseEntity<SimuladorInternoIdTallerGet200Response> simuladorInternoIdTallerPost(String token,
			Integer idTaller, @Valid SimuladorInternoIdTallerGetRequest simuladorInternoIdTallerGetRequest) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorInternoIdTallerPost(token, idTaller, simuladorInternoIdTallerGetRequest);
	}

	@Override
	public ResponseEntity<SimuladorPreguntaIdPreguntaDelete200Response1> simuladorPreguntaIdPreguntaDelete(String token,
			Integer idPregunta) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorPreguntaIdPreguntaDelete(token, idPregunta);
	}

	@Override
	public ResponseEntity<SimuladorPreguntaIdPreguntaDelete200Response> simuladorPreguntaIdPreguntaPut(String token,
			Integer idPregunta,
			@Valid SimuladorPreguntaIdPreguntaDeleteRequest simuladorPreguntaIdPreguntaDeleteRequest) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorPreguntaIdPreguntaPut(token, idPregunta, simuladorPreguntaIdPreguntaDeleteRequest);
	}

	@Override
	public ResponseEntity<SimuladorPreguntaPost200Response> simuladorPreguntaPost(String token,
			@Valid SimuladorPreguntaPostRequest simuladorPreguntaPostRequest) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorPreguntaPost(token, simuladorPreguntaPostRequest);
	}

	@Override
	public ResponseEntity<SimuladorResultadoIdPreguntaGet200Response> simuladorResultadoIdPreguntaGet(String token,
			Integer idPregunta) {
		// TODO Auto-generated method stub
		return SimuladorApi.super.simuladorResultadoIdPreguntaGet(token, idPregunta);
	}
	
	
	

}
