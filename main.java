import java.util.Scanner;

class ATM {
    Scanner sc = new Scanner(System.in);
    float balance;
    int pin = 5677;

    public void checkpin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you PIN");

        int enteredpin = sc.nextInt();

        if (enteredpin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid pin");
            checkpin();
        }

    }

    public void menu(){
            System.out.println("Enter your choice");
            System.out.println("1. Check A/C balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            int opt=sc.nextInt();

            switch (opt) {
                case 1:
                    checkbalance();
                    break;
                case 2:
                    Withdrawmoney();
                    break;
                case 3:
                    Depositmoney();
                    break; 
                case 4:
                    
                    return;       
            
                default:
                System.out.println("Invalid input");
                    break;
            }
    }

    public void checkbalance() {
        System.out.println("Balance is: " + balance);
        menu();

    }

    public void Withdrawmoney() {
        System.out.println("Enter amount to withdraw");
        int withdrawamt = sc.nextInt();

        if (withdrawamt < balance) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - withdrawamt;
            System.out.println("Money withdrawn successfully");
        }
        menu();
    }

    public void Depositmoney() {
        System.out.println("Enter amount to deposit");
        int depositamt = sc.nextInt();

        balance = balance + depositamt;
        System.out.println("Money deposited successfully");
        menu();
    }
}

public class main {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}