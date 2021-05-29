package app;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Builder
@Data
@AllArgsConstructor
public class Customer {
    private Long id;
    private String name;
    private String email;
    private Integer age;
    private List<Account> accounts = new ArrayList<>();
}
