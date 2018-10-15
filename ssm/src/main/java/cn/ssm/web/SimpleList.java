package cn.ssm.web;

import java.util.Arrays;
import java.util.Iterator;

import cn.ssm.domain.User;

public class SimpleList {

	public static void main(String[] args) {

		Integer[] u1 = new Integer[5];
		Integer[] u2 = new Integer[5];

		Arrays.fill(u1, 136);
		Arrays.fill(u2, 136);
		u2[4] = 888;

		System.out.println(Arrays.equals(u1, u2));

	}

}
