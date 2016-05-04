package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        final ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's see what's in here");
        for (String name : ctx.getBeanDefinitionNames()) {
            System.out.println(name);
        }

    }
}
