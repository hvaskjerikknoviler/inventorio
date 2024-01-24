package struts.inventorio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "struts.inventorio.entities")
@EnableJpaRepositories(basePackages = "struts.inventorio.repositories")
public class InventorioApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorioApplication.class, args);
	}

}
