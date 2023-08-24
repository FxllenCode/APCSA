public class App {
    public static void main(String[] args) throws Exception {
        Flower lukeFlower = new Flower("Tall and short", "gray", 5, true);
        Flower anayFlower = new Flower("Umm, green", "purple", 16, false);
        Flower isabellaFlower = new Flower("Meaty", "brown", 256, false);

        anayFlower.bloom();
    }
}
