package ec.edu.espe.vargascorebancario.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Builder
public class TransaccionDTO {
    private String codigoInterno;

    private Date fecha;

    private BigInteger cuentaOrigen;

    private BigInteger cuentaDestino;

    private BigDecimal valor;

    private String estado;
}
