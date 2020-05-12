package demo11;

public class TryAssertions {

    public String constructOperation(int left,int right,char op) {

        int value = 0;
        assert 0<=left && left<=100:"左运算数不在0~100的范围";
        assert 0<=right && right<=100:"右运算数不在0~100的范围";
        if(op=='+') {
            value=left+right;
            assert 0<=value &&value<=100:"加法运算结果不在0~100的范围";
        }else if(op=='-'){
            value=left-right;
            assert 0<=value &&value<=100:"减法运算结果不在0~100的范围";
        }else {
            assert false:op+"不是加号或减号运算符";
        }
        return "算式"+left+op+right+"的运算结果是"+value;

    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        TryAssertions try_assert=new TryAssertions();
        System.out.println("正常的加法运算：");
        System.out.println(try_assert.constructOperation(50, 20, '+'));
        System.out.println("正常的减法运算：");
        System.out.println(try_assert.constructOperation(50, 20, '-'));
        System.out.println("试验断言");
        System.out.println(try_assert.constructOperation(10, 20, '-'));
    }



}
