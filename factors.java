class factors
{
 public static void main(String args[])
  {
    int num=8;
    System.out.println("factors of"+num+"are");
    
    for(int i=1;i<=num;i++)
     {
       if(num%i==0)
        {System.out.println(i);
        }
     }
     
   }
}