package kg.geektech.game.players;

import kg.geektech.game.gerenal.RPG_Game;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getHealth() > 0 ){
            int coeff = RPG_Game.random.nextInt(4) + 2;
            boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
            System.out.println("Warrior critically hits boss " + this.getDamage() * coeff)  ;
        }
    }

}
