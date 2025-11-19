package SwitchCase;

public class MobilePlan {
             public static void main(String[] args) {
            	// 29. Mobile Plan Selector

            	 //1: Basic
            	 //2: Standard
            	 //3: Premium
            	 //Print data & validity.   could you please give me the plan and data validity for this
            	 
            	 int plan = 2;
            	 
            	 switch(plan) {
            	 case 1:
            		 System.out.println("Basic Plan selected");
            		 //1️⃣ Basic Plan
            		 //Data: 1 GB / day
            		 System.out.println("Data :1 GB / day ");
            		 //Validity: 28 days
            		 System.out.println("Validity: 28 days");
            		 //Price: ₹199
            		 System.out.println("Price: ₹199");
            		 //Calls: Unlimited
            		 System.out.println("Calls: Unlimited");
                    //SMS: 100/day
            		 System.out.println("SMS: 100/day");
            	  break;
            	  
            	 case 2:
            		 System.out.println("Standard Plan selected");
            		 //1️⃣ Basic Plan
            		 //Data: 1.5 GB / day
            		 System.out.println("Data :1.5 GB / day ");
            		 //Validity: 56 days
            		 System.out.println("Validity: 56 days");
            		 //Price: ₹399
            		 System.out.println("Price: ₹399");
            		 //Calls: Unlimited
            		 System.out.println("Calls: Unlimited");
                    //SMS: 100/day
            		 System.out.println("SMS: 100/day");
            	  break;
            	  
            	 case 3:
            		 System.out.println("Premium Plan selected");
            		 //1️⃣ Basic Plan
            		 //Data: 2 GB / day
            		 System.out.println("Data :2 GB / day ");
            		 //Validity: 84 days
            		 System.out.println("Validity: 84 days");
            		 //Price: ₹599
            		 System.out.println("Price: ₹599");
            		 //Calls: Unlimited
            		 System.out.println("Calls: Unlimited");
                    //SMS: 100/day
            		 System.out.println("SMS: 100/day");
            	  break;
            	  
            	  default:
            		  System.out.println("Invalid Plan selected"); 
            	 }
			}
}
