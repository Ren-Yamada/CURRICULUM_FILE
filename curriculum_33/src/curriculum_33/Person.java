package curriculum_33;

public class Person {
    private String firstName; // 名前
    private String lastName; // 姓

    public Person(String firstName, String lastName) {
        this.firstName = firstName; // 名前を設定
        this.lastName = lastName; // 姓を設定
    }

    public String getFullName() {
        return firstName + lastName; // フルネームを取得
    }

    public void buy(Car car) {
        car.setOwner(this.getFullName()); // 車を購入し、所有者を設定
        System.out.println(this.getFullName() + "が購入しました。"); // 購入メッセージを表示
    }

    public void buy(Bicycle bicycle) {
        bicycle.setOwner(this.getFullName()); // 自転車を購入し、所有者を設定
        System.out.println(this.getFullName() + "が購入しました。"); // 購入メッセージを表示
    }
}
