package br.com.first.funcionario;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class FuncionarioApplication {
	
	@GetMapping
	public String getHome() {
		return "Gestao Funcionarios - API home";
	}

	public static void main(String[] args) {
		SpringApplication.run(FuncionarioApplication.class, args);
	}

}
