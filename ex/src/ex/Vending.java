package ex;

import java.util.Scanner;

public class Vending {

	public static void main(String[] args) {
		Drink a = new Drink("coke", 15, 6);
		Drink b = new Drink("water", 20, 13);
		Drink c = new Drink("milk", 28, 10);
		Scanner scan = new Scanner(System.in);
		int total = 0;
		String enter = "1";
		while(!(enter.equals("0"))) {
			if (total >= c.price) {
				System.out.println("Please enter a number for vending machine or buy a dronk！");
				System.out.println("a：" + a.name + ", " + a.price);
				System.out.println("b：" + b.name + ", " + b.price);
				System.out.println("c：" + c.name + ", " + c.price);
			} else if (total >= b.price) {
				System.out.println("Please enter a number for vending machine or buy a dronk！");
				System.out.println("a：" + a.name + ", " + a.price);
				System.out.println("b：" + b.name + ", " + b.price);
			} else if (total >= a.price) {
				System.out.println("Please enter a number for vending machine or buy a dronk！");
				System.out.println("a：" + a.name + ", " + a.price);
			} else {
				System.out.println("Please enter a number for vending machine！");
			}
			enter = scan.next();
			if (enter.equals("a")) {
				if(a.num != 0) {
					if (total >= a.price) {
						a.num --;
						total -= a.price;
						System.out.println("Don！You buy a " + a.name + " and total：" + total);
					} else {
						System.out.println("Ding！ " + a.price + " > your money " + total);
					}
				} else {
					System.out.println("None " + a.name + "！");
				}
			} else if (enter.equals("b")) {
				if(b.num != 0) {
					if (total >= b.price) {
						b.num --;
						total -= b.price;
						System.out.println("Don！You buy a " + b.name + " and total：" + total);
					} else {
						System.out.println("Ding！ " + b.price + " > your money " + total);
					}
				} else {
					System.out.println("None " + b.name + "！");
				}
			} else if (enter.equals("c")) {
				if(c.num != 0) {
					if (total >= c.price) {
						c.num --;
						total -= c.price;
						System.out.println("Don！You buy a " + c.name + " and total：" + total);
					} else {
						System.out.println("Ding！ " + c.price + " > your money " + total);
					}
				} else {
					System.out.println("None " + c.name + "！");
				}
			} else {
				int e = Integer.parseInt(enter);
				total += e;
				System.out.println("total：" + total);
			}
		}
		System.out.println("Bye！total：" + total);
	}

}
