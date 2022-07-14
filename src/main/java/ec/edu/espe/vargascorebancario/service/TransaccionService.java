package ec.edu.espe.vargascorebancario.service;

import ec.edu.espe.vargascorebancario.dao.ClienteRepository;
import ec.edu.espe.vargascorebancario.dao.CuentaRepository;
import ec.edu.espe.vargascorebancario.dao.TransaccionRepository;
import ec.edu.espe.vargascorebancario.model.Cliente;
import ec.edu.espe.vargascorebancario.model.Cuenta;
import ec.edu.espe.vargascorebancario.model.Transaccion;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;

@Service
public class TransaccionService {

    private static final String BASE_URL = "http://localhost:8081/";

    private final RestTemplate restTemplate;

    private final TransaccionRepository transaccionRepository;

    private final ClienteRepository clienteRepository;

    private final CuentaRepository cuentaRepository;


    public TransaccionService(TransaccionRepository transaccionRepository, ClienteRepository clienteRepository, CuentaRepository cuentaRepository){

        this.restTemplate = new RestTemplate(getClientHttpRequestFactory());
        this.transaccionRepository = transaccionRepository;
        this.clienteRepository = clienteRepository;
        this.cuentaRepository = cuentaRepository;
    }


    public Cliente validarTransaccion(Transaccion transaccion){
        Cuenta cuentaOrigen = this.cuentaRepository.findByCodigoInterno(transaccion.getCuentaOrigen()).get();
        Cuenta cuentaDestino = this.cuentaRepository.findByCodigoInterno(transaccion.getCuentaDestino()).get();
        Cliente clienteOrigen = this.clienteRepository.findById(cuentaOrigen.getIdCliente()).get();
        Cliente clienteDestino = this.clienteRepository.findById(cuentaDestino.getIdCliente()).get();
        BigDecimal valor = new BigDecimal("1000.00");
        Integer compare = transaccion.getValor().compareTo(valor);

        if(compare > 1){
            return clienteDestino;
        }

        return null;

    }

//    private Transaccion ejecutarTransaccion(Transaccion transaccion){
//
//    }

    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
        int connectTimeout = 5000;
        int readTimeout = 5000;
        clientHttpRequestFactory.setConnectTimeout(connectTimeout);
        clientHttpRequestFactory.setReadTimeout(readTimeout);
        return clientHttpRequestFactory;
    }
}
