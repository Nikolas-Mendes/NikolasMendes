package mendes.nikolas.Exercicio7.dao;

import lombok.Getter;
import lombok.Setter;
import mendes.nikolas.Exercicio7.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Nikolas
 * @since 16/04/2020 . 16:55
 * @version 1.0
 */
@Component
@Getter @Setter // GET e SET ta dando pau por causa do lombok
public class ClientDAO {

    @Autowired
    private Client client;

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @PostConstruct
    public void postConstructor() {
        System.out.println("Objeto Criado!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Objeto Finalizado!");
    }

}
