package demo05;

public class BookStore {
    public static void main(String[] args) {
        NoveIBook a = new NoveIBook();
        a.setPrice(100);
        OffNoveIBook b = new OffNoveIBook();
        b.setPrice(100);
        System.out.println(b.getPrice());


    }
}
