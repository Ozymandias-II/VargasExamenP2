package ec.edu.espe.vargascorebancario;

import ec.edu.espe.vargascorebancario.dao.CuentaRepository;
import ec.edu.espe.vargascorebancario.model.Cliente;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VargasCoreBancarioApplication {

    public static void main(String[] args) {
        SpringApplication.run(VargasCoreBancarioApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(CuentaRepository repository) {
        return args -> {
            Cliente client1 =
                    Cliente.builder().cedula("1722466420").NombreCompleto("David Reyes").estado("ACT").build();
            Cliente client2 =
                    Cliente.builder().cedula("1722466421").NombreCompleto("Richard Hendricks").estado("ACT").build();
            Cliente client3 =
                    Cliente.builder().cedula("1722466422").NombreCompleto("Erlich Bachman").estado("ACT").build();
            Cliente client4 =
                    Cliente.builder().cedula("1722466423").NombreCompleto("Jared Joestar").estado("ACT").build();
            Cliente client5 =
                    Cliente.builder().cedula("1722466424").NombreCompleto("Johnny Joestar").estado("ACT").build();
        };
    }

}
