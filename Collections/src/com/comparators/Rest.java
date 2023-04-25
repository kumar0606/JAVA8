package com.comparators;

import java.util.Scanner;



public class Rest {
 public static Scanner sc=new Scanner(System.in);
 public static int quantity,chooseitems;
 public static double price,total;
 public static String againorder;
   
 public static void menu() {
	 System.out.println("welcome");
	 System.out.println("todays menu");
	 System.out.println("1.idly rs:50/-");
	 System.out.println("2.poori rs:40/-");
	 System.out.println("3.dosa rs:35/-");
 }
 public static void order() {
	 System.out.println("if u want to order follow the process");
	 System.out.println("press 1 for idly");
	 System.out.println("press 2 for poori");
	 System.out.println("press 3 for dosa");
	 System.out.println("/t/t/t order please");
	 chooseitems=sc.nextInt();
	 if(chooseitems==1) {
		 System.out.println("you choose idly");
		 System.out.println("how many plates");
		 quantity=sc.nextInt();
		 total=total+(quantity*50);
		 System.out.println(" u want to again order");
		
		 System.out.println("press y for yes or no for n");
		 againorder=sc.next();
		 if(againorder.equalsIgnoreCase("y")) {
			 order();
		 }else {
			 System.out.println("generate the bill");
			 System.out.println("press 0");
			 price=sc.nextDouble();
			
//			 if(price>=total) {
//				 System.out.println("payment not enough");
//			 }else {
				 total=total+price;
				 System.out.println("total bill is:"+total);
				 System.out.println("payment done successfully");
				 System.out.println("thank you visit again");
			 }
		 }
	 else if (chooseitems==2){
		 System.out.println("you coosen poori");
		 System.out.println("how many plates do you want");
		 quantity=sc.nextInt();
		 total=total+(quantity*40);
		 System.out.println("again you want to order");
		 System.out.println("press y for yes or n for no");
		 againorder=sc.next();
		 if(againorder.equalsIgnoreCase("y")) {
			 order();
		 }else {
			 System.out.println("generate the bill");
			 System.out.println("total is :"+total);
		 }
	 }
	 else if (chooseitems==3) {
		 System.out.println("you order dosa");
		 System.out.println("how many plates do u want ");
		 quantity=sc.nextInt();
		 total=total+(quantity*35);
		 System.out.println("youu want to order again");
		 System.out.println("press y for yes or no for n");
		 againorder=sc.next();
		 if(againorder.equalsIgnoreCase("y")) {
			 order();
		 }else {
			 System.out.println("bill generate");
			 price=sc.nextDouble();
			 if(price>=total) {
				 System.out.println("payment not Enough");
			 }
				 else {
					 
					 System.out.println("total bill is:"+total);
					 System.out.println("payment successfully done");
				 
			 }
		 }
	 }
 }
 public static void main(String[] args) {
	 menu();
	order();
	
}
}
