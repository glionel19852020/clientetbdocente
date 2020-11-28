package client.controlador;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.User;
import client.servicio.LoginServicio;


@Controller
@RequestMapping(value = { "/", "/login" })
public class LoginControlador {
	
	@Autowired
	LoginServicio loginServicio;
	
	
	@GetMapping
	public String returnlogin(Model model) {
		model.addAttribute("Login", new User());
		return "Login";
		
	}
	
	@PostMapping
	public String Ingresar(@RequestParam("username") String username, @RequestParam("password")String password) {
		Map<String,Object>resultado = new HashMap<>();
		resultado = loginServicio.SendCredenciales(username, password);
			
			if (resultado.size() > 0) {
				
				return "redirect:/home";	
			
			}else {
				
				return "redirect:/";
				
			}
		
		
		
	}
	

}
