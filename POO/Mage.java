public class Mage extends Character {
    private int magic;

    public Mage(String name, int attackDamage, int hearts, String status, int magic) {
        super(name, attackDamage, hearts, status);
        this.magic = magic;
    }

    @Override
    public void info() {
        System.out.println("**************************");
        System.out.println("INFORMACION DEL PERSONAJE");
        System.out.println("Nombre: " + getName());
        System.out.println("Rol: Mago");
        System.out.println("Ataque fisico: " + getAttackDamage() + " puntos");
        System.out.println("Ataque magico: " + magic + " puntos");
        System.out.println("Vida: " + getHearts() + " corazones");
        System.out.println("Estado: " + getStatus());
        System.out.println("**************************");
    }

    @Override
    public void attack() {
        System.out.println("¡El mago " + getName() + " ha inflingido " + getAttackDamage() + " puntos fisicos de daño!");
    }

    public void lightningAttack() {
        System.out.println("¡El mago esta canalizando un ataque especial, el mago " + getName() + " ha usado \"Relampago\" y ha inflingido " + 1.5 * magic + " punto magicos de daño!");
    }

    public void blizzardAttack() {
        System.out.println("¡El mago esta canalizando un ataque espcial, el mago " + getName() + " ha usado \"Ventisca\" y ha inflingido " + 3 * magic + " puntos magicos de daño!");
    } 
}
