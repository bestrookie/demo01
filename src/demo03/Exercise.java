package demo03;

import java.util.ArrayList;
import java.util.List;

public class Exercise {
 private boolean jude =false;
 public List<BinaryOperation> Exercise(int num){
     List<BinaryOperation> a = new ArrayList<>();
     for (int i =1 ;i<num+1;i++){
        BinaryOperation bin = new BinaryOperation();
         for (BinaryOperation j : a)
         {
             jude = bin.equals(j);
         }
         if (jude == false){
             a.add(bin);
         }
     }
     return a;
 }
}
