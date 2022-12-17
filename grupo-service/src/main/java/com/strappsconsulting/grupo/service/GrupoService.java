package com.strappsconsulting.grupo.service;



import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.strappsconsulting.grupo.model.ActualizaGrupoDto;
import com.strappsconsulting.grupo.model.GrupoDto;
import com.strappsconsulting.grupo.model.NuevoGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaActualizaGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaEliminaGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaNuevoGrupoDto;
import com.strappsconsulting.grupo.model.RespuestaObtieneGruposDto;


@Service
public class GrupoService {
	
	
	public RespuestaNuevoGrupoDto crear(NuevoGrupoDto nuevoGrupoDto) {
		return new RespuestaNuevoGrupoDto();
	}

	
	public RespuestaActualizaGrupoDto actualiza(ActualizaGrupoDto actualizaGrupoDto) {
		return new RespuestaActualizaGrupoDto();
	}
	
	public RespuestaEliminaGrupoDto elimina(Integer idGrupo) {
		return new RespuestaEliminaGrupoDto();
	}
	
	
	public List<GrupoDto> filtro(String idGrupo){
		return new ArrayList<GrupoDto>();
	}
	
	public RespuestaObtieneGruposDto obtiene() {
		return new RespuestaObtieneGruposDto();
	}


}
