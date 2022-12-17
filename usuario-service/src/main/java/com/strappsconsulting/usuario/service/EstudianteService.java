package com.strappsconsulting.usuario.service;


import org.springframework.stereotype.Service;

import com.strappsconsulting.usuario.model.EditaUsuarioDto;
import com.strappsconsulting.usuario.model.NuevoUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaEditaUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaEliminaUsuarioDto;
import com.strappsconsulting.usuario.model.RespuestaFiltroUsuariosDto;
import com.strappsconsulting.usuario.model.RespuestaNuevoUsuarioDto;

@Service
public class EstudianteService {
	
public RespuestaNuevoUsuarioDto creaUsuario(NuevoUsuarioDto nuevoUsuarioDto) {
	return new RespuestaNuevoUsuarioDto();
}

public RespuestaEditaUsuarioDto editaUsuario(EditaUsuarioDto editaUsuarioDto) {
	return new RespuestaEditaUsuarioDto();
}

public RespuestaEliminaUsuarioDto eliminaUsuario(Integer idEstudiante) {
	return new RespuestaEliminaUsuarioDto();
}

public RespuestaFiltroUsuariosDto filtro(String nombre) {
	return new RespuestaFiltroUsuariosDto();
}


}
