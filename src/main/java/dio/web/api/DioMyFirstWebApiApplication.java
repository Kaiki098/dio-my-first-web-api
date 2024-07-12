package dio.web.api;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Title - Rest API",
		version = "1.0",
		description = "API exemplo de uso de Springboot REST API",
		contact = @Contact(
				name = "Seu nome",
				url = "http://www.seusite.com.br",
				email = "voce@seusite.com.br"
		),
		termsOfService = "Termo de uso: Open Source",
		license = @License(
				name = "Licença - Sua Empresa",
				url = "http://www.seusite.com.br"
		)
))
public class DioMyFirstWebApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DioMyFirstWebApiApplication.class, args);
	}

}
