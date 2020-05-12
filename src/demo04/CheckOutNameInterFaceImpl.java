package demo04;

public class CheckOutNameInterFaceImpl implements CheckOutNameInterFace{
    @Override
    public Boolean CheckOutName(String username) {
        boolean check = true;
        int len;
        len = username.length();
        if(username == null){
          check = false;
        } else{
            if (len < 7)
                check = false;
        }
        return check;
    }
}
