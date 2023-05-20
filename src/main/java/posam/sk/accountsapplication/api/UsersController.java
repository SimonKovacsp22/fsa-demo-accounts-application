package posam.sk.accountsapplication.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import posam.sk.accountsapplication.domain.User;
import posam.sk.accountsapplication.domain.UserRepository;



@RestController
public class UsersController {

	@Autowired
	private UserRepository userRepository;

    @RequestMapping("/usersall")
    public @ResponseBody Iterable<User> getAllUsers() {

		return userRepository.findAll();
	}

	@RequestMapping("/userbyemail/{email}")
	public User getUserByEmail(
        @PathVariable(value = "email") String email)
    {
        return userRepository.findByEmail(email);
    }

	@RequestMapping("/userbyid/{id}")
	public User getUserByIdl(
        @PathVariable(value = "id") int id)
    {
        return userRepository.findById(id);
    }
}
