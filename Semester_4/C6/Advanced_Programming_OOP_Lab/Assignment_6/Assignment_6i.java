package Assignment_6;

import java.util.Scanner;
import static java.lang.System.out;

/*
Program: Demonstrate Character wrapper class methods
such as isLetter(), isDigit(), and toLowerCase()
*/

abstract class CharacterDemo {
    abstract void checkCharacter();
    abstract void display();
}

class CharacterMethods extends CharacterDemo {
    private char ch;
    private boolean letter;
    private boolean digit;
    private char lower;

    public void setCharacter(char c) {
        ch = c;
    }

    public void checkCharacter() {
        letter = Character.isLetter(ch);
        digit = Character.isDigit(ch);
        lower = Character.toLowerCase(ch);
    }

    public void display() {
        out.println("\n--- Character Method Details ---");
        out.println("Character Entered: " + ch);
        out.println("isLetter(): " + letter);
        out.println("isDigit(): " + digit);
        out.println("toLowerCase(): " + lower);
    }
}

public class Assignment_6i {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CharacterMethods obj = new CharacterMethods();

        out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        obj.setCharacter(c);
        obj.checkCharacter();
        obj.display();

        sc.close();
    }
}