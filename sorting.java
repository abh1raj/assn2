import java.lang.*;
import java.util.*;
class sorting
{
  public static void main(String [] args)
  {
    Scanner ss=new Scanner (System.in);
    System.out.println("Enter range: ");
    int a=ss.nextInt();
    int i=0,j,temp,t;
    t=a;
    int b[]=new int [a];
    System.out.println("Enter Elements: ");
    for(i=0;i<a;i++)
    {
    	b[i]=ss.nextInt();
    }
    for(i=0;i<t;i++)
    {
      for(j=0;j<t;j++)
      {
        if(b[i]<b[j])
        {
          temp=b[i];
          b[i]=b[j];
          b[j]=temp;
        }
      }
    }
    System.out.println("Array after sorting... ");
     for(j=0;j<t;j++)
      {
      	System.out.println(b[j]);
      }
/*
    for(int q:b)
    {
      System.out.println(q);
    }*/

    ss.close();
  }
}