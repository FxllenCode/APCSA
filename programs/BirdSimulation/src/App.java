public class App {
    public static void main(String[] args) throws Exception {
        BirdSimulation bird1 = new BirdSimulation(3, .2);

        System.out.println(bird1.runSimulations(999999999));

    }
}
