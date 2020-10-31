package client.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.DocenteDTO;
import client.utils.ResponseDTO;

@FeignClient(url="http://192.168.1.9:8090", name="docente")
public interface ClienteDocente {
	
	@GetMapping(path="/docente", produces="application/json")
	ResponseDTO listar();
	
	@PostMapping(path="/docente", produces="application/json")
	ResponseDTO crear(@RequestBody DocenteDTO docente);
	
	@PutMapping(path="/docente", produces="application/json")
	ResponseDTO actualizar(@RequestBody DocenteDTO docente);
	
	@DeleteMapping(path="/docente/{id}", produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
	
	
	
	

}
