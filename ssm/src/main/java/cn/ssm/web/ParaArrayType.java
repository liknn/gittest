package cn.ssm.web;

public class ParaArrayType {

	public static void main(String[] args) {
		Integer[] i = { 0, 1, 2, 3, 4, 5 };
		Double[] d = { 0.1, 0.2, 0.3 };

		Integer[] i2 = new ClassPara<Integer>().f1(i);
		i2 = MethodPara.d(i);

		Double[] d2 = MethodPara.d(d);
		d2 = new ClassPara<Double>().f1(d);

	}

}

class ClassPara<T> {

	public T[] f1(T[] arg) {
		
		@SuppressWarnings("unchecked")
		T [] t = (T[]) new Object[1];
		return arg;
	}
}

class MethodPara {
	public static <T> T[] d(T[] args) {
		return args;
	}
}