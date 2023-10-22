public class Adventurer {
    private int level;
    private String role;

    public Adventurer(int lvl, String ro) {
        level = lvl;
        role = ro;
    }

    public String toString() {
        return "is " + level + " is a " + role;
    }

    public boolean canSubFor(Adventurer a) {
        return true;
    }

    public void tellStory() {

    }
    public String getRole() {
        return role;
    }
    public int getLevel() {
        return level;
    }
    public boolean equals(Object o) {
        if (o instanceof Adventurer) {
            Adventurer a2 = (Adventurer)o;
            return getLevel() == a2.getLevel() && getRole().equals(a2.getRole());
        }
        return false;
    }
}

