package org.program;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153, temp = num, arm = 0;
		while (num > 0) {
			int n = num % 10;
			arm = arm + (n * n * n);
			num /= 10;
		}
		if (arm == temp) {
			System.out.println("Armstrong  number");
		} else {
			System.out.println("not a amstrong number");
		}
	}
}
