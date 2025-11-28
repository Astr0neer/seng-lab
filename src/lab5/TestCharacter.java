package lab5;

public class TestCharacter {
    public static void main(String[] args) {

        GameCharacter gameCharacter = new GameCharacter("Warrior",1,100);

        gameCharacter.takeDamage(30);
        gameCharacter.getHeal(10);

        System.out.println(gameCharacter.getHealth());
        System.out.println(gameCharacter.getLevel());

        System.out.println(gameCharacter.toString());

        GameCharacter character = new GameCharacter("Mage",3,80);

        System.out.println(GameCharacter.getTotalCharacters());
    }
}
