package mendes.nikolas.Exercicio6;

import mendes.nikolas.Exercicio6.interfaces.IProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author nikolas
 * @version 1.0
 * @since 16/04/2020 . 16:45
 */
@Component
public class Refri {

    @Autowired
    @Qualifier("coca")
    private IProduct iProduct;

    public void executar() {
        iProduct.merchan();
    }
}
