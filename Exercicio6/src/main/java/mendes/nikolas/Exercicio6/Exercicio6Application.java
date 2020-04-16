package mendes.nikolas.Exercicio6;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nikolas
 * @version 1.0
 * @since 16/04/2020 . 16:45
 */
@SpringBootApplication
public class Exercicio6Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(Exercicio6Application.class, args);

		Refri refri = applicationContext.getBean(Refri.class);
		refri.executar();
	}
}
