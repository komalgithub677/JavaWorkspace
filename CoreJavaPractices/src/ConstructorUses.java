
public abstract class ConstructorUses {
             protected int id;
             
             public ConstructorUses(int id) {
            	 this.id =id;
             }
             
             public abstract int  salary();
             
             public void display() {
            	 System.out.println("Run method : " + salary());
             }
}
