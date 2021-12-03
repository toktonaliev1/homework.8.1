package kg.geektech.game.players;

public class Medic extends Hero{
    private int healPoints;

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public Medic(int health, int damage , int healPoints) {super(health, damage, SuperAbility.HEAl);
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i] ){
                heroes[i].setHealth(heroes[i].getHealth() + this.healPoints);

            }

        }

    }

}
