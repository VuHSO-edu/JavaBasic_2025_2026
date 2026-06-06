package lesson09;

/**
 * @author VuHSO
 * @created 5/18/2026
 */
public class TestBook {
    public static void main(String[] args) {
        // 1. Kiểm thử lớp Author
        // Khởi tạo một đối tượng tác giả
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck); // Gọi hàm toString() của Author

        ahTeck.setEmail("paulTan@nowhere.com"); // Test setter
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is: " + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());

        // 2. Kiểm thử lớp Book
        // Test constructor của Book (Truyền đối tượng ahTeck vào)
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook); // Gọi hàm toString() của Book

        // Test Getters và Setters của Book
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());

        // Lấy thông tin tác giả từ đối tượng Book
        System.out.println("Author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        // 3. Khởi tạo Book bằng một đối tượng Author ẩn danh (anonymous instance)
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);
    }
}