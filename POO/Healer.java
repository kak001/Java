public class Healer extends Character {
    private int magic;

    public Healer(String name, int attackDamage, int hearts, String status, int magic) {
        super(name, attackDamage, hearts, status);
        this.magic = magic;
    }

    @Override
    public void info() {
        System.out.println("**************************");
        System.out.println("INFORMACION DEL PERSONAJE");
        System.out.println("Nombre: " + getName());
        System.out.println("Rol: Curandera");
        System.out.println("Ataque fisico: " + getAttackDamage() + " puntos");
        System.out.println("Ataque magico: " + magic + " puntos");
        System.out.println("Vida: " + getHearts() + " corazones");
        System.out.println("Estado: " + getStatus());
        System.out.println("**************************");
    }

    @Override
    public void attack() {
        System.out.println("¡La curandera " + getName() + " ha inflingido " + getAttackDamage() + " puntos fisicos de daño!");
    }

    public void heal() {
        System.out.println("¡La curandera esta usando una habilidad especial, la curandera ha sanado " + magic + " puntos de vida!");
    }

    public void cure() {
        System.out.println("¡La curandera esta usando su habilidad especial, la curandera ha sanado el estado " + getStatus() + "!");
    }

    public void blessing() {
        System.out.println("¡La curandera esta usando su habilidad especial, la curandera a bendecido a un aliado, otorgandole +10 puntos de combate!");
    }
}
