package com.strappsconsulting.material.service;


import org.springframework.stereotype.Service;

import com.strappsconsulting.material.model.NuevoMaterialDto;
import com.strappsconsulting.material.model.RespuestaEliminaMaterialDto;
import com.strappsconsulting.material.model.RespuestaNuevoMaterialDto;
import com.strappsconsulting.material.model.RespuestaObtieneMaterialDto;

@Service
public class MaterialService {

	
	public RespuestaNuevoMaterialDto creaMaterial(NuevoMaterialDto nuevoMaterialDto) {
		return new RespuestaNuevoMaterialDto();
		
	}
	
	public RespuestaEliminaMaterialDto eliminaMaterial(Integer id) {
		return new RespuestaEliminaMaterialDto();
	}
	
	public RespuestaObtieneMaterialDto obtieneMaterial(String token, Integer idGrupo) {
		return new RespuestaObtieneMaterialDto();
	}
}
