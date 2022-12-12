package projetoweb.webservices.resourses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetoweb.webservices.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	public UserResource() {
		
	}
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "1155889933", "12345");
		return ResponseEntity.ok().body(u);
	}

}
