package dar.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PostCoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostCoreApiApplication.class, args);
	}

}
