package 自己紹介3;

class Main {
    public static void main(String[] args) {
        // 2人のPersonオブジェクトを作成してプリントする
        Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
        person1.print(); // person1の情報を出力

        Person person2 = new Person("山田", "花子", 22, 1.5, 40);
        person2.print(); // person2の情報を出力

        // 作成したPersonオブジェクトの数を出力する
        Person.printCount(); // 作成したPersonオブジェクトの数を出力
    }
}
