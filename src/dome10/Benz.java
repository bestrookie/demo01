package dome10;

public interface Benz {
    void carColor();
    void carSpeed();
    void carPrice();

    static void main(String[] args) {
       String a;
       a = "asd das ";
       int k =0;
       char [] c;
        for (int i = 0;  i<a.length() ; i++) {
                    if (a.charAt(i)!=' '){
                        c = a.toCharArray();
                      // 类似于 char[k][] b;
                    }
                    if (a.charAt(i) == ' '){
                        k++;
                    }
        }


    }

}
