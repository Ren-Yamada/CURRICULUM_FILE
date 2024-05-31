// Main.java
package Main25;
import java.util.Scanner;

import character25.Character;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("名前を入力してください: ");
        String name = scanner.nextLine();

        Character character = new Character(name, 849, 862, 375, 937, 24);
        character.displayStatus();
    }
}
