package Service;

import Users.Account;

import java.util.List;

public interface BankService {
    List<Account> allAccounts ();
    Account getBalance (Account balance);
    Account takeMoney (Account money);
    Account putMoney (Account money);
    Account



}
