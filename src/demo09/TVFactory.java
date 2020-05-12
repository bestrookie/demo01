package demo09;

public class TVFactory {
    public static TV getPay(String a){
        TV tv = null;
        switch (a){
            case "Haier":
                tv = new HaierTV();
                break;
            case "Hisense":
                tv = new HisenseTV();
                break;

        }
        return tv;

    }
}
