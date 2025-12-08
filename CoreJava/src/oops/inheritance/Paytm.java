package oops.inheritance;

public class Paytm  extends Application{
//	Mobile recharge (prepaid & postpaid)
	public void prepaidPospaid(){
	            System.out.println("Prepaid and postpaid succesful");
	}
//
//	DTH recharge
	public void dthRecharge() {
		System.out.println("You have been recharge to the DTH");
	}
//
//	Electricity, water & gas bill payments
	public void bill() {
		System.out.println("Electricity payment of 20000");
		System.out.println("Water bill payments of 1000");
		System.out.println("Gas bill payments 1300");
	}
//
//	UPI money transfer
	public void upiTranfer() {
		System.out.println("UPI transfer of the upi transfer successful 4000000");
	}
	
//
//	Wallet facility
	public void walletFacilit() {
		System.out.println("You have wallet facility");
	}
//
//	Paytm Fastag
//
//	Movie & event ticket booking
	public void movieTicket() {
		System.out.println("You have To go for movie : ");
		System.out.println("You have been succefully book a ticket for movie");
	}
//
//	Train & flight booking
	public void trainFlight() {
		System.out.println("You have successfully Booked For train and Fight Ticket");
	}
//
//	Paytm Bank account services
	public void paytmBank() {
		System.out.println("Give the advantage of the paytm bank account services");
	}
//
//	Paytm Postpaid (buy now, pay later)
	public void paytmPostpaid() {
		System.out.println("Buy now pay later services");
	}
//
//	Cashback & reward points
//
	public void cashback() {
		System.out.println("You hae cashback upto this 400 and rewards points");
	}
//	Gold investment & mutual funds
	public void investmentMutualFunds() {
		System.out.println("Do Investment and get mutual funds amount return");
	}

    public void refer() {
        System.out.println("Refer successfully");
                    }
    public void rewards() {
        System.out.println("You get your reward");
    }
    public static void main(String[] args) {
		Paytm p = new Paytm();
		p.register();
		p.login();
		p.cashback();
		p.dthRecharge();
		p.investmentMutualFunds();
		p.movieTicket();
		p.pay();
		p.upiTranfer();
		p.cashback();
		p.movieTicket();
	}
}
