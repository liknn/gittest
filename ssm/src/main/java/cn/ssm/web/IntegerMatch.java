package cn.ssm.web;

public class IntegerMatch {
	public static void main(String[] args) {
System.out.println("-1234".matches("-?\\d+"));
System.out.println("911".matches("-?\\d+"));
System.out.println("+578".matches("-?\\d+"));
System.out.println("+578".matches("(-|\\+)?\\d+"));
System.out.println();
	}
}
