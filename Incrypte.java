import java.util.*;

public class Incrypte
{
    public static void main(String []args)
    {
        String input;
        String output="";

        char c,c1;

        int i,l,n,a;

        int remain,start;
        int start1=0;

        Scanner s=new Scanner(System.in);

        System.out.println("enter string ");
        input=s.nextLine();
        l=input.length();

        System.out.println("enter which ROT you want? ");
        n=s.nextInt();

        for(i=0;i<l;i++)
        {
            c=input.charAt(i);
            a=(int)c;

            if(a>=65 && a<=90)
            {
                a=a-n;

                if(a<65)
                {
                    remain=65-a;
                    start=91-remain;

                    c1=(char)start;
                    output=output+c1;
                }
                else
                {
                    c1=(char)a;
                    output=output+c1;
                }
            }

            if(a>=97 && a<=122)
            {
                a=a-n;
             
                if(a>122)
                {
                    remain=97-a;
                    start=123-remain;

                    c1=(char)start;
                    output=output+c1;
                }
                else
                {
                    c1=(char)a;
                    output=output+c1;
                }
            }

            if(a>=48 && a<=56)
            {
                a=a-n;

                c1=(char)a;
                output=output+c1;
            }

            if(a==32)
            {
                c1=(char)a;
                output=output+c1;
            }
            
        }

        System.out.println(output);

    }
}