package Method;

public class ThisKeyword {
             int BranchId;
             String BankName;
             String ifscCode;
             long accountNo;
             String city;
             
             public void bankDetails(int BranchId , String bankName ,String ifscCode,long accNo , String city) {
            	this.BranchId = BranchId;
            	this.BankName = BankName;
            	this.ifscCode =ifscCode;
            	this.accountNo=accountNo;
            	this.city = city;
            	
            	System.out.println("Bank Deatils :");
            	System.out.println("Branch id :" + BranchId);
            	System.out.println("IFSC Code :" + ifscCode);
            	System.out.println("Account Number :" + accountNo);
            	System.out.println("Bank City :" + city);
            	 return;
             }
             
}
