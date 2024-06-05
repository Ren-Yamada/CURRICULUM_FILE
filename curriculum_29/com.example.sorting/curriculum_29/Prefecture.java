package curriculum_29;

// 都道府県クラス
public class Prefecture {
    private int id; // ID
    private String name; // 都道府県名
    private String city; // 県庁所在地
    private int population; // 人口
    private double area; // 面積

    // コンストラクター
    public Prefecture(int id, String name, String city, int population, double area) {
        this.id = id; // IDを設定
        this.name = name; // 都道府県名を設定
        this.city = city; // 県庁所在地を設定
        this.population = population; // 人口を設定
        this.area = area; // 面積を設定
    }

    // IDを取得するメソッド
    public int getId() {
        return id;
    }

    // 都道府県名を取得するメソッド
    public String getName() {
        return name;
    }

    // 県庁所在地を取得するメソッド
    public String getCity() {
        return city;
    }

    // 人口を取得するメソッド
    public int getPopulation() {
        return population;
    }

    // 面積を取得するメソッド
    public double getArea() {
        return area;
    }

    // 文字列形式で都道府県情報を取得するメソッド
    @Override
    public String toString() {
        return name + ":" + city + ":" + population; // 都道府県名、県庁所在地、人口を返す
    }
}
