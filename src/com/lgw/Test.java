package com.lgw;

import java.util.ArrayList;
import java.util.List;

/**
 * list remove element
 * 
 * @author Administrator
 * 
 */
public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		list.add("2");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == "2") {
				list.remove(list.get(i));
				System.out.println(list.size());
				i--;
			}
		}
	}

}
