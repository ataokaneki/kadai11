package src.kadai1;

public abstract class Character {
    String name;
    int hp;
    public abstract void attack(Matango m);
    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
        System.out.println("GAME OVER");
        System.out.println("最終HPは" + this.hp + "でした");
    }
    public Character(String name){
        this.name = name;
        this.hp = 100;
    }
}
