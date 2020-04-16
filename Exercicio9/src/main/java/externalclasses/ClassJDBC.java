package externalclasses;

import net.minidev.json.JSONUtil;
import org.springframework.stereotype.Component;

/**
 * @author Nikolas
 * @since 16/04/2020
 * @version 1.0
 */
@Component
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("Conexão JDBC!");
    }

}
