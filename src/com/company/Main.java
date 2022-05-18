package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        BankAccount account1 = new BankAccount(123,2000,"victor tarus","victortarus@gmail.com",046514224);

        System.out.println(account1.getCustomerName() + " has a balance of:"+account1.getBalance() );
        account1.deposit(1100);
        account1.withdraw(3000);
        System.out.println(account1.getCustomerName() + " has a balance of:"+account1.getBalance() );
    }
}
