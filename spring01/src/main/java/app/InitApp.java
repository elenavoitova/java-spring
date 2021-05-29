package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InitApp {

    public static void main(String[] args) {
        SpringApplication.run(InitApp.class, args);

        Customer k = new Customer.builder();
       Account a = new Account(Currency.EUR, k);

       // System.out.println(a);
    }

}
