package com.strappsconsulting.material.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;
import com.strappsconsulting.material.api.AdministradorApi;
import com.strappsconsulting.material.model.NuevoMaterialDto;
import com.strappsconsulting.material.model.RespuestaEliminaMaterialDto;
import com.strappsconsulting.material.model.RespuestaNuevoMaterialDto;
import com.strappsconsulting.material.model.RespuestaObtieneMaterialDto;
import com.strappsconsulting.material.service.MaterialService;

@RestController
public class MaterialController implements AdministradorApi  {
	
	@Autowired
	private MaterialService materialService;
	

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return AdministradorApi.super.getRequest();
	}

	@Override
	public ResponseEntity<RespuestaNuevoMaterialDto> creaMaterial(@Valid NuevoMaterialDto nuevoMaterialDto) {
		RespuestaNuevoMaterialDto respuesta = materialService.creaMaterial(nuevoMaterialDto);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaEliminaMaterialDto> eliminaMaterial(Integer id) {
		RespuestaEliminaMaterialDto respuesta = materialService.eliminaMaterial(id);
		return ResponseEntity.ok(respuesta);
	}

	@Override
	public ResponseEntity<RespuestaObtieneMaterialDto> obtieneMaterial(String token, Integer idGrupo) {
		RespuestaObtieneMaterialDto respuesta = materialService.obtieneMaterial(token, idGrupo);
		return ResponseEntity.ok(respuesta);
	}

}
