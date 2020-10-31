package client.servicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.cliente.ClienteDocente;
import client.dominio.DocenteDTO;
import client.utils.ResponseDTO;

@Service
public class DocenteServicio {
	
	@Autowired
	ClienteDocente clientebd;
	
	public Map<String, Object>listar(){
		
		Map<String, Object>model= new HashMap<>();
		
		try {
			
			ResponseDTO docenteList=clientebd.listar();
			model.put("docenteList", docenteList.getRespuesta());
			
		}catch(Exception e) {
			model.put("err", "error");
			model.put("msg", "Error al extraer los datos si el problema persiste contacte al admin");
			e.printStackTrace();
			
			
		}
		
		
		return model;
		
	}
	
	
	public Map<String, Object>crear(DocenteDTO docente){
		Map<String, Object>model = new HashMap<>();
		
		try {
			
			ResponseDTO res= clientebd.crear(docente);
			
			
		}catch(HttpStatusCodeException e) {
			
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
		
		return model;
		
	}
	
	
	
	public Map<String, Object>actualizar(DocenteDTO docente){
		Map<String, Object>model = new HashMap<>();
		try {
			ResponseDTO res= clientebd.actualizar(docente);
			
		}catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
			return model;
	
	}
	
	
	public Map<String, Object>borrar(Long id){
		Map<String, Object>model = new HashMap<>();
		
		try {
			
			clientebd.borrar(id);
			
			
		}catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
		}
		
		return model;
		
	}
	

}
