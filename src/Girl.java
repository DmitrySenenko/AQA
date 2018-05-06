public class Girl {
    private final String name;
    private final int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public boolean presentGift(Box gift) {
        if (gift.volume() > 500)
            return true;
        return false;
    }

    public boolean goToRestoran(Box restoran) {
        if (restoran.volume() > 1000)
            return true;
        return false;
    }

    public String goToRest(String rest) {
        if ("Mac".equals(rest)) {
            return "yes";
        }
        return "NO";
    }
}
