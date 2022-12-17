package com.strappsconsulting.material.controllers;


import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;

import com.strappsconsulting.material.api.EstudianteApi;
import com.strappsconsulting.material.model.DescargarMaterialDto;
import com.strappsconsulting.material.model.InformaciondeMaterialDto;
import com.strappsconsulting.material.model.ObtieneInformacionDto;
import com.strappsconsulting.material.model.RespuestaMaterialEstudianteDto;


@Controller
public class MaterialEstudianteControllers implements EstudianteApi {

	@Override
	public Optional<NativeWebRequest> getRequest() {
		// TODO Auto-generated method stub
		return EstudianteApi.super.getRequest();
	}

	@Override
	public ResponseEntity<DescargarMaterialDto> descargarMaterial(String token) {
		// TODO Auto-generated method stub
		return EstudianteApi.super.descargarMaterial(token);
	}

	@Override
	public ResponseEntity<InformaciondeMaterialDto> informaciondeMaterial(String token) {
		// TODO Auto-generated method stub
		return EstudianteApi.super.informaciondeMaterial(token);
	}

	@Override
	public ResponseEntity<RespuestaMaterialEstudianteDto> materialEstudiante(String token, String idTaller) {
		// TODO Auto-generated method stub
		return EstudianteApi.super.materialEstudiante(token, idTaller);
	}

	@Override
	public ResponseEntity<ObtieneInformacionDto> obtieneInformacion(String token) {
		// TODO Auto-generated method stub
		return EstudianteApi.super.obtieneInformacion(token);
	}

	
}
