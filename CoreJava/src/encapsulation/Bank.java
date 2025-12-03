package encapsulation;

public class Bank {
         private int branchId;
         private String bankName;
         private String ifscCode;
         private long accNo;
         private String city;
          
		public int getBranchId() {
			return branchId;
		}
		public void setBranchId(int branchId) {
			this.branchId = branchId;
		}
		public String getBankName() {
			return bankName;
		}
		public void setBankName(String bankName) {
			this.bankName = bankName;
		}
		public String getIfscCode() {
			return ifscCode;
		}
		public void setIfscCode(String ifscCode) {
			this.ifscCode = ifscCode;
		}
		public long getAccNo() {
			return accNo;
		}
		public void setAccNo(long accNo) {
			this.accNo = accNo;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
          
          
	
	
	
}
