package curriculum_33;

public class Main {
    public static void main(String[] args) {
        // 人物オブジェクトの作成
        Person person1 = new Person("鈴木", "太郎");
        Person person2 = new Person("山田", "花子");

        // 車と自転車のオブジェクトの作成
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        // 人物が車を購入
        person1.buy(car);
        // 人物が自転車を購入
        person2.buy(bicycle);
    }
}
