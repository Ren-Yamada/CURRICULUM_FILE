package curriculum_29.main;

import java.util.Arrays;
import java.util.Scanner;

import curriculum_29.Prefecture;
import curriculum_29.PrefectureComparator;

public class Main {
    public static void main(String[] args) {
        // 都道府県情報の配列
        Prefecture[] prefectures = {
                new Prefecture(0, "北海道", "札幌市", 83424, 83424.0),
                new Prefecture(1, "青森県", "青森市", 9646, 9646.0),
                new Prefecture(2, "岩手県", "盛岡市", 15275, 15275.0),
                new Prefecture(3, "宮城県", "仙台市", 7282, 7282.0),
                new Prefecture(4, "秋田県", "秋田市", 11638, 11638.0),
                new Prefecture(5, "山形県", "山形市", 9323, 9323.0),
                new Prefecture(6, "福島県", "福島市", 13784, 13784.0),
                new Prefecture(7, "茨城県", "水戸市", 6097, 6097.0),
                new Prefecture(8, "栃木県", "宇都宮市", 6408, 6408.0),
                new Prefecture(9, "群馬県", "前橋市", 6362, 6362.0),
                new Prefecture(10, "埼玉県", "さいたま市", 3798, 3798.0)
        };

        // 入力を受け取るScannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);
        // ユーザーからの入力を促すメッセージ
        System.out.println("数字と昇順か降順（昇順: asc、降順: desc）をカンマで区切って入力してください。例: 8,5,9 asc");
        // ユーザーからの入力を受け取る
        String input = scanner.nextLine();
        // 入力された文字列をカンマで分割して配列に格納
        String[] inputArray = input.split(" ");

        // 入力が不正な場合はエラーメッセージを表示して終了
        if (inputArray.length != 2) {
            System.out.println("入力が不正です。数字と昇順か降順（昇順: asc、降順: desc）をカンマで区切って入力してください。");
            return;
        }

        String[] indices = inputArray[0].split(",");
        String sortOrder = inputArray[1].trim();

        // 入力された番号に対応する都道府県情報を出力する
        Arrays.stream(indices)
                .map(String::trim) // 前後の空白を削除
                .mapToInt(Integer::parseInt) // 文字列を整数に変換
                .filter(index -> index >= 0 && index < prefectures.length) // 範囲内の番号をフィルタリング
                .mapToObj(index -> prefectures[index]) // 番号に対応する都道府県情報にマッピング
                .sorted(new PrefectureComparator("asc".equalsIgnoreCase(sortOrder))) // ソート
                .forEach(prefecture -> {
                    // 都道府県情報を出力
                    System.out.println("都道府県名：" + prefecture.getName());
                    System.out.println("県庁所在地：" + prefecture.getCity());
                    System.out.println("面積：" + prefecture.getArea() + "km2");
                    System.out.println(); // 空行を追加
                });
    }
}
