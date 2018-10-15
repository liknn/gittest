package cn.ssm.web;

import java.util.Arrays;

public class Splitting {
	public static String knights = "THEn, when you have sfound the shrubbery, fcut down... with... a herring!";

	public static void split(String regex) {
		String[] aa = knights.split(regex);
		System.out.println(Arrays.toString(aa));
	}

	public static void main(String[] args) {
		split(" ");
		split("\\W+");
		split("n\\W+");
	}

}
