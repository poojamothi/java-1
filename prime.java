class prime
{
 public static void main(String args[])
  {
    int num=7;
    int flag=0;
    for(int i=2;i<num;i++)
     {
       if(num%i==0)
        {
         flag=0;
        }
       else
        {
         flag=1;
         }
      }

    if(flag==1)
     { 
      System.out.println("prime");
     }
    
    else
     {System.out.println("not prime");}
   }
}