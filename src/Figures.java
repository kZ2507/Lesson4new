interface Figures {
    double perimeter();
    double area();
}

class Circle implements Figures {
    private double radius;
    private String background;
    private String border;

    public Circle(double radius, String background, String border) {
        this.radius = radius;
        this.background = background;
        this.border = border;
    }
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
    public String toString() {
        return "Информация про круг:  \n" + perimeter() + " - периметр\n" + area()  +
                " - площадь\n" + background + " - цвет фона \n" + border + " - цвет границы\n";
    }
}

class Rectangle implements Figures {
    private double a;
    private double b;
    private String background;
    private String border;

    public Rectangle(double a, double b, String background, String border) {
        this.a = a;
        this.b = b;
        this.background = background;
        this.border = border;
    }
    public double perimeter() {
        return 2 * (a + b);
    }
    public double area() {
        return a * b;
    }
    public String toString() {
        return "Информация про прямоугольник:  \n" + perimeter() + " - периметр\n" + area()  +
                " - площадь\n" + background + " - цвет фона \n" + border + " - цвет границы\n";
    }
}

class Triangle implements Figures {
    private double a;
    private double b;
    private double c;
    private String background;
    private String border;

    public Triangle(double a, double b, double c, String background, String border) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.background = background;
        this.border = border;
    }
    public double perimeter() {
        return a + b + c;
    }
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a)*(p - b)*(p - c));
    }
    public String toString() {
        return "Информация про треугольник:  \n" + perimeter() + " - периметр\n" + area()  +
                " - площадь\n" + background + " - цвет фона \n" + border + " - цвет границы\n";
    }
}
