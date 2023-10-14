package OOP_Figure;

public class Figure {
    public static class Circle extends Figure {
        double radius;
        public Circle(double radius) {
            this.radius = radius;
        }
        public void change(double NewRadius){
            this.radius = NewRadius;
        }
        public double space1(){
            double area = Math.PI * Math.pow(this.radius, 2);
            return area;
        }
        public double space2(){
            double perimeter = 2 * Math.PI * this.radius;
            return perimeter;
        }
        public String info() {
            String total = String.format("Радиус равен: %s \nПлощадь равна: %s \nПериметр равен: %s", this.radius, space1(), space2());
            return total;
        }
    }

    public static class Square extends Figure {
        double side;
        public Square(double side) {
            this.side = side;
        }
        public void change(double NewSide){
            this.side = NewSide;
        }
        public double space1(){
            double area = Math.pow(this.side, 2);
            return area;
        }
        public double space2(){
            double perimeter = 4 * this.side;
            return perimeter;
        }
        public String info() {
            String total = String.format("Сторона равна: %s \nПлощадь равна: %s \nПериметр равен: %s", this.side, space1(), space2());
            return total;
        }
    }

    public static class Rectangle extends Figure {
        double width;
        double length;
        public Rectangle(double width, double length) {
            this.width = width;
            this.length = length;
        }
        public void change(double NewLength, double NewWidth){
            this.length = NewLength;
            this.width = NewWidth;
        }
        public double space1(){
            double area = this.width * this.length;
            return area;
        }
        public double space2(){
            double perimeter = 2 * (this.length + this.length);
            return perimeter;
        }
        public String info() {
            String total = String.format("Длина равна: %s \nШирина равна: %s \nПлощадь равна: %s \nПериметр равен: %s", this.length, this.width, space1(), space2());
            return total;
        }
    }

    public static void main(String[] args) {
        //Circle section

        Circle circle = new Circle(5);
        circle.change(9);
        String totalCircle = String.format("Новый радиус круга: %s", circle.radius);
        System.out.println(totalCircle);
        System.out.println(circle.info());
        System.out.println("\n");

        //Rectangle section

        Rectangle rectangle = new Rectangle(3,2);
        rectangle.change(4,5);
        String totalRectangle = String.format("Новая длина прямоугольника: %s \n" +
                "Новая ширина прямоугольника: %s", rectangle.length, rectangle.width);
        System.out.println(totalRectangle);
        System.out.println(rectangle.info());
        System.out.println("\n");

        //Square section
        Square square = new Square(2);
        square.change(4);
        String totalSquare = String.format("Новая сторона квадрата: %s", square.side);
        System.out.println(totalSquare);
        System.out.println(square.info());
        System.out.println("\n");

    }
}
