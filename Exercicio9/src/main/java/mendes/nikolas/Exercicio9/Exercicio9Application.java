package mendes.nikolas.Exercicio9;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Nikolas
 * @since 16/04/2020
 * @version 1.0
 */
@SpringBootApplication
@ComponentScan("externalclasses")
public class Exercicio9Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Exercicio9Application.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());
	}

}
