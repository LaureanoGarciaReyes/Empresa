
package com.strappsconsulting.usuario.controllers;


import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.usuario.api.EstudianteApi;
import com.strappsconsulting.usuario.model.EditaUsuarioDto;
import com.strappsconsulting.usuario.model.NuevoUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaEditaUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaEliminaUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaFiltroUsuariosDto;
import com.strappsconsulting.usuario.model.RespuestaNuevoUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaObtenerPerfilDto;
import com.strappsconsulting.usuario.model.RespuestaTallerEstudianteInnerDto;
import com.strappsconsulting.usuario.service.EstudianteService;



@RestController
public class EstudianteController implements EstudianteApi {

	@Autowired
	private EstudianteService estudianteService;
	
	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return EstudianteApi.super.getRequest();
	}
    
	@Override
	public ResponseEntity<RespuestaNuevoUsuarioDto> creaUsuario(@Valid NuevoUsuarioDto nuevoUsuarioDto) {
		RespuestaNuevoUsuarioDto respuesta = estudianteService.creaUsuario(nuevoUsuarioDto);
		return ResponseEntity.ok(respuesta);
	}
        
	@Override
	public ResponseEntity<RespuestaEditaUsuarioDto> editaUsuario(@Valid EditaUsuarioDto editaUsuarioDto) {
		RespuestaEditaUsuarioDto respuesta = estudianteService.editaUsuario(editaUsuarioDto);
		return ResponseEntity.ok(respuesta);
	}
    
	@Override
	public ResponseEntity<RespuestaEliminaUsuarioDto> eliminaUsuario(Integer idEstudiante) {
		RespuestaEliminaUsuarioDto respuesta = estudianteService.eliminaUsuario(idEstudiante);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaFiltroUsuariosDto> filtro(String nombre) {
		RespuestaFiltroUsuariosDto respuesta = estudianteService.filtro(nombre);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaObtenerPerfilDto> obtenerPerfil(String token) {
		// TODO Auto-generated method stub
		return EstudianteApi.super.obtenerPerfil(token);
	}

	@Override
	public ResponseEntity<List<RespuestaTallerEstudianteInnerDto>> tallerEstudiante(String token) {
		// TODO Auto-generated method stub
		return EstudianteApi.super.tallerEstudiante(token);
	}

	

}

