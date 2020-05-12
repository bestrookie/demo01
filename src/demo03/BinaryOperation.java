package demo03;

import java.util.Random;

public class BinaryOperation {
	private static final int UPPER = 100;
	private static final int LOWER = 0;
	protected int left_opr = 0;
	protected int right_opr = 0;
	protected int value = 0;
	private char operator = '+';
//	protected BinaryOperation(char opr){
//
//	}
	private void construct(int left,int right,char op) {
		this.left_opr = left;
		this.right_opr = right;
		this.operator = op;
		switch(op) {
			case '+':
				value = left + right;
				break;
			case '-':
				value = left - right;
				break;
			}
	}
	
	public BinaryOperation generateAddOperation() {
		BinaryOperation add = new BinaryOperation();
		Random rand = new Random();
		int left,right,result;
		left = rand.nextInt(this.UPPER+1);
		do {
			right = rand.nextInt(this.UPPER+1);
			result = left + right;
		}while(result > this.UPPER);
		
		add.construct(left, right, '+');
		return add;
	
	
	}
	public boolean equals(BinaryOperation another) {
		boolean flag = true;
		if(this.left_opr == another.left_opr && this.right_opr == another.right_opr		
				&&this.operator == another.operator || this.left_opr == another.right_opr && this.right_opr == another.left_opr &&this.operator == another.operator ) {
			flag = true;
		}else {
			flag = false;
		}
		return flag;
	}

	
	
	
	public int getLeft_opr() {
		return left_opr;
	}
	public void setLeft_opr(int left_opr) {
		this.left_opr = left_opr;
	}
	public int getRight_opr() {
		return right_opr;
	}
	public void setRight_opr(int right_opr) {
		this.right_opr = right_opr;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public char getOperator() {
		return operator;
	}
	public void setOperator(char operator) {
		this.operator = operator;
	}
	
	public String asString() {
		return this.left_opr+""+this.operator+""+this.right_opr+"=";
	}
	
}
