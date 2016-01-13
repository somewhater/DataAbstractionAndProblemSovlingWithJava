package com.lgw;

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
		BigInteger bigInteger = getResultByInteger(1000);
		System.out.println(bigInteger);
	}

	/**
	 * 负数阶乘无意义，超过16则超过int范围，int类型占用4个字节 一个字节8bit，所以值的个数为2^32，高一位为正负表示，
	 * 原码表示范围-2^31----2^31,补码表示范围是-2^31--------2^31-1
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
	/**
	 * 	BigInteger存值个数(2^(2147483647*4*8-1))-1
	 * @param index
	 * @return
	 */
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
