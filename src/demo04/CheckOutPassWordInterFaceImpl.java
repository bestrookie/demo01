package demo04;

public class CheckOutPassWordInterFaceImpl implements CheckOutPassWordInterFace {
    @Override
    public boolean CheckOutPassWord(String passWord) {
        boolean check;
        if (passWord == null){
            check =false;
        }else{
            String a = "^[a-z0-9A-Z]+$";
            check = a.matches(passWord);
        }
        return check;
    }
}
