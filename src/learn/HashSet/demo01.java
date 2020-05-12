package learn.HashSet;

import java.util.HashSet;

public class demo01 {
    public static void main(String[] args) {
        HashSet<String> a= new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        String s3 = new String("重地");
        String s4 = new String("童话");
        String s5 = new String("abc");
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        a.add(s5);
        System.out.println(a);
    }
}
