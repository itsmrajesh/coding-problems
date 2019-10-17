package com.ieceedtraining;

public class TomBuy {

	public static void main(String[] args) {
		double totalMoney = 2_50_000, lapCost = 42000;
		System.out.println("Laptops brought are : " + (int) (totalMoney / lapCost));
		System.out.println("Money left is : " + totalMoney % lapCost);

	}

}
