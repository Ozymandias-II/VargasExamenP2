package ec.edu.espe.vargascorebancario.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientes")
@Data
@Builder
@TypeAlias("clientes")
public class Cliente {
    @Id
    private String id;

    private String cedula;

    private String NombreCompleto;

    private String estado;
}
