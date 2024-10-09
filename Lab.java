import java.util.Scanner;
public class Lab 

{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me two words. (Click enter after each one)");
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        if (str1.length() > str2.length())
        {
            System.out.println(str1 + " is longer");
        }
        else if (str2.length() > str1.length())
        {
            System.out.println(str2 + " is longer");
        }
        else
        {
            System.out.println("Both strings have the same length");
        }

        int sub1 = str1.length();
        int sub2 = str2.length();
        String half1 = str1.substring(0, sub1 / 2);
        String half2 = str1.substring(sub1 / 2);
        String half3 = str2.substring(0, sub2 / 2);
        String half4 = str2.substring(sub2 / 2);
        System.out.println("First half: " + half1);
        System.out.println("Second half: " + half2);
        System.out.println("First half: " + half3);
        System.out.println("Secnod half: " + half4);

        if (str1.indexOf(str2) > -1)
        {
            System.out.println(str2 + " is found in " +  str1 + " at index " + str1.indexOf(str2));

        }
        else if (str1.indexOf(str2) == -1)
        {
            System.out.println(str2 + " is NOT found in " + str1);
        }



    
        
    }
    
}
