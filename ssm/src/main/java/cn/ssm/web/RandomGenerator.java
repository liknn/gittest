package cn.ssm.web;

import java.util.Random;

public class RandomGenerator {
	private static Random ra = new Random(47);

	public static class Integer implements Generator<java.lang.Integer> {
		private int value = 1000;

		@Override
		public java.lang.Integer next() {
			return ra.nextInt(value);
		}

	}
}
