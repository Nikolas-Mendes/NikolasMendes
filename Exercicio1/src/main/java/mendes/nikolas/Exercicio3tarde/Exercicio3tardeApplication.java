package mendes.nikolas.Exercicio3tarde;

import mendes.nikolas.Exercicio3tarde.model.Animal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class Exercicio3tardeApplication {

	public static void main(String[] args) {

		SpringApplication.run(Exercicio3tardeApplication.class, args);

		Animal animal = new Animal();

		animal.setNome("Cachorro");

		System.out.println(animal.toString());
	}
}
