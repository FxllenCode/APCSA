public class App {
    public static void main(String[] args) throws Exception {
        Adventurer Ethan = new Adventurer(16, "cool person");
        Adventurer Vik = new Adventurer(16, "cool person");

        System.out.println(Ethan.equals(Vik));
    }
}
