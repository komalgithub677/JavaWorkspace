package main;

import oops.Bank;
public class BankInfo {
             public static void main(String[] args) {
            	 //Creation of First Object from the bank class
				Bank b1 = new Bank();
				
				String name1 =b1.bankName ="SBI";
				String address1 =b1.BankAddress="Pune , Maharashtra , India";
				int count1 = b1.employee_count=120;
				String branchname1 = b1.branchName="Shivaji Nagar Branch";
				String ifsc1 =b1.ifscCode="SBIN0000450";
				double interest1 =b1.interestRate=3.5;
				String accountType1 =b1.accountType ="Savings";
				
				System.err.println("Bank 1 Info");
				System.out.println("Name: " +name1);
				System.out.println("Address : " + address1);
				System.out.println("Count of Employee : " + count1);
				System.out.println("Branch Name : " + branchname1 );
				System.out.println("IFSC Code : " + ifsc1);
				System.out.println("Interest Rate : " + interest1);
				System.out.println("Account Type : " + accountType1);
				
				//Creation of the Second Object
                Bank b2 = new Bank();
				
				String name2 =b2.bankName ="HDFC";
				String address2 =b2.BankAddress="MG Road , Bengaluru , Karnataka";
				int count2 = b2.employee_count=95;
				String branchname2 = b2.branchName="MG Road Branch";
				String ifsc2 =b2.ifscCode="HDFC0001234";
				double interest2 =b2.interestRate=4.2;
				String accountType2 =b2.accountType ="Current";
				
				System.err.println("Bank 2 Info");
				System.out.println("Name: " +name2);
				System.out.println("Address : " + address2);
				System.out.println("Count of Employee : " + count2);
				System.out.println("Branch Name : " + branchname2 );
				System.out.println("IFSC Code : " + ifsc2);
				System.out.println("Interest Rate : " + interest2);
				System.out.println("Account Type : " + accountType2);
				
			}
}
