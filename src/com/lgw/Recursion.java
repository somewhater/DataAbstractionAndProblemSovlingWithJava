package com.lgw;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * 阶乘
 * 
 * @author Administrator
 * 
 */
public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reslut = getResultByInt(16);
		System.out.println(reslut);
		BigInteger bigInteger = getResultByInteger(100);
		System.out.println(bigInteger);
	}

	/**
	 * 负数阶乘无意义，超过16则超过int范围，int类型占用4个字节 一个字节8bit，所以值的个数为2^32，高一位为正负表示，
	 * +0和-0相等，所以int的范围是-2^31-1--------2^31-1
	 * 
	 * @param index
	 * @return
	 */
	public static int getResultByInt(int index) {
		if (index < 0 || index > 16) {
			return 0;
		} else if (index == 1) {
			return 1;
		} else {
			return index * getResultByInt(index - 1);
		}
	}

	public static BigInteger getResultByInteger(int index) {
		if (index < 0) {
			return new BigInteger("0");
		} else if (index == 1) {
			return new BigInteger("1");
		} else {
			return new BigInteger(String.valueOf(index)).multiply(getResultByInteger(index - 1));
		}
	}
}
