public class Person {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String backwardName() { 
        String tempS = "";
        for (int i = 0; i < name.length(); i++) {
            tempS = name.charAt(i) + tempS;
        }
        return tempS;
    }

    public String chopFirstLetter() {
        name = name.substring(1);
        return name;
    }

    public String getName() {
        return name;
    }
}
