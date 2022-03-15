import java.util.Scanner;
public class BankDemoTest {
    public static void main(String args[]){
        CheckingAccount A1 = new CheckingAccount();
        System.out.println("Enter amt to deposit");
        Scanner input = new Scanner(System.in);
        double deposit = input.nextDouble();
        A1.deposit(deposit);
        try{
            System.out.println("Enter amt to deposit");
            double withdrawl = input.nextDouble();
            A1.withdraw(withdrawl);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
    }
    
}
