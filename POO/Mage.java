public class Mage  extends Character {
    // Atributos
    private int magic;

    // Constructor
    public Mage(String name, int basicAttack, int life, int magic) {
        super(name, basicAttack, life);
        this.magic = magic;
    }

    // Metodos
    // Fix needed
    public void lightning(Character target) {
        if (personalCharacterLifeChecker()) {
            message( "¡"+ getName() + " lanza un hechizo de relampago!" + YELLOW);
            double damage = 1.5 * this.magic;
            target.getLife() -= damage;
            message( "!"+ target.getName() + " recibe " + damage + " puntos magicos de daño!");
        } else {
            message(target.getName() + " no puede lanzar ningun hechizo.", RED);
        }
    }
}
