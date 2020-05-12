package demo12;

public class re {

    public static void main(String[] args) {
        String a = "asdfdsf";
        Boolean b;
        boolean dem = demo(a);
        System.out.println(dem);

    }
     static boolean demo(String a){
         String re = "^[A-Za-z]+$";
        boolean jude = a.matches(re);
        return jude;
    }
}
