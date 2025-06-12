//Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
public class ques4 {
	public static void main(String[] args) {
		int cost_price = 129;
		int selling_price = 191;
		
		int profit = selling_price - cost_price;
		double profit_per =(double) profit / cost_price *100;
		
		System.out.println("The Cost Price is INR is "+ cost_price + " and the selling price is "+ selling_price +"\n The Profit is INR is "+ profit +" and the profit percentage "+ profit_per  );

	}
}
