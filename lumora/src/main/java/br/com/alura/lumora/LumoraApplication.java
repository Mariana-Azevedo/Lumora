package br.com.alura.lumora;


import br.com.alura.lumora.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LumoraApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(LumoraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
