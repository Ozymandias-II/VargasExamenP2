package ec.edu.espe.vargascorebancario.dao;

import ec.edu.espe.vargascorebancario.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository  extends MongoRepository<Cliente, String> {
}
