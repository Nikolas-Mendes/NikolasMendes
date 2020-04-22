package mendes.nikolas.Exercicio1Aula24.repository;

import mendes.nikolas.Exercicio1Aula24.model.ClientEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}

