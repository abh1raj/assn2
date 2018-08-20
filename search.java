import java.lang.*;
import java.util.*;
class search
{
  public static void main(String [] args)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("Enter the range of the Array :");
    int a=ss.nextInt();
    int i=0,j,t,ctr=0;
    t=a;
    int b[]=new int [a];
    System.out.println("Enter Elements: ");
    while(a!=0)
    {
      b[i]=ss.nextInt();
      i++;
      a--;
    }
    System.out.println("enter the number to be searched: ");
    j=ss.nextInt();
    ss.close();
    for(i=0;i<t;i++)
    {	
     if(b[i]==j)
     {
       System.out.println("Number found !");
       ctr=0;
       break;
     }
		ctr++;
    }
    if(ctr>=1)
     {
     	System.out.println("Number not found...");
     }
    
  }
}