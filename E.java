import java.io.*;
import java.util.*;
class E
{
    public static void main(String args[])
    {
        Scanner in= new Scanner(System.in);
        String str,str1= ""; // string variables to store words
        char ch,ch1; // character variables
        int i,y,l; // 'i' for loop , 'y' to convert letter into integer
        System.out.println("Enter Message");
        str= in.nextLine(); // storing original word
        l= str.length(); // storing length of the word
        for(i=0;i<l;i++)
        {
            ch= str.charAt(i); // extracting character of the string
            y = (int) ch; // converting character into its ASCII code
            if(y>=65&&y<78) // ASCII Code between "A - M"
            {
                y= y+13; // Increasing the letter by 13
                ch1= (char)y; // converting new ASCII code to Character
                str1= str1+ch1; // Storing new Character in new string
            }
            else if(y>=78&&y<91) // ASCII Code between "N - Z"
            {
                y= y-13; // Decreasing the letter by 13
                ch1= (char)y; // converting new ASCII code to Character
                str1= str1+ch1; // Storing new Character in new string
            }
            else if(y>=97&&y<110) // ASCII Code between "a - m"
            {
                y= y+13; // Increasing the letter by 13
                ch1= (char)y; // converting new ASCII code to Character
                str1= str1+ch1; // Storing new Character in new string
            }
            else if(y>=110&&y<123)
            {
                y= y-13; // Decreasing the letter by 13
                ch1= (char)y; // converting new ASCII code to Character
                str1= str1+ch1; // Storing new Character in new string
            }
        }
        System.out.println("Original Message : " +str); // Printing Original String
        System.out.println("Encrypted Message : " +str1); // Printing Encrypted String
    } // End of Main
} // End of Class