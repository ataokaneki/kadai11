package src.kadai2;

public class Character {
    String name;
    int hp;
    public void attack(Matango m){
        System.out.println(this.name + "は攻撃した！");
        System.out.println("敵に5ポイントのダメージを与えた！");
    }
    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
    }
    public Character(String name){
        this.name = name;
        this.hp = 100;
    }
    public Character(){}
}
