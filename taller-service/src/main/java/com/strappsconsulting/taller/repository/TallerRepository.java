package com.strappsconsulting.taller.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.strappsconsulting.taller.mapper.TallerMapper;
import com.strappsconsulting.taller.model.ActualizaTaller;
import com.strappsconsulting.taller.model.NuevoTaller;
import com.strappsconsulting.taller.model.RespuestaActualizaTaller;
import com.strappsconsulting.taller.model.RespuestaEliminaTaller;
import com.strappsconsulting.taller.model.RespuestaNuevoTaller;
import com.strappsconsulting.taller.model.RespuestaObtenerTalleres;
import com.strappsconsulting.taller.model.Taller;

@Repository
public class TallerRepository {
	
	@Autowired
	private TallerMapper tallerMapper;
	
	
	public RespuestaNuevoTaller crear(NuevoTaller nuevoTaller) {
		return this.tallerMapper.crear(nuevoTaller);
	}
    
	public RespuestaActualizaTaller actualizar(ActualizaTaller actualizaTaller) {
		return this.tallerMapper.actualizar(actualizaTaller);
	}
	

	public RespuestaEliminaTaller eliminaTaller(Long idTaller) {
		return this.tallerMapper.eliminaTaller(idTaller);
	}
	
	public List<Taller> filtrar(String idTaller) {
		return this.tallerMapper.filtrar(idTaller); 
	}
	
	public RespuestaObtenerTalleres obtener() {
		return this.tallerMapper.obtener();
	}
	
	
}
