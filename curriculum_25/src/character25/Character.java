// Character.java
package character25;

// キャラクタークラス
public class Character {
    private String name; // 名前
    private int hp; // HP
    private int mp; // MP
    private int attack; // 攻撃力
    private int agility; // 素早さ
    private int defense; // 防御力

    // コンストラクタ
    public Character(String name, int hp, int mp, int attack, int agility, int defense) {
        this.name = name; // 名前を設定
        this.hp = hp; // HPを設定
        this.mp = mp; // MPを設定
        this.attack = attack; // 攻撃力を設定
        this.agility = agility; // 素早さを設定
        this.defense = defense; // 防御力を設定
    }

    // 名前のゲッターとセッター
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // HPのゲッターとセッター
    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    // MPのゲッターとセッター
    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    // 攻撃力のゲッターとセッター
    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    // 素早さのゲッターとセッター
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    // 防御力のゲッターとセッター
    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    // キャラクターのステータスを表示するメソッド
    public void displayStatus() {
        System.out.println("こんにちは " + name + " さん");
        System.out.println("ステータス");
        System.out.println("HP：" + hp);
        System.out.println("MP：" + mp);
        System.out.println("攻撃力：" + attack);
        System.out.println("素早さ：" + agility);
        System.out.println("防御力：" + defense);
        System.out.println("\nさあ冒険に出かけよう！");
    }
}
