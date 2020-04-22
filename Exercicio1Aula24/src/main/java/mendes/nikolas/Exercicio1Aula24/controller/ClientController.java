package mendes.nikolas.Exercicio1Aula24.controller;

import mendes.nikolas.Exercicio1Aula24.model.ClientEntity;
import mendes.nikolas.Exercicio1Aula24.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientController {

    @Autowired
    private ClientRepository clientRepository;

    @GetMapping
    public ResponseEntity<List<ClientEntity>> findAll() {
        return new ResponseEntity<List<ClientEntity>>((List<ClientEntity>) this.clientRepository.findAll(), new HttpHeaders(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ClientEntity> findById(@PathVariable("id") long id) {
        if(this.clientRepository.findById(id).isPresent()) {
            return new ResponseEntity<ClientEntity>(this.clientRepository.findById(id).get(), new HttpHeaders(), HttpStatus.OK);
        }
        return new ResponseEntity<ClientEntity>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ClientEntity> store(@RequestBody ClientEntity clientEntity) {
        return new ResponseEntity<ClientEntity>(this.clientRepository.save(clientEntity), new HttpHeaders(), HttpStatus.CREATED);
    }

    @DeleteMapping(value = "/{id}")
        public ResponseEntity<ClientEntity> delete(@PathVariable("id") long id) {
        this.clientRepository.deleteById(id);
        return new ResponseEntity<ClientEntity>(new HttpHeaders(), HttpStatus.OK);
    }
}
