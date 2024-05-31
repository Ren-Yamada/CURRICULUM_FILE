class Person{
    public String name;
    public int age;
    public double height;
    public double weight;
    public static int count = 0; // クラスフィールド "count" を初期値 0 で int データ型として定義

    Person(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        count++; // 新しい Person オブジェクトが作成されるたびに count を 1 ずつ増やす
    }

    public static void printCount(){
        System.out.println("合計" + count + "人です"); // count の値を使って合計人数を出力
    }

    public double bmi(){
        return this.weight / this.height / this.height;
    }

    public void print(){
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
    }
}