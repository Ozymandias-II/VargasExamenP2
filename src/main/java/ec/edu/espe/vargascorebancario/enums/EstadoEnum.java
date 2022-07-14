package ec.edu.espe.vargascorebancario.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EstadoEnum {

    EJECUTADO("EJE", "Ejecutado"),
    BLOQUEADO("BLO", "Bloqueado");

    private final String value;
    private final String text;
}
