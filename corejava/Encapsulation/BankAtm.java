// package Encapsulation;

public class BankAtm{
    public static void main(String[] args) {
        AtmMachine u1=new AtmMachine();
        u1.withdraw(100);
        // u1.viewBalance();  will produce error due to private specifier
    }
}

class AtmMachine{
    private int balance=200000;

    void withdraw(int amount){
        this.balance-=amount;
        System.out.println(amount +" has withdrawn");
    }

    //hidden method 
    private void viewBalance(){
        System.out.println("Balance is "+balance );
    }
}

