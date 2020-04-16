package mendes.nikolas.Exercicio5;

import mendes.nikolas.Exercicio5.model.Marvel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nikolas
 * @since 16/04/2020 . 16:35
 * @version 1.0
 */
@SpringBootApplication
public class Exercicio5Application {

	public static void main(String[] args) {

		SpringApplication.run(Exercicio5Application.class, args);

		Marvel marvel = new Marvel();

		marvel.setHero("Iron Man");
		marvel.setAge(50);

		System.out.println(marvel.toString());
	}

}
