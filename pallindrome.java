class pallindrome
{
 public static void main(String args[])
  { int n=101;
    int r;
     
    int pal=0;
    int a=n;
   
    while(n!=0)
     {
      r=a%10;
      a=a/10;
      pal=pal+(r*10);
      }
    if(n==pal)
      System.out.println("number is pallindrome");
    else
     System.out.println("number is not pallindrome");
     
   }
}