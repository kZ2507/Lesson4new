abstract class Animal {
    protected int runLength;
    protected int swimLength;

    abstract void running(int runLength);
    abstract void swimming(int swimLength);

    public Animal(int runLength, int swimLength) {
        this.runLength = runLength;
        this.swimLength = swimLength;
    }
}
class Cat extends Animal {
    public Cat(int runLength, int swimLength) {
        super(runLength, swimLength);
        int catcount = 0;
        catcount++;
        System.out.println("Количество котов: " + catcount);
    }

    void running(int runLength) {
        if ((runLength >= 0) && (runLength <= 200)) System.out.println("Кот сможет пробежать " + runLength + "м");
        else System.out.println("Для кота расстояние слишком большое");
    }

    void swimming(int swimlength) {
        System.out.println("Кот не умеет плавать");
    }
}

class Dog extends Animal {
    public Dog(int runLength, int swimLength) {
        super(runLength, swimLength);
        int dogcount = 0;
        dogcount++;
        System.out.println("Количество собак: " + dogcount);
    }

    void running(int runLength) {
        if ((runLength >= 0) && (runLength <= 500))
            System.out.println("Собака сможет пробежать " + runLength + "м");
        else System.out.println("Для собаки расстояние слишком большое");
    }

    void swimming(int swimLength) {
        if ((swimLength >= 0) && (swimLength <= 10))
            System.out.println("Собака сможет проплыть " + swimLength + "м");
        else System.out.println("Для собаки расстояние слишком большое");
    }
}