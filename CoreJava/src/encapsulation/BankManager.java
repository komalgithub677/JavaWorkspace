package encapsulation;

public class BankManager {
       public static void main(String[] args) {
    	   Bank b = new Bank();
    	   b.setAccNo(4567879809l);
    	   b.setBankName("SBI");
    	   b.setCity("City");
    	   b.setIfscCode("SBIN00002483");
    	   b.setBranchId(302);
    	   System.err.println("Bank Details : ");
    	   System.out.println("Account No : " +b.getAccNo());
    	   System.out.println("Bank Name : " +b.getBankName());
    	   System.out.println("Branch Id  : "+b.getBranchId());
    	   System.out.println("Branch City : "+b.getCity());
    	   System.out.println("IFSC Code : " + b.getIfscCode());	   
	}
      
}
