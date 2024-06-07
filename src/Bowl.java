class Bowl {
    public int food;
    public Bowl(int food) {
        this.food = food;
    }
    public void eatFood(int f) {
        food = food - f;
    }
    public void putFood(int d) {
        food = food + d;
    }
    public void info() {
        System.out.println("Еды в миске " + food);
    }
}
class Cats {
    public String name;
    public int eating;
    public boolean fullness;

    Cats(String name, int eating, boolean fullness) {
        this.name = name;
        this.eating = eating;
        this.fullness = fullness;
    }
    public void eat(Bowl b) {
        b.eatFood(eating);
    }
}