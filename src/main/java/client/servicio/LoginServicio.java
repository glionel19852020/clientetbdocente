package client.servicio;


import java.util.HashMap;
import java.util.Map;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.HttpStatusCodeException;

import client.cliente.ClienteLogin;
import client.utils.ResponseDTO;

@Service
public class LoginServicio {

	
	@Autowired
	ClienteLogin clienteLogin;
	
	public Map<String,Object>SendCredenciales(String username,String password){
		Map<String, Object> model = new HashMap<>();
		
		try {
			byte[] credenciales = Base64Utils.encode((username + ":" + password).getBytes());
			model = clienteLogin.Login("Basic " + new String(credenciales));
				
		}catch(HttpStatusCodeException e) {
			model.put("msg", ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
			
		}
		return model;
		
		
	}
	
	
	
	
	
	
}
