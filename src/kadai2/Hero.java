package kadai2;

public class Hero extends Character {
    public void attack(Matango m) {
        System.out.println(this.name+"の攻撃！");
        m.hp -= 10;
        System.out.println("敵に10のダメージを与えた！");
    }
}
