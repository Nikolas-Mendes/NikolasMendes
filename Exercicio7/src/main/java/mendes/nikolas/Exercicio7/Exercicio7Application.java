package mendes.nikolas.Exercicio7;

import mendes.nikolas.Exercicio7.dao.ClientDAO;
import mendes.nikolas.Exercicio7.model.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Nikolas
 * @since 16/04/2020 . 16:55
 * @version 1.0
 */
@SpringBootApplication
public class Exercicio7Application {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Exercicio7Application.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Nikolas Mendes"));

		System.out.println("Objeto ClienteDAO: " + clientDAO);
		System.out.println("Objeto Cliente: " + clientDAO.getClient());
	}
}
