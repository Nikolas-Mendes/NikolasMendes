package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Nikolas
 * @since 16/04/2020
 * @version 1.0
 */
@Component
@Getter @Setter // Não esta funcionando por causa do lombok
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
