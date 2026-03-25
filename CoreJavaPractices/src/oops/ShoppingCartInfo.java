package oops;

public class ShoppingCartInfo {
             public static void main(String[] args) {
				ShoppingCart s = new ShoppingCart();
				int cartId = s.cartId =12;
				String items = s.items ="Biryani";
				float price = s.totalPrice = 2000;
				System.out.println("Cart Id : " + cartId);
				System.out.println("Items : " + items);
				System.out.println("Price : " + price);
			}
}
