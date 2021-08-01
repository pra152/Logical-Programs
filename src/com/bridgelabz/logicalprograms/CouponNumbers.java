package com.bridgelabz.logicalprograms;

import java.util.Scanner;

public class CouponNumbers {
	private static final Scanner sc = new Scanner(System.in);

	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = getCoupon(n);
			count++;
			if (!isCollected[value]) {
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter Dstinct Coupon Number:");
		int n = sc.nextInt();
		int count = collect(n);
		System.out.println(count);
	}

}
