package com.aw.api.os.apirest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.support.RequestHandledEvent;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

	
	@Bean
		public Docket usuarioApi() {
			return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(RequestHandlerSelectors.basePackage("com.aw.api.os.apirest"))
					.paths(regex("/api.*"))
					.build()
					.apiInfo(metaInfo());		
	}
	
	
		private ApiInfo metaInfo() {
			ApiInfo apiInfo = new ApiInfo(
					"Usuarios Api REST",
					"Api REST de cadastro de produtos.",
					"1.0",
					"Terms of Service",
					new Contact("Fernando X.", "Https://www.youtube.com/fernando",
							"fernando@gmail.com"),
					"Apache License Version 2.0",
					"https://www.apache.org/licese.html", new ArrayList<VendorExtension>()
					);
			
			return apiInfo;
			
		}
	
	
}
