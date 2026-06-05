package practice;
//Online Java Compiler
//Use this editor to write, compile and run your Java code online
class Main {
 
 static void add(){
     System.out.println("Static method  gets executed");
 }
 
 static {
     System.out.println("Static block get executed....");
 }
 
 Main(){
     System.out.println("Constructor get executed");
 }
 
 public static void main(String[] args) {
     System.out.println("Start small. Ship something.");
     add();
     Main m = new Main();
 }
}
