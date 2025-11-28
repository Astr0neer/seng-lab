package lab5;

import java.util.Random;

public class GameCharacter {
    private static Random random = new Random();

    private int characterId;
    private String name;
    private int level;
    private int health;


    private static int totalCharacters = 0;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;

        this.characterId = random.nextInt(1000, 9000);

        totalCharacters++;
    }
    public String getName() {
        return name;
    }

    public int getCharacterId() {
        return characterId;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }

    public static int getTotalCharacters() {
        return totalCharacters;
    }

    public int getDamage(int baseDamage) {
        return baseDamage * this.level;
    }

    public  void takeDamage(int damage){
        health -= damage;
        if (health<0){
            health =0;
        }
    }
    public void getHeal(int heal){
        heal += health;
    }

    @Override
    public String toString() {
        return "Character Info: [" +
                "ID=" + characterId +
                ", Name='" + name + '\'' +
                ", Level=" + level +
                ", Health=" + health +
                ']';
    }
}
