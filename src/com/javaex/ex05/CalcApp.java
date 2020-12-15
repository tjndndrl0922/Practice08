package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">> ");

			String str = sc.nextLine();
			String[] sArray = str.split(" "); // 공백 제거

			if ("/q".equals(str)) {
				System.out.println("종료합니다");
				break;
			}

			int one = Integer.parseInt(sArray[0]);
			int two = Integer.parseInt(sArray[2]);
			String c = sArray[1];

			if ("+".equals(c)) {
				Add add = new Add();
				add.setValue(one, two);
				System.out.println(">> " + add.calculate());
			} else if ("-".equals(c)) {
				Sub sub = new Sub();
				sub.setValue(one, two);
				System.out.println(">> " + sub.calculate());
			} else if ("*".equals(c)) {
				Mul mul = new Mul();
				mul.setValue(one, two);
				System.out.println(">> " + mul.calculate());
			} else if ("/".equals(c)) {
				Div div = new Div();
				div.setValue(one, two);
				System.out.println(">> " + div.calculate());
			} else {
				System.out.println("알 수 없는 연산 입니다.");
			}

		}

		sc.close();

	}
}
