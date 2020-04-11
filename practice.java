package chapterFour;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        String love = "Hello, motherfucker!";
        String hate = new String("Hello, motherfucker!");
        String num = "10";

        if (ch >= 'A' && ch <= 'Z')
            System.out.println(ch+" is an uppercase letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println(ch+" is a lowercase letter");
        else if (ch >= '0' && ch <= '9')
        System.out.println(ch+" is a numeric character");
        
        // some String class methods
        System.out.println(Character.toLowerCase('K'));
        System.out.println(love.charAt(19));
        System.out.println(love.toUpperCase());
        System.out.println(love.concat(" I'm kiddin'"));
        System.out.println(hate.equalsIgnoreCase(love));
        System.out.println(love.compareTo(hate));
        System.out.println(hate.endsWith("!"));
        System.out.println(love.substring(0, 5));
        System.out.println(love.indexOf("l"));

        int intValue = Integer.parseInt(num);
        System.out.println(intValue);


        input.close();
    }
}