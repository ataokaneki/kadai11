package src.kadai2;

import java.lang.Character;

public class Wizard extends Character {
    public void attack(Matango m){
        System.out.println(this.name+"の攻撃！");
        System.out.println("魔法使いは火の玉を放った！");
        m.hp -= 7;
        System.out.println("敵に7のダメージを与えた");
    }
}
