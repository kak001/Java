public class ExecuteClasses {
    public static void main(String[] args) {

        // Variables
        var id = new Identification(221260996L, "kako", 20, "Chilena");

        // Metodos
        id.showUserInfo();
        System.out.println();

        id.sayHi();
        System.out.println();

        // Getters
        System.out.println(id.getId());
        System.out.println(id.getName());
        System.out.println(id.getAge());
        System.out.println(id.getNationality());
        System.out.println();

        // Setters
        id.setName("Joaquin Antonio Torrent Jara");

        id.showUserInfo();
    }
}
