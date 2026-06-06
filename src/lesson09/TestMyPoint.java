package lesson09;

/**
 * @author VuHSO
 * @created 5/18/2026
 */
public class TestMyPoint {
    public static void main(String[] args) {
        // Test constructor mặc định
        MyPoint point1 = new MyPoint();
        System.out.println(point1); // In ra (0,0)

        // Test setters
        point1.setX(8);
        point1.setY(6);

        // Test getters
        System.out.println("x is: " + point1.getX());
        System.out.println("y is: " + point1.getY());

        // Test setXY() và getXY()
        point1.setXY(3, 0);
        System.out.println(point1.getXY()[0]);
        System.out.println(point1.getXY()[1]);
        System.out.println(point1); // In ra (3,0)

        // Test constructor truyền tham số
        MyPoint point2 = new MyPoint(0, 4);
        System.out.println(point2); // In ra (0,4)

        // Test các hàm overloaded distance()
        // Tính khoảng cách từ point1 đến point2
        System.out.println(point1.distance(point2));

        // Tính khoảng cách từ point2 đến point1 (kết quả phải giống hệt ở trên)
        System.out.println(point2.distance(point1));

        // Tính khoảng cách từ point1 đến tọa độ (5, 6)
        System.out.println(point1.distance(5, 6));

        // Tính khoảng cách từ point1 đến gốc tọa độ (0,0)
        System.out.println(point1.distance());
    }
}