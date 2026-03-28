package com.basics.logicalst.switchs;

import java.util.Scanner;

public class MenuFoodOrderingSystem {
	static int pizza;
	static int Burger;
	static int Pasta;
	static int drinks;
	static int bill;
	static float gst = 0.18f;
	static double totalbill = 0;
	static double grandtotal;

	static int getbillofpizzas(int Itemno) {
		switch (Itemno) {
		case 1:
			return 559;
		case 2:
			return 659;
		case 3:
			return 559;
		case 4:
			return 529;
		case 5:
			return 519;
		default:
			return 0;
		}
	}

	static int getBillofburger(int Itemno) {
		switch (Itemno) {
		case 1:
			return 489;
		case 2:
			return 519;
		case 3:
			return 559;
		case 4:
			return 569;
		case 5:
			return 599;

		default:
			return 0;

		}

	}

	static int getBillofpasta(int Itemno) {
		switch (Itemno) {
		case 1:
			return 559;
		case 2:
			return 499;
		case 3:
			return 489;
		case 4:
			return 529;
		case 5:
			return 549;

		default:
			return 0;

		}

	}

	static int getBillofdrinks(int Itemno) {
		switch (Itemno) {
		case 1:
			return 399;
		case 2:
			return 459;
		case 3:
			return 499;
		case 4:
			return 499;
		case 5:
			return 499;

		default:
			return 0;

		}

	}
static void getGrandtotal(double bill) {
	System.out.println("withGST ="+ (gst * bill));
	System.out.println("your total bill =" + (bill + gst * bill));
	System.out.println("your grand total to pay ="+(totalbill +=bill + gst * bill));
//	double bill1 = gst * bill;
//	System.out.println("withgst =" + bill1);
//	System.out.println("your total bill " + (bill + bill1));
//	totalbill += bill + bill1;
//	System.out.println("your grand total Bill =" + totalbill);

	
}
	public static void main(String[] args) {
		System.out.println("Its Lilias food menu");
		String yn = "";
		do {
			System.out.println("	1.pizza Stars at-500\n" + "	2.Burger Stars at-489\n" + "	3.Pasta Stars at-499\n"
					+ "	4.drinks Stars at-399");
			Scanner sc = new Scanner(System.in);
			System.out.println("Select your craving Item");
			int Item = sc.nextInt();

			switch (Item) {
			case 1 -> {
				System.out.println("	1.Margherita-559\n" + "	2.Chicken pizza-659\n" + "	3.Pepperoni-559\n"
						+ "	4.Veggie Delight-529\n" + "	5.Cheese Burs-519");

				System.out.println("Now select your type of pizza");
				int Itemno = sc.nextInt();

				switch (Itemno) {
				case 1:
					System.out.println("your selected item :Margherita");

					bill = getbillofpizzas(Itemno);

					System.out.println("your actual amount of item =" + bill);
					break;
				case 2:
					System.out.println("your select item : Chicken pizza ");
					bill = getbillofpizzas(Itemno);

					System.out.println("your actual amount of item =" + bill);
					break;
				case 3:
					System.out.println("your select item : pepperoni pizza ");
					bill = getbillofpizzas(Itemno);

					System.out.println("your actual amount of item =" + bill);
					break;
				case 4:
					System.out.println("your select item : veggie pizza ");
					bill = getbillofpizzas(Itemno);
					System.out.println("your Actual bill of your item =" + bill);
					break;
				case 5:
					System.out.println("your select item : cheese burs pizza ");
					bill = getbillofpizzas(Itemno);
					System.out.println("your Actual bill of your item =" + bill);

					break;
				default:
					System.out.println("Seleected item not in the list");
				}
				getGrandtotal(bill);
//				System.out.println("withgst =" + (gst * bill));
//				double bill1 = gst * bill;
//				System.out.println("your total bill = " + (bill + bill1));
//				totalbill += bill + bill1;
//				System.out.println("your grand total Bill =" + totalbill);

			}

			case 2 -> {
				System.out.println(" 1.Crispy veg Burger-489\n" + " 2.veg whooper deluxe-519\n"
						+ " 3.Korean spicy panner Burger-559\n" + " 4.spicy Chicken Burger-569\n"
						+ " 5.Chicken grill Spicy-599");
				System.out.println("Now  you can add burger item ");
				int Itemno = sc.nextInt();
				switch (Itemno) {
				case 1:
					System.out.println("your selected item is Crispy veg Burger");
					bill = getBillofburger(Itemno);

					System.out.println("your Actual bill of item =" + bill);
					break;
				case 2:
					System.out.println("your selected item is veg whooper deluxe");
					bill = getBillofburger(Itemno);

					System.out.println("your Actual bill of item =" + bill);
					break;
				case 3:
					System.out.println("your selected item is korean spicy panner burger");
					bill = getBillofburger(Itemno);
					System.out.println("your Actual bill of item =" + bill);
					break;
				case 4:
					System.out.println("your selected item is spicy Chicken Burger");
					bill = getBillofburger(Itemno);
					System.out.println("your Actual bill of item =" + bill);
					break;
				case 5:
					System.out.println("your selected item is Chicken grill spicy");
					bill = getBillofburger(Itemno);
					System.out.println("your Actual bill of item =" + bill);
					break;

				default:
					System.out.println("Entered item not in the list");
				}
				getGrandtotal(bill);

//				double bill1 = gst * bill;
//				System.out.println("withgst =" + bill1);
//				System.out.println("your total bill = " + (bill + bill1));
//				totalbill += bill + bill1;
//				System.out.println("your grand total Bill =" + totalbill);
			}

			case 3 -> {
				System.out.println("1.Chicken pasta-559\n" + "2.veggie pasta-499\n" + "3.Rosted bread-489\n"
						+ "4.Garlic soy Noodles-529\n" + "5.Masala pasta-549");
				System.out.println("select  your item");
				int Itemno = sc.nextInt();
				switch (Itemno) {
				case 1:
					System.out.println("Selected item is Chickehen pasta");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 2:
					System.out.println("selected itemis veggie pasta");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 3:
					System.out.println("Selected item is Rosted breasd");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 4:
					System.out.println("Selected item is Garlic soy Noodles");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 5:
					System.out.println("Selected item is Masala pasta");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				default:
					System.out.println("Entered item not in the list");
				}
				getGrandtotal(bill);

//				double bill1 = gst * bill;
//				System.out.println("withgst =" + bill1);
//				System.out.println("your total bill " + (bill + bill1));
//				totalbill += bill + bill1;
//				System.out.println("your grand total Bill =" + totalbill);

			}
			case 4 -> {
				System.out.println(
						" 1. Virgin Mojito-399\n 2. Blue Lagoon-349\n 3. Strawberry Lemonade-499\n 4. Pina Colada (Non-Alcoholic)-499\n 5. Watermelon Mint Cooler-499");
				System.out.println("select your item ");
				int Itemno = sc.nextInt();
				switch (Itemno) {
				case 1:
					System.out.println("your selected number is Virgin Mojito");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 2:
					System.out.println("your selected number is Blue Lagoon ");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 3:
					System.out.println("your selected number is Strawberry Lemonade ");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 4:
					System.out.println("your selected number is Pina Colada (Non-Alcoholic)");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				case 5:
					System.out.println("your selected number is Watermelon Mint Cooler");
					bill = getBillofdrinks(Itemno);
					System.out.println("your Actual bill =" + bill);
					break;
				default:
					System.out.println("enter item not in the list");
				}
				getGrandtotal(bill);

//				double bill1 = gst * bill;
//				System.out.println("withgst =" + bill1);
//				System.out.println("your total bill " + (bill + bill1));
//				totalbill += bill + bill1;
//				System.out.println("your grand total Bill =" + totalbill);


			}
			default -> System.out.println("sorry no such item");
			}
			System.out.println("if you wnat to add more enter yes");
			yn = sc.next();
		} while (yn.equalsIgnoreCase("y"));
//		System.out.println("gst "+(gst*bill));
//		grandtotal+=bill+(gst*bill);
//		System.out.println("your total Amount =" + grandtotal);
	}

}
