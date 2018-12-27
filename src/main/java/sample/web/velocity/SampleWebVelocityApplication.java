package sample.web.velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MainWebAppInitializer.class)
public class SampleWebVelocityApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SampleWebVelocityApplication.class, args);
	}

}
