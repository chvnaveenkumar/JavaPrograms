package BehaviourlPattern.StrategyPattern;


class PaymentService{

	public void processPayment(String paymentMethod) {
		if(paymentMethod.equals("CreditCard")) {
			System.out.println("Making payment via credit card");
		} else if(paymentMethod.equals("DebitCard")) {
			System.out.println("Making payment via debit card");
		} else {
			System.out.println("Unsupported Payment method");
		}
	}
}

public class WithoutStrategyPattern {
	
	public static void main(String[] args) {
			
		PaymentService paymentService = new PaymentService();
		paymentService.processPayment("CreditCard");
		paymentService.processPayment("Debit Card");
		
	}

}


// If you want to add UPI then you need modify the 
// code again to add UPI or other payments