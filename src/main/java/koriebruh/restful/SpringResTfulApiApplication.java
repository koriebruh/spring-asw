package koriebruh.restful;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("koriebruh.restful.entity")
public class SpringResTfulApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringResTfulApiApplication.class, args);
	}

}
