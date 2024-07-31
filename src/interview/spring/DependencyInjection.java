package interview.spring;

public class DependencyInjection {

    interface Shape {
        public void draw();
    }
    static class Circle implements Shape {
        public void draw() {
            System.out.println("Circle");
        }
    }
    static class Square implements Shape {
        public void draw() {
            System.out.println("Square");
        }
    }

    static class Drawing {
        private Shape shape;
        public void setShape(Shape shape) {
            this.shape = shape;
        }
        public void drawShape() {
            this.shape.draw();
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Drawing drawing = new Drawing();
        drawing.setShape(circle);
        drawing.drawShape();
    }
}
