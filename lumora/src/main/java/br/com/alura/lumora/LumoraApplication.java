package br.com.alura.lumora;

import br.com.alura.lumora.model.DadosSerie;
import br.com.alura.lumora.services.ConsumoApi;
import br.com.alura.lumora.services.ConverteDados;
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
		ConsumoApi consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=70c6f823");
		System.out.println(json);
		ConverteDados converteDados = new ConverteDados();

		DadosSerie dados = converteDados.obterDados(json, DadosSerie.class);

		System.out.println(dados);
	}
}
