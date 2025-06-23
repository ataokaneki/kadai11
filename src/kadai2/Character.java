package kadai2;
/*
public abstract class Character {
    String name;
    int hp;
    public abstract void attack(Matango m);
    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
    }

    public Character(String name){
        this.name = name;
        this.hp = 100;
    }
    public Character(){
        this.hp = 100;
    }
}*/

public abstract class Character{
    String name;
    public abstract void attack(Matango m);
    public void run(){
        System.out.println(this.name + "は、逃げ出した！");
    }

    public Character(String name){
        this.name = name;
    }
}