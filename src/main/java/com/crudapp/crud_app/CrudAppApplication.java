package com.crudapp.crud_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@SpringBootApplication
//@EnableAutoConfiguration
//@ComponentScan("com.crudapp.crud_app.repository")
public class CrudAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudAppApplication.class, args);
		System.out.println("Hello");
	}

/*	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.paths(PathSelectors.ant("/vendor"))
				.apis(RequestHandlerSelectors.basePackage("com.crudapp.crud_app"))
				.build()
				.apiInfo();
	}

	private ApiInfo apiCustomData() {
		return new ApiInfo(
				"Vendor API Application",
				"Vendor API Documentation",
		)
	}
 */

}
