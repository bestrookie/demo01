package demo12;

public class re {

    public static void main(String[] args) {
        String a = "1asdf123dsf";
        Boolean b;
        boolean dem = demo(a);
        System.out.println(dem);

    }
     static boolean demo(String a){
         String re = "^[a-zA-Z][A-Za-z0-9]+$";
        boolean jude = a.matches(re);
        return jude;
    }
}
