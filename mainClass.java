import java.util.Scanner;
import java.lang.Math;
import java.lang.String;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
class SubFunctions
  {
     Scanner S1=new Scanner(System.in);
      void Minimum()
         {
             int num1,num2;
	 System.out.println("Enter your Number:");
             num1=S1.nextInt();
             num2=S1.nextInt();
	System.out.println("Minimum value="+Math.min(num1,num2));
       }
      void Maximum()
         {
             int num1,num2;
	 System.out.println("Enter your Number:");
             num1=S1.nextInt();
             num2=S1.nextInt();
	System.out.println("Maximum value="+Math.max(num1,num2));
       }
     void Square()
         {
             int num1;
	 System.out.println("Enter your Number:");
             num1=S1.nextInt();
	System.out.println("Square Root value="+Math.sqrt(num1));
       }
     void Power()
         {
             int num1;
	 System.out.println("Enter your Number:");
             num1=S1.nextInt();
             System.out.println("Enter power:");
            int power=S1.nextInt();
	System.out.println("Power of given number="+Math.pow(num1,power));
       }
      void Absolute()
         {
             int num1;
	 System.out.println("Enter your Number:");
             num1=S1.nextInt();
	System.out.println("Absolute value="+Math.abs(num1));
       }
       void Exponent()
         {
             double num1;
	 System.out.println("Enter your Number:");
             num1=S1.nextFloat();
	System.out.println("Exponent value="+Math.exp(num1));
       }
      void Round()
         {
             double num1;
	 System.out.println("Enter your Number:");
             num1=S1.nextFloat();
	System.out.println("Round value="+Math.round(num1));
       }
    void Book()
      {
            String author,title,publisher;
             int price;
             String stock_pos;
             System.out.println("Enter Book Title:");
             title=S1.next();
	 System.out.println("Enter Author Name:");
             author=S1.next();
             System.out.println("Enter Publisher Name:");
             publisher=S1.next();
             System.out.println("Enter Price:");
             price=S1.nextInt();
             System.out.println("Enter stock Position:");
             stock_pos=S1.next();
            System.out.println("Book Title:"+title); 
              System.out.println("Book Author:"+author); 
             System.out.println("Book Publisher:"+publisher); 
             System.out.println("Book Price:"+price); 
             System.out.println("Stock Position:"+stock_pos); 
       }
   void RectangleArea()
     {
               int length,breadth;
              System.out.println("Enter Length:");
              length=S1.nextInt();
	  System.out.println("Enter breadth:");
              breadth=S1.nextInt();
              int area=(length*breadth);
              System.out.println("Area of Rectangle:"+area);
     }
  void ResultGreets()
     {
           System.out.println("Enter Your Marks in Integer Form:");
           int marks=S1.nextInt();
            switch(marks/10)
          {
	case 10:
	case 9:
	case 8:
	        System.out.println("Excellent");
                    break;
	case 7:
	        System.out.println("Very Good");
	       break;
	case 6:
  	        System.out.println("Good");
	      break;
	case 5:
	        System.out.println("Work hard");
                   break;
	case 4:
	        System.out.println("poor");
                  break;
             case 3:
 	case 2:
	case 1:
	        System.out.println("Very poor");
                  break;
      }
   }
}
class mainClass
 {
     public static void main(String args[])
	{
	      int choice;
                  SubFunctions S2=new SubFunctions();
	     Scanner S1=new Scanner(System.in);
	    System.out.println("*******************************************");     
                  System.out.println("1.Find Minimum Number.");     
	    System.out.println("2.Find Maximum Number.");     
	    System.out.println("3.Find Square root of given Number.");     
	   System.out.println("4.Find Power of given Number.");     
	   System.out.println("5.Find Absolute value of given Number.");     
	   System.out.println("6.Find Exponent of Number.");   
	  System.out.println("7.Find Round value of Number."); 
	   System.out.println("8.Fill your Book Information.");   
              System.out.println("9.Calculate Rectangle Area.");     
              System.out.println("10.Display Greets according to Result.");     
	  System.out.println("*******************************************");       
              System.out.println("*****Enter your choice:");
                 choice=S1.nextInt();
          switch(choice)
               {
		case 1:
                                   S2.Minimum();
                                   break;
                        case 2:
		         S2.Maximum();
                                 break;
	           case 3:   
		         S2.Square();
                                 break;
                       case 4:   
		         S2.Power();
                                 break;              
	          case 5:   
		         S2.Absolute();
                                 break;
	           case 6:   
		         S2.Exponent();
                                 break;
	          case 7:   
		         S2.Round();
                                 break;
                     case 8:   
		         S2.Book();
                                 break;
                    case 9:
                                S2.RectangleArea();
                                break;
                    case 10:
                                S2.ResultGreets();
                                break;

           }

      }
}