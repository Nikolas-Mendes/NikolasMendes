package mendes.nikolas.Exercicio4;

import mendes.nikolas.Exercicio4.model.Games;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nikolas
 * @since 16/04/2020 16:32
 * @version 1.0
 */
@SpringBootApplication
public class Exercicio4Application {

	public static void main(String[] args) {

		SpringApplication.run(Exercicio4Application.class, args);

		Games games = new Games();

		games.setName("God of War");
		games.setCost(30.00);

		System.out.println(games.toString());
	}

}
