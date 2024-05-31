// Main.java
package Main25;

import java.util.Scanner;

import character25.Character; // Characterクラスをインポート

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // スキャナーオブジェクトを作成
        System.out.print("名前を入力してください: "); // ユーザーに名前の入力を促す
        String name = scanner.nextLine(); // ユーザーから名前を受け取る

        // Characterオブジェクトを作成してステータスを表示
        Character character = new Character(name, 849, 862, 375, 937, 24);
        character.displayStatus(); // キャラクターのステータスを表示
    }
}
