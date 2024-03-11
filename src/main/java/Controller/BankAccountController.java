package Controller;

import Service.BankService;
import Users.Account;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/api/v3/accounts")
@AllArgsConstructor
public class BankAccountController {
    private final BankService service;

    @GetMapping
    public List<Account> allAccounts() {
        //todo
        return service.allAccounts();
}
    @PostMapping("save_student")
    public String name(@RequestBody Student student) {
        service.saveStudent(student);
        return "Student successfully saved";
    }

    @GetMapping("/{email}")
    public Student findByEmail(@PathVariable String email) {
        return service.findByEmail(email);
    }
    // /api/v1/students/oleg12@gmail.com

    @PutMapping("update_student")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("delete_student/{email}")
    public void deleteStudent(@PathVariable String email) {
        service.deleteStudent(email);
    }
}
