public class FinalBoss extends Character {
    public FinalBoss(String name, int attackDamage, int hearts, String status) {
        super(name, attackDamage, hearts, status);
    }

    @Override
    public void info() {
        System.out.println("**************************");
        System.out.println("INFORMACION DEL PERSONAJE");
        System.out.println("Nombre: " + getName());
        System.out.println("Rol: Monstruo");
        System.out.println("Ataque fisico: " + getAttackDamage() + " puntos");
        System.out.println("Vida: " + getHearts() + " corazones");
        System.out.println("Estado: " + getStatus());
        System.out.println("**************************");
    }

    @Override
    public void attack() {
        System.out.println("¡El monstruo " + getName() + " ha usado su espada, inflingiendo " + getAttackDamage() + " puntos de daño fisico!");
    }

    public void poison() {
        System.out.println("¡El monstruo ha usado una habilidad espcial, ha envenado a todo el equipo! (daño por segundo " + getAttackDamage() + ") puntos de vida.");
    }

    public void mortalHit() {
        System.out.println("¡El monstruo ha usado una habilidad definitiva, inflingiendo " + 5 * getAttackDamage() + " puntos de daño fisico!");
    }
}
