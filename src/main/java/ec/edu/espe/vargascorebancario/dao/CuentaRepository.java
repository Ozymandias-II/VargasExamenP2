package ec.edu.espe.vargascorebancario.dao;

import ec.edu.espe.vargascorebancario.model.Cuenta;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface CuentaRepository  extends MongoRepository<Cuenta, String> {
    Optional<Cuenta> findByCodigoInterno(BigInteger condigoInterno);
}
