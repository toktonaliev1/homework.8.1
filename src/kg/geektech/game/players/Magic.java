package kg.geektech.game.players;

public class Magic extends Hero{



    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
        this.boostDamage = boostDamage;
    }

    private int boostDamage;






    public int getBoostDamage() {
        return boostDamage;
    }

    public void setBoostDamage(int boostDamage) {
        this.boostDamage = boostDamage;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBoostTimes = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]){
                if (damageBoostTimes == 2 ){
                    heroes[i].setDamage(heroes[i].getDamage() + this.boostDamage);
                    damageBoostTimes ++;
                }else {
                    heroes[i].setDamage(heroes[i].getDamage());
                }
            }

        }

    }

}
