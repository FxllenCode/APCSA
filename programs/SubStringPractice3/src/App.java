public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Ethan Webber");
        person1.chopFirstLetter();
        System.out.println(person1.backwardName());
    }

}
