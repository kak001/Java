public class Identification {

    // Atributos
    private long id;
    private String name;
    private int age;
    private String nationality;

    // Constructor
    public Identification(long id, String name, int age, String nationality) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nationality = nationality;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    // Metodos
    public void showUserInfo() {
        System.out.println("==========================");
        System.out.println("DATOS DEL USUARIO");
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Nacionalidad: " + nationality);
        System.out.println("==========================");
    }

    public void sayHi() {
        System.out.println(name + " esta saludando al programador!");
    }
}
