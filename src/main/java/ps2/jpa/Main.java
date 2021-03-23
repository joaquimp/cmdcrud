package ps2.jpa;

import java.util.Optional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;

import ps2.jpa.entity.Titular;
import ps2.jpa.repository.TitularRepo;
import static ps2.utils.ES.*;

@SpringBootApplication
public class Main 
  implements CommandLineRunner {

    @Autowired
    private TitularRepo titularRepo;
    
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) {
        print("\n## GERENCIADOR DE TITULARES ##");
        
        print("\n## FIM DO PROGRAMA! ##");
    }
}
