class armstrong
{
 public static void main(String args[])
  { int n=371;
    int r=0;
     
    int arm=0;
    int a=n;
    while(n!=0)
     {
      r=a%10;
      a=a/10;
      arm+=Math.pow(r,3);
      }
    if(arm==n)
      System.out.println("number is armstrong");
    else
     System.out.println("number is not armstrong");
     
   }
}