package mendes.nikolas.Exercicio8.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Nikolas
 * @since 16/04/2020 . 17:30
 * @version 1.0
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Getter @Setter // Get e Set ta dando erro por causa do Lombok
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;

    public ClassJDBC getObjectJDBC() {
        return objectJDBC;
    }

    public void setObjectJDBC(ClassJDBC objectJDBC) {
        this.objectJDBC = objectJDBC;
    }
}
