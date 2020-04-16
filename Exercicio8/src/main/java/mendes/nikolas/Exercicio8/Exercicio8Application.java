package mendes.nikolas.Exercicio8;

import mendes.nikolas.Exercicio8.dao.ClassDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nikolas
 * @since 16/04/2020 . 17:30
 * @version 1.0
 */
@SpringBootApplication
public class Exercicio8Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Exercicio8Application.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Objeto DAO: " + objectDAO1);
		System.out.println("Objeto JDBC: " + objectDAO1.getObjectJDBC());

		System.out.println("Objeto DAO: " + objectDAO2);
		System.out.println("Objeto JDBC: " + objectDAO2.getObjectJDBC());

	}

}
