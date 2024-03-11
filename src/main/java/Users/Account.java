package Users;

import lombok.Data;
import lombok.Generated;
import org.apache.catalina.User;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table (name = "Accounts")
public class Account {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Integer balance;
    private List transaction;
    private LocalDate dateTransaction;




}
