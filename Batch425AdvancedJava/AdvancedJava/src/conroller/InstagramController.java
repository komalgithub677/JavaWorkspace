package conroller;

import service.InstgramService;

public class InstagramController {
       public static void main(String [] args) throws Exception{
    	   InstgramService ss = new InstgramService();
    	   ss.insertData();
       }
}
