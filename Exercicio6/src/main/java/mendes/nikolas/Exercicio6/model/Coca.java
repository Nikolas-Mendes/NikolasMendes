package mendes.nikolas.Exercicio6.model;

import mendes.nikolas.Exercicio6.interfaces.IProduct;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author nikolas
 * @version 1.0
 * @since 16/04/2020 . 16:45
 */
@Component
@Qualifier("coca")
public class Coca implements IProduct {

    @Override
    public void merchan() {
        System.out.println("Coca Cola com muito mais Gaizz");
    }
}
