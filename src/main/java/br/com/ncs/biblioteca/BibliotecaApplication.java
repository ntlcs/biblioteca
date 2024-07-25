package br.com.ncs.biblioteca;

import br.com.ncs.biblioteca.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.com.ncs.literalura"})
public class BibliotecaApplication {

    @Autowired
    private Principal principal;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BibliotecaApplication.class, args);
        BibliotecaApplication app = context.getBean(BibliotecaApplication.class);
        app.run();
    }

    public void run() {
        principal.showMenu();
    }

}