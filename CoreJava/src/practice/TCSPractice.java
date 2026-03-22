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
    
    public static void main(String [] args){
        findGrade f = new findGrade();
        f.grade();
        f.checkLeapYear();
    }
}
