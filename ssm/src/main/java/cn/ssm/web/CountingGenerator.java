package cn.ssm.web;

public class CountingGenerator {

	public static class Integer implements Generator<java.lang.Integer> {
		private int value = 0;

		@Override
		public java.lang.Integer next() {
			return value++;
		}

	}

	public static class Long implements Generator<java.lang.Long> {

		private long value = 0L;

		@Override
		public java.lang.Long next() {
			// TODO Auto-generated method stub
			return value++;
		}

	}

}
