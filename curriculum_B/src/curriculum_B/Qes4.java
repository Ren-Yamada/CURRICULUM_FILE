package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {
        // 九九の表と計算式を表示する
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                // 計算式と計算結果を表示
                System.out.printf("%02d * %02d = %02d", i, j, (i * j));
                if (j != 9) {
                    System.out.print(" || ");
                }
            }
            System.out.println(); // 各行の最後に改行を追加
            if (i != 9) {
                System.out.println(); // "||"の後に縦のスペースを追加
            }
        }
    }
}
