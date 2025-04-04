package lang.object.test;

public class Rectangle {
    int width;
    int weight;

    public Rectangle(int width, int weight) {
        this.width = width;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) object;
        return width == rectangle.width && weight == rectangle.weight;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
            "width=" + width +
            ", weight=" + weight +
            '}';
    }
}
