package kg.geektech.game.players;

public class Berserk extends Hero{
    private int damageBoss;
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this.getHealth() > 0){
                damageBoss = boss.getDamage() * 1/2;
                boss.setHealth(boss.getHealth() - this.getDamage() - damageBoss);
                System.out.println("Berserk did damage and part of damage received " + damageBoss );
                break;

            }

        }

    }

}
