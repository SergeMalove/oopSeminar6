package oopSeminar6.task3;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        Shape circle = new Circle(3);

        calculateAndPrintArea(rectangle); // ������� ������� ��������������
        calculateAndPrintArea(circle);    // ������� ������� �����
    }

    public static void calculateAndPrintArea(Shape shape) {
        double area = shape.getArea();
        System.out.println("������� ������: " + area);
    }
}
