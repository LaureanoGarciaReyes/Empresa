package com.strappsconsulting.usuario.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.usuario.api.InstructorApi;
import com.strappsconsulting.usuario.model.EditaInstructorDto;
import com.strappsconsulting.usuario.model.InstructorFotoGet200ResponseDto;
import com.strappsconsulting.usuario.model.InstructorPerfilGet200Response1Dto;
import com.strappsconsulting.usuario.model.InstructorPerfilGet200ResponseDto;
import com.strappsconsulting.usuario.model.InstructorPerfilGetRequestDto;
import com.strappsconsulting.usuario.model.NuevoInstructorDto;
import com.strappsconsulting.usuario.model.RespuestaEditaInstructorDto;
import com.strappsconsulting.usuario.model.RespuestaEliminaInstructorDto;
import com.strappsconsulting.usuario.model.RespuestaFiltroDto;
import com.strappsconsulting.usuario.model.RespuestaNuevoInstructorDto;
import com.strappsconsulting.usuario.model.RespuestaObtieneInstructoresDto;


@RestController
public class InstructorController implements InstructorApi {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return InstructorApi.super.getRequest();
	}


	

	@Override
	public ResponseEntity<RespuestaNuevoInstructorDto> creaInstructor(@Valid NuevoInstructorDto nuevoInstructorDto) {
		// TODO Auto-generated method stub
		return InstructorApi.super.creaInstructor(nuevoInstructorDto);
	}




	@Override
	public ResponseEntity<RespuestaEditaInstructorDto> editaInstructor(@Valid EditaInstructorDto editaInstructorDto) {
		// TODO Auto-generated method stub
		return InstructorApi.super.editaInstructor(editaInstructorDto);
	}




	@Override
	public ResponseEntity<RespuestaEliminaInstructorDto> eliminaInstructor(Integer token, Integer idInstructor) {
		// TODO Auto-generated method stub
		return InstructorApi.super.eliminaInstructor(token, idInstructor);
	}




	@Override
	public ResponseEntity<RespuestaFiltroDto> filtro(String nombre) {
		// TODO Auto-generated method stub
		return InstructorApi.super.filtro(nombre);
	}



	@Override
	public ResponseEntity<RespuestaObtieneInstructoresDto> obtieneInstructores(String token) {
		// TODO Auto-generated method stub
		return InstructorApi.super.obtieneInstructores(token);
	}




	@Override
	public ResponseEntity<Resource> instructorFotoGet(String token) {
		// TODO Auto-generated method stub
		return InstructorApi.super.instructorFotoGet(token);
	}

	@Override
	public ResponseEntity<InstructorFotoGet200ResponseDto> instructorFotoPatch(String token, Resource body) {
		// TODO Auto-generated method stub
		return InstructorApi.super.instructorFotoPatch(token, body);
	}

	@Override
	public ResponseEntity<InstructorPerfilGet200ResponseDto> instructorPerfilGet(String token) {
		// TODO Auto-generated method stub
		return InstructorApi.super.instructorPerfilGet(token);
	}

	@Override
	public ResponseEntity<InstructorPerfilGet200Response1Dto> instructorPerfilPut(String token,
			@Valid InstructorPerfilGetRequestDto instructorPerfilGetRequestDto) {
		// TODO Auto-generated method stub
		return InstructorApi.super.instructorPerfilPut(token, instructorPerfilGetRequestDto);
	}

	

	
	

}
