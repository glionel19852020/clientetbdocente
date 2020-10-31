package client.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import client.dominio.DocenteDTO;
import client.servicio.DocenteServicio;

@Controller
@RequestMapping("/docente")
public class DocenteControlador {
	@Autowired
	DocenteServicio servicioDocente;
	
	@GetMapping
	public String list(Model vista) {
		Map<String, Object> modelo= new HashMap<>();
		modelo=(servicioDocente.listar());
		vista.addAttribute("docentes",modelo.get("docenteList"));
		return "Docente";
		
	}
	
	@GetMapping("/crear")
	public String redirectcrear(Model model) {
		model.addAttribute("crearDocente",new DocenteDTO());
		return "CrearDocente";
		
	}
	
	@PostMapping
	public String crear(@ModelAttribute ("crearDocente")DocenteDTO docente) {
		servicioDocente.crear(docente);
		return "redirect:/docente";	
	}
	
	@GetMapping("/actualizar")
	public String redirectact(Model model) {
		model.addAttribute("actDocente", new DocenteDTO());
		return "ActDocente";		
	}
	
	
	@PostMapping("/update")
	public String actualizar(@ModelAttribute ("actDocente")DocenteDTO docente) {
		servicioDocente.actualizar(docente);
		return "redirect:/docente";
	}
	
	
	@PostMapping("/delete/{id}")
	public String borrar(@PathVariable("id") Long id) {
		servicioDocente.borrar(id);
		return "redirect:/docente";	
	}
	

}
