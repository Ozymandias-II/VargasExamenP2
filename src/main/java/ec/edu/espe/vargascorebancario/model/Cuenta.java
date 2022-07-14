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
@TypeAlias("cuentas")
public class Cuenta {

    @Id
    private String id;

    private BigInteger codigoInterno;

    private String idCliente;

    private BigDecimal saldo;

    private Date fechaUltimoMovimiento;

    private String estado;

}
