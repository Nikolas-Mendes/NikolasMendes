package mendes.nikolas.Exercicio5tarde;

import mendes.nikolas.Exercicio5tarde.model.Pessoa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio5tardeApplication {

	public static void main(String[] args) {

		SpringApplication.run(Exercicio5tardeApplication.class, args);

		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Nikolas");

		System.out.println(pessoa.toString());
	}

}
