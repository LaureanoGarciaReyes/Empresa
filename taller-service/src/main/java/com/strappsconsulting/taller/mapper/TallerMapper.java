package com.strappsconsulting.taller.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.strappsconsulting.taller.model.ActualizaTaller;
import com.strappsconsulting.taller.model.NuevoTaller;
import com.strappsconsulting.taller.model.RespuestaActualizaTaller;
import com.strappsconsulting.taller.model.RespuestaEliminaTaller;
import com.strappsconsulting.taller.model.RespuestaNuevoTaller;
import com.strappsconsulting.taller.model.RespuestaObtenerTalleres;
import com.strappsconsulting.taller.model.Taller;

@Mapper
public interface TallerMapper {

	 RespuestaNuevoTaller crear(@Param("nuevoTaller")NuevoTaller nuevoTaller); 
    
	 RespuestaActualizaTaller actualizar(@Param("actualizaTaller")ActualizaTaller actualizaTaller); 

	 RespuestaEliminaTaller eliminaTaller(@Param("idTaller")Long idTaller); 
	
	 List<Taller> filtrar(@Param("idTaller")String idTaller); 
	
	 RespuestaObtenerTalleres obtener(); 
}