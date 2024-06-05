// Main.java
package Main25;

import java.util.Random; // ランダムクラスをインポート
import java.util.Scanner;

import character25.Character; // Characterクラスをインポート

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // スキャナーオブジェクトを作成
        System.out.print("名前を入力してください: "); // ユーザーに名前の入力を促す
        String name = scanner.nextLine(); // ユーザーから名前を受け取る

        // ランダムな数値を生成するためのRandomオブジェクトを作成
        Random random = new Random();

        // ランダムな値を使ってCharacterオブジェクトを作成してステータスを表示
        Character character = new Character(name,
                                            random.nextInt(1000), // 0から999のランダムな数値
                                            random.nextInt(1000),
                                            random.nextInt(1000),
                                            random.nextInt(1000),
                                            random.nextInt(100)); // 0から99のランダムな数値
        character.displayStatus(); // キャラクターのステータスを表示
    }
}
