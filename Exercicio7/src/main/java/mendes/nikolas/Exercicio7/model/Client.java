package mendes.nikolas.Exercicio7.model;

import lombok.*;
import org.springframework.stereotype.Component;

/**
 * @author Nikolas
 * @since 16/04/2020 . 16:55
 * @version 1.0
 */
@Component
@Getter @Setter // O LOMBOK Não pega o Get e Set
//@AllArgsConstructor // deu pau nesse all tbm por causa do lombok
@ToString
public class Client {

    private String name;

    public Client() {
        System.out.println("Classe Cliente!");
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
