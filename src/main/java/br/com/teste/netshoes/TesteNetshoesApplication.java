package br.com.teste.netshoes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class TesteNetshoesApplication extends SpringBootServletInitializer{
	
	@Override 
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(TesteNetshoesApplication.class);
    }
	
    public static void main(String[] args) {
        SpringApplication.run(TesteNetshoesApplication.class, args);
    }
}
