package com.mastery.javaoops.polymorphism;

//Base class for Payment
abstract class Payment {
	
	protected double amount;
	
	public Payment(double amount) {
		this.amount = amount;
	}
	// Polymorphic method to process payment
	public abstract void processPayment();
}


//Subclass for CashPayment
class CashPayment extends Payment {
	public CashPayment(double amount) {
		super(amount);
	}

	@Override
	public void processPayment() {
		System.out.println("Processing cash payment of euro" + amount);
		// Additional logic for cash payment
	}
}

//Subclass for CardPayment
class CardPayment extends Payment {
	private String cardNumber;

	public CardPayment(double amount, String cardNumber) {
		super(amount);
		this.cardNumber = cardNumber;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing card payment of euro" + amount + " for card number " + cardNumber);
		// Additional logic for card payment such authenticating the card
	}
}

//Subclass for MobileWalletPayment
class MobileWalletPayment extends Payment {
	private String walletId;

	public MobileWalletPayment(double amount, String walletId) {
		super(amount);
		this.walletId = walletId;
	}

	@Override
	public void processPayment() {
		System.out.println("Processing mobile wallet payment of euro" + amount + " for wallet ID " + walletId);
		// Additional logic for mobile wallet payment such as verifying the wallet id
	}
}

//Main class to demonstrate polymorphism
public class ApplicationPos {
	public static void main(String[] args) {
		Payment cashPayment = new CashPayment(50.0);
		Payment cardPayment = new CardPayment(100.0, "1234-5678-9012-3456");
		Payment walletPayment = new MobileWalletPayment(75.0, "WALLET123");

		// Polymorphic calls to processPayment()
		cashPayment.processPayment();
		cardPayment.processPayment();
		walletPayment.processPayment();
	}
}
