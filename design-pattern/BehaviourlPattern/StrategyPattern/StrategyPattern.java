package BehaviourlPattern.StrategyPattern;


interface Paymentstrategy{
	public void processPayments();
}

class CreditCardPayment implements Paymentstrategy{
	@Override
	public void processPayments() {
		// TODO Auto-generated method stub
		System.out.println("Process Credit Card Payment");
	}	
}

class DebitCardPayment implements Paymentstrategy{
	@Override
	public void processPayments() {
		// TODO Auto-generated method stub
		System.out.println("Process Dedit Card Payment");
	}
}

class PaymentServiceII {
	
	Paymentstrategy paymentstrategy;
	
	public void setPaymentStrategy(Paymentstrategy paymentstrategy) {
		this.paymentstrategy = paymentstrategy;
	}
	
	public void pay() {
		paymentstrategy.processPayments();
	}
}


public class StrategyPattern {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PaymentServiceII paymentServiceII = new PaymentServiceII();
		paymentServiceII.setPaymentStrategy(new CreditCardPayment());
		paymentServiceII.pay();
		
		paymentServiceII.setPaymentStrategy(new DebitCardPayment());
		paymentServiceII.pay();
	}
}
