package ns.example.batch5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Batch5Application {

	public static void main(String[] args) {
		SpringApplication.run(Batch5Application.class, args);
	}

}
