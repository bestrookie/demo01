package demo03;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		BinaryOperation add1 = new BinaryOperation().generateAddOperation();
		BinaryOperation add2 = new BinaryOperation().generateAddOperation();
		System.out.println(add1.equals(add2));
		System.out.println(add1.asString()+"\t"+add2.asString());
	}
}
