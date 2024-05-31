class Main{
    public static void main(String[] args){
        // 2人のPersonオブジェクトを作成し、それぞれの情報を表示する
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
        person1.print();

        Person person2 = new Person("山田花子", 22, 1.5, 40);
        person2.print();

        // PersonクラスのprintCountクラスメソッドを呼び出して、合計人数を表示する
        Person.printCount();
    }
}