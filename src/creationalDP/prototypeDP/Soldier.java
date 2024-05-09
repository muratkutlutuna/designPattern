package creationalDP.prototypeDP;

public class Soldier implements Cloneable{

    private int health; //100 is most healthy, 0 is least healthy
    private int speed;
    private int maxLifeTime;
    private int agility;
    private int power;
    private int rank;
    private String weapon;
    private boolean isAvailableToFight;

    //constructor


    public Soldier(int health, int speed, int maxLifeTime, int agility, int power, int rank, String weapon, boolean isAvailableToFight) {
        this.health = health;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableToFight = isAvailableToFight;
    }


    //method to give info about soldier
    public void showSoldierInfo() {
        String str ="Soldier{" +
                "health=" + health +
                ", speed=" + speed +
                ", maxLifeTime=" + maxLifeTime +
                ", agility=" + agility +
                ", power=" + power +
                ", rank=" + rank +
                ", weapon='" + weapon + '\'' +
                ", isAvailableToFight=" + isAvailableToFight +
                '}';
        System.out.println(str);
    }

    //getter-setter

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableToFight() {
        return isAvailableToFight;
    }

    public void setAvailableToFight(boolean availableToFight) {
        isAvailableToFight = availableToFight;
    }

    @Override
    public Soldier clone() {
        Soldier soldier = null;
        try {
            soldier = (Soldier)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Error occured while cloning the soldier");
            e.printStackTrace();
        }
        return soldier;
    }
}