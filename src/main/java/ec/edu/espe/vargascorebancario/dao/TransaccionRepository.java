package ec.edu.espe.vargascorebancario.dao;

import ec.edu.espe.vargascorebancario.model.Transaccion;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransaccionRepository  extends MongoRepository<Transaccion, String> {

}
