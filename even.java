import java.lang.*;
import java.util.*;
class even
{
  public static void main(String [] args)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("enter the no");
    int a=ss.nextInt();
    int i;
    for(i=0;i<=a;i++)
    {
      if(i%2==0)
      {
        System.out.println(i);
      }
    }
    ss.close();
    }
  }