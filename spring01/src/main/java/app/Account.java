package app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Data
public class Account {
    private Long id;
    private String number;
    private Currency currency;
    private Double balance;
    private final Customer customer;

    public Account(Currency currency, Customer customer) {
        this.currency = currency;
        this.customer = customer;
        this.number = UUID.randomUUID().toString();
    }
}
