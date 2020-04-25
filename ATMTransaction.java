import java.util.Scanner;
class ATMTransaction
 {
     public static void main(String args[])
	{
	    int amount=5000,deposite=0,withdraw=0,choice=0,password=0,number=0,Satisfaction;
                 String ch;
            Scanner S1=new Scanner(System.in);
                 while(password!=1234)
                     {
                           System.out.println("Enter your secret password:");
                           password=S1.nextInt();
                           if(password!=1234)
                               {
			 System.out.println("Sorry....Wrong password entered!!!!");
			 System.out.println("please Enter valid password");
                               }
                    }
               System.out.println("*******Welcome to ATM service*********");
	  System.out.println("1.Balance Enquiry");
              System.out.println("2.Balance Withdrawal");
              System.out.println("3.Deposite Cash");
	 System.out.println("4.Quit");
             System.out.println("*******************************************");
	 System.out.println("Enter your choice");
             choice=S1.nextInt();
             switch(choice)
                {
 		case 1:
                                System.out.println("Your Current balance is:"+amount);
                                break;
		case 2:
                               System.out.println("available Notes:100 500 2000");
		       System.out.println("Enter Amount do you want to withdraw:");
                                withdraw=S1.nextInt();
                                if(withdraw%100!=0)
                                   {
                                       System.out.println("Please enter amount in multiples of 100");
                                   }
                                else if(withdraw>amount)
                                   {
                                      System.out.println("Insufficient balance,sorry!!!!");  
		           }
                                else
 			{
                                           amount=amount-withdraw;
			      System.out.println("Your Current balance is:"+amount);
                                           System.out.println("Collect your cash!!!");
                                           
                                     }
            		     break;
                        case 3:
                                   System.out.println("Enter amount do you want to deposite"); 
                                    deposite=S1.nextInt();
                                  amount=amount+deposite;
		         System.out.println("Your Current balance is:"+amount);
                             break;
                      case 4:
                               System.out.println("Thanks for Visiting"); 
                             break;
                       default:
                              System.out.println("Invalid choice Entered");  
                 }
                      
                
           }
}