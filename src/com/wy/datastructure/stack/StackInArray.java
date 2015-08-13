package com.wy.datastructure.stack;

import java.util.Arrays;
/**
 * 栈用数组表示
 * @author Administrator
 *
 */
public class StackInArray {
	int base;
	int top;
	Object value[];
	public static final int STACKSIZE =100;
	public StackInArray(){
		base = 0;
		top =  0;
		value = new Object[STACKSIZE];
	}
	void push(Object item){
		if(item==null)
			return ;
		if(top-base>=value.length){
			value = Arrays.copyOf(value, value.length*2);
		}
		value[top++] = item;	
	}
	Object pop(){
		if(top-base==0)
			return null;
		return value[--top];
	}
	Object peek(){
		if(top-base==0)
			return null;
		Object data = value[top-1];
		return data;
	}

}
