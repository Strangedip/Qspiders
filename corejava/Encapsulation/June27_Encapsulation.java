// package Encapsulation;

public class June27_Encapsulation {
    public static void main(String[] args) {
        // person with NO name and acc balance
        Atm person1 = new Atm();

        // person with name and acc balance
        Atm person2 = new Atm("sandip", 200000);

        // Atm guy with name amount and code to open and enter money n atm
        Atm atmWala = new Atm("Strange", 40000, "Sheela");

        // person2.withdraw(1000000);

        // person1.withdraw(100);
        // person1.balance = 100;
        // person1.withdraw(100);
        // person1.printAccBal();
        // person1.checkAtmBal(0);

        // person2.withdraw(100);
        // person2.withdraw(100);
        // person2.printAccBal();
        // person2.checkAtmBal(0);

    }
}

class Atm {

    // show msg if no atm is out of money at start
    {
        if (Atm.atmBalance <= 0) {
            System.out.println("Out of money \n please try again later");
        }
    }

    // static and hidden atmBalance
    private static double atmBalance = 10000;

    // hidden code for verification of atm guy constructor
    private String code = "Sheela";

    // account balance for each individual
    double balance;

    // name for each individual
    String name = "Unknown";

    // empty constructor for new individual
    Atm() {
    }

    // constructor for individual with account and name
    Atm(String name, double amount) {
        this.balance = amount;
        this.name = name;
    }

    // contructor for atm guy
    Atm(String name, double amount, String code) {
        //naming and adding bal in atmbal if code is correct
        this.name = name;
        if (code == this.code) {
            Atm.atmBalance += amount;
            System.out.println("Rs." + amount + " added in the ATM");
            System.out.println("Atm's new balance is Rs." + atmBalance);
        } 
        else {
            System.out.println("incorrect code. Send Senior");
        }
    }

    // method to withdraw from individual bal if sufficient
    void withdraw(int amount) {
        if (balance >= amount) {
            if (checkAtmBal(amount)) {
                balance -= amount;
                Atm.atmBalance -= amount;
                inform(amount);  //informing deduction amount
                printAccBal();  // showing new balance
            } 
            else {
                System.out.println("Atm have insufficient balance");
            }
        } 
        else {
            System.out.println("Insufficiant Balance");
            printAccBal();
        }
    }

    void inform(double amount) {
        System.out.println("Rs." + amount + " has been deducted");
    }

    void printAccBal() {
        System.out.println(this.name + "'s account balance is Rs." + this.balance);
    }

    // hiddent atm money check function
    private boolean checkAtmBal(int amount) {
        if (Atm.atmBalance - amount < 0) {
            return false;
        }
        return true;
    }

}
