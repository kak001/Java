import java.awt.Color;

public abstract class Character {
    // Atributos
    private String name;
    private int physicalAttack;
    private int life;
    private String status;

    // Constructor
    public Character(String name, int physicalAttack, int life) {
        this.name = name;
        this.physicalAttack = physicalAttack;
        this.life = life;
        this.status = "Normal";
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public int getLife() {
        return life;
    }

    public String getStatus() {
        return status;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metodos
    public abstract void infoCharacter();

    public abstract void basicAttack();

    public boolean characterLifeChecker(Character character) {
        if (character.life <= 0) {
            character.status = "Derrotado";
            message(character.name + " ha sido derrotado/a", RED);
            return false;
        }
        return true;
    }

    public boolean personalCharacterLifeChecker() {
        if (this.life <= 0) {
            this.status = "Derrotado";
            message(this.name + " esta derrotado.", RED);
            return false;
        } else {
            return true;
        }
    }

    public void message(String message) {
        System.out.println(message);
    }

    // Colores
    public static final String RED     = "\u001B[31m";
    public static final String GREEN    = "\u001B[32m";
    public static final String BLUE     = "\u001B[34m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET    = "\u001B[0m";

    public void message(String message, String color) {
        System.out.println(color + message + RESET);
    }
}
