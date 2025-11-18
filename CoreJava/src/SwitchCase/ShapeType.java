package SwitchCase;

public class ShapeType {
       public static void main(String[] args) {
    	   //19. Shape Type

    	   //Input:

    	   //S → Square

    	   //R → Rectangle

    	   //C → Circle
		char shape ='R';
		
		switch(shape) {
		case 'R':
			System.out.println("Shape would be the rectangle");
		break;
		
		case 'S':
			System.out.println("Shape would be the Square");
		break;
		
		case 'C':
			System.out.println("Shape would be the circle");
		break;
		
		default:
			System.out.println("Enter shape is not valid");
		}
		
	}
}
