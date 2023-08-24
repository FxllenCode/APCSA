public class Flower {
    String stemDescription;
    String petalColor;
    int petalCount;
    boolean dead;

    public Flower(String stem, String pColor, int pCount, boolean ded){
        stemDescription = stem;
        petalColor = pColor;
        petalCount = pCount;
        dead = ded;
    };

    public void bloom(){
        System.out.println("I have " + getPetalCount() + " petals");
    };    

    public int getPetalCount(){
        return petalCount;
    };
}
