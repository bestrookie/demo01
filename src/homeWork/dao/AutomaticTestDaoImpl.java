package homeWork.dao;

import homeWork.Bean.TestBean;

import java.util.Random;

/**
 * 随机生成20到五十以内的简单基本运算题（加减乘除），不包含小数，不包含负数
 */
public class AutomaticTestDaoImpl implements automaticTestDao{
    @Override
    public void automaticTest() {
        int[] a = new int[50];
        int j = 0;
        boolean b = true;
        TestBean test = new TestBean();
        Random random = new Random();
        int jude = 0;
        for (int i = 1 ; i < 21;){
            test.setNumber1(random.nextInt(21));
            test.setNumber2(random.nextInt(21));
            jude =random.nextInt(2);
            if (i!=1){
                for (int l =0 ;l<a.length;l++){
                    if (test.getNumber1() == a[i] && (test.getNumber2() == a[i+1] || test.getNumber2() == a[i-1])){
                        b = false;
                    }
                }
            }
            if(b = true){
                a[j] = test.getNumber1();
                j++;
                a[j] =test.getNumber2();
                j++;
                switch (jude){
                    case 0 :
                        if (test.getNumber2() < test.getNumber1()){
                            test.setSymbol("-");
                            print(test,i);
                            i++;
                            break;
                        }
                    case 1:
                        test.setSymbol("+");
                        print(test,i);
                        i++;
                        break;
                    case 2:
                        test.setSymbol("*");
                        print(test,i);
                        i++;
                        break;
                    case 3 :
                        if(test.getNumber2()!=0 && test.getNumber1() % test.getNumber2() == 0){
                            test.setSymbol("/");
                            print(test,i);
                            i++;
                            break;
                        }
                }

            }


        }


    }
    private void print(TestBean testbean, int i){
        testbean.setKey(i);
        System.out.println("第"+testbean.getKey()+"题: "+testbean.getNumber1()+testbean.getSymbol()+testbean.getNumber2()+"=");
    }
}
