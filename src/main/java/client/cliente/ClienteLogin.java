package client.cliente;



import java.util.Map;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(url="http://localhost:8081", name="Login")
public interface ClienteLogin {
	
	@GetMapping(path="/basicauth", produces="application/json")
		Map<String,Object> Login(@RequestHeader ("Authorization") String authorization);
		

}
