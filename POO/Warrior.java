import java.util.Random;

public class Warrior extends Character {
    private Random random;

    public Warrior(String name, int attackDamage, int hearts, String status) {
        super(name, attackDamage, hearts, status);
        this.random = new Random();
    }

    @Override
    public void info() {
        System.out.println("**************************");
        System.out.println("INFORMACION DEL PERSONAJE");
        System.out.println("Nombre: " + getName());
        System.out.println("Rol: Guerrero");
        System.out.println("Ataque fisico: " + getAttackDamage() + " puntos");
        System.out.println("Vida: " + getHearts() + " corazones");
        System.out.println("Estado: " + getStatus());
        System.out.println("**************************");
    }

    @Override
    public void attack() {
        System.out.println("¡El guerrero " +  getName() + " ha usado su espada, inflingiendo " + getAttackDamage() + " puntos de daño fisico!");
    }

    public void parry() {
        if (random.nextInt(100) <= 39) {
            System.out.println("¡El guerrero ha bloqueado totalmente el ataque del oponente!");
        } else {
            System.out.println("¡Oh no, el guerrero ha sufrido daño!");
        }
    }

    public void justiceHability() {
        System.out.println("¡El guerrero ha usado su ataque especial, el guerrero ha inflingido " + 2.2 * getAttackDamage() + " puntos de daño fisico!" );
    }
}
