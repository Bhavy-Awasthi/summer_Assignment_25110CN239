
import java.util.*;
class P103_ATM_simulation
{
    public static void main()
    {
        float balance=1000; //variable to store the balance
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your account number:");
        int acc=sc.nextInt();
        System.out.println("Enter your pin number:");
        int pin=sc.nextInt();
        if(acc==123456 && pin==1234 || acc==987654 && pin==4321) //checking if the account number and pin number are correct
        {   int choice =0; //variable to store the user's choice
           while(choice!=3)
           {
            System.out.println("Enter your choice:");
            System.out.println("1. Balance ");
            System.out.println("2. Withdrawal ");            
            System.out.println("3. Exit ");
            choice=sc.nextInt();
            switch(choice)
            {  
                case 1:
                    System.out.println("Your balance is: "+balance);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw:");
                    float amount=sc.nextFloat();
                    if(amount>=0 && amount<=balance)
                    {
                        balance-=amount;
                        System.out.println("Withdrawal successful!");
                        System.out.println("Your balance is: "+balance);
                    }
                    else
                    {
                        System.out.println("Insufficient balance!");
                    }
                    break;
                    case 3:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
           }
        }
        else
         {
            System.out.println("Invalid account number or pin number!"); //if the account number or pin number are incorrect
         }
         sc.close();
    
            }
        }