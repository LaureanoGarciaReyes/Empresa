package com.strappsconsulting.taller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.strappsconsulting.taller.model.ActualizaTaller;
import com.strappsconsulting.taller.model.NuevoTaller;
import com.strappsconsulting.taller.model.RespuestaActualizaTaller;
import com.strappsconsulting.taller.model.RespuestaEliminaTaller;
import com.strappsconsulting.taller.model.RespuestaNuevoTaller;
import com.strappsconsulting.taller.model.RespuestaObtenerTalleres;
import com.strappsconsulting.taller.model.Taller;
import com.strappsconsulting.taller.repository.TallerRepository;

@Service
public class TallerService {
	
	@Autowired
	private TallerRepository tallerRespository;
	
	
	public RespuestaNuevoTaller crear(NuevoTaller nuevoTaller) {
		return this.tallerRespository.crear(nuevoTaller);
	}
    
	public RespuestaActualizaTaller actualizar(ActualizaTaller actualizaTaller) {
		return this.tallerRespository.actualizar(actualizaTaller);
	}
	

	public RespuestaEliminaTaller eliminaTaller(Long idTaller) {
		return this.tallerRespository.eliminaTaller(idTaller);
	}
	
	public List<Taller> filtrar(String idTaller) {
		return this.tallerRespository.filtrar(idTaller); 
	}
	
	public RespuestaObtenerTalleres obtener() {
		return this.tallerRespository.obtener();
	}
}




