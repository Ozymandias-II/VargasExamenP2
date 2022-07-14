package ec.edu.espe.vargascorebancario.resource;

import ec.edu.espe.vargascorebancario.model.Cliente;
import ec.edu.espe.vargascorebancario.model.Transaccion;
import ec.edu.espe.vargascorebancario.service.TransaccionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/transaccion")
public class transaccionResource {

    public final TransaccionService service;

    @GetMapping(path = "/validarCliente")
    public ResponseEntity<Cliente> validarCliente(Transaccion transaccion){
        try{
            return ResponseEntity.ok(this.service.validarTransaccion(transaccion));
        }catch (NullPointerException e){
            e.printStackTrace();
            return ResponseEntity.badRequest().build();
        }
    }
}
