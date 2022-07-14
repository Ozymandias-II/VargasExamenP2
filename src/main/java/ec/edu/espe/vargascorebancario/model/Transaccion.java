package ec.edu.espe.vargascorebancario.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Document(collection = "clientes")
@Data
@Builder
@TypeAlias("transacciones")
public class Transaccion {

    @Id
    private String id;

    private String codigoInterno;

    private Date fecha;

    private BigInteger cuentaOrigen;

    private BigInteger cuentaDestino;

    private BigDecimal valor;

    private String estado;
}
