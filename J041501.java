public class J041501
{  
public static void main(String args[])
{
int [] a=new int[10];

double d;

for(int i=0;i<a.length;i++)
{
 a[i] = (int)(Math.random()*89)+10;
     System.out.println(a[i]+"");
     
}
double avgg=avg(a);
System.out.println("aveg:"+avgg);
System.out.print("sta:"+std(avgg));
}

public static double avg(int[] x)
{
double avee=0;
 for (int i = 0 ; i < x.length(); i++)
 {
            sum += a[i];
      }
avee=sum/x.length();
return avee;
     
}
public static double std(double s)
{
  double d=Math.sqrt(s);
return d;
}

}