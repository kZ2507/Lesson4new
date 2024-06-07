import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(45, 5);
        cat.running(45);
        cat.swimming(5);

        Dog dog = new Dog(500, 7);
        dog.running(500);
        dog.swimming(7);
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int action;
        Cats[] allcats = new Cats[5];
        allcats[0] = new Cats("Мурка", 20, false);
        allcats[1] = new Cats("Марфа", 36, false);
        allcats[2] = new Cats("Милка", 80, false);
        allcats[3] = new Cats("Мишка", 20, false);
        allcats[4] = new Cats("Мирка", 5, false);

        Bowl bowl = new Bowl(100);
        bowl.info();
        for (int i = 0; i < allcats.length; i++) {
            if (!allcats[i].fullness && allcats[i].eating < bowl.food) {
                allcats[i].eat(bowl);
                allcats[i].fullness = true;
                System.out.println(allcats[i].name + " поел, в миске осталось " + bowl.food );
            } else {
                System.out.println("Для " + allcats[i].name + " еды не хватило");
            }
        }
        bowl.info();
        System.out.println("Положи корм");
        action = sc.nextInt();
        bowl.putFood(action);
        bowl.info();
        System.out.println();

        Figures c1 = new Circle(10, "черный", "красный");
        Figures r1 = new Rectangle(2,3, "белый", "голубой");
        Figures t1 = new Triangle(3, 3,3, "желтый", "розовый");

        System.out.println(c1);
        System.out.println(r1);
        System.out.println(t1);
    }
}
