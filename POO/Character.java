public abstract class Character {
    private String name;
    private int attackDamage;
    private int hearts;
    private String status;

    public Character(String name, int attackDamage, int hearts, String status) {
        this.name = name;
        this.attackDamage = attackDamage;
        this.hearts = hearts;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getHearts() {
        return hearts;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }

    public void setHearts(int hearts) {
        this.hearts = hearts;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public abstract void info();

    public abstract void attack();
}
