public class Archer extends Character {
    private int range;

    public Archer(String name, int attackDamage, int hearts, String status, int range) {
        super(name, attackDamage, hearts, status);
        this.range = range;
    }

    @Override
    public void info() {
        System.out.println("**************************");
        System.out.println("INFORMACION DEL PERSONAJE");
        System.out.println("Nombre: " + getName());
        System.out.println("Rol: Arquera");
        System.out.println("Ataque fisico: " + getAttackDamage() + " puntos");
        System.out.println("Vida: " + getHearts() + " corazones");
        System.out.println("Estado: " + getStatus());
        System.out.println("**************************");
    }

    @Override
    public void attack() {
        if (range >= 0 && range <= 9) {
            int rangeMultiplier = 1;
            System.out.println("¡La arquera ha inflingido " + rangeMultiplier * getAttackDamage() + " puntos de daño fisico");
        } else if (range >= 10 && range <= 19) {
            int rangeMultiplier = 2;
            System.out.println("¡La arquera ha inflingido " + rangeMultiplier * getAttackDamage() + " puntos de daño fisico");
        } else if (range >= 20) {
            int rangeMultiplier = 3;
            System.out.println("¡La arquera ha inflingido " + rangeMultiplier * getAttackDamage() + " puntos de daño fisico");
        } else {
            System.out.println("¡Oh no, la arquera ha fallado la flecha!");
        }
    }
}
