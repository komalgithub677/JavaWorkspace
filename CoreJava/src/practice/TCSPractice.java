public class findGrade{
    public void grade(){
        int marks =50;
        
        if(marks<=90){
            System.out.println("Grade A");
        }
        else if(marks<=80){
            System.out.println("Grade B");
        }
        else if(marks<=70){
            System.out.println("Grade C");
        }
        else if(marks<=60){
            System.out.println("Grade D");
        }
        else if(marks<50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail...");
        }
    }
    
    public void checkLeapYear(){
        int year = 2020;
        
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("Year is leap year");
        }
        else{
            System.out.println("Year is not leap year");
        }
    }
    
    public void ticketPricing(){
        int age =18;
        
        if(age<=17){
            System.out.println("Ticket pricing is 100");
        }
        else if(age<=20){
            System.out.println("Ticket pricing is 200");
        }
        else if(age<=50){
            System.out.println("Ticket pricing 300");
        }
        else if(age<=80){
            System.out.println("Half ticket");
        }
        else{
            System.out.println("Age is not valid");
        }
        
    }
    
    public static void main(String [] args){
        findGrade f = new findGrade();
        f.grade();
        f.checkLeapYear();
        f.ticketPricing();
    }
}
