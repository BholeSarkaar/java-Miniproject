class NONprime extends Thread
  {
       public void run()
           {
                int flag=0;
                for(int i=2;i<10;i++)
                     {
                         for(int j=2;j<i;j++)
                           {
                                if(i%j==0)
                                  {
                                      flag=1;
                                      break;
                                  }
                          }
                      }
              if(flag==1)
                  System.out.println("Not prime");
         }
 }
class prime extends Thread
  {
       public void run()
           {
                int flag=0;
                for(int i=2;i<10;i++)
                     {
                         for(int j=2;j<i;j++)
                           {
                                if(i%j==0)
                                  {
                                      flag=1;
                                      break;
                                  }
                          }
                      }
              if(flag==0)
                  System.out.println("prime");
         }
 }
class main
   {
        public static void main(String args[])
          {
                  NONprime p1=new NONprime();
                  prime p2=new prime();
                  p1.start();
                  p2.start();
         }
  }