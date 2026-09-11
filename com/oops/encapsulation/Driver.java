package com.oops.encapsulation;

class Gmail extends Ntf{
	
	public void send() {
		System.out.println(" gamil class send called   :");
	}
	
}
  class Sms extends Ntf{
		public void send() {
			System.out.println(" sms class send called   :");
		}
	}
  class WhatsApp extends Ntf{
		public void send() {
			System.out.println(" WhatsApp class send called   :");
		}
	}
public class Driver {

	public static void main(String[] args) {
		Ntf n[]= {new WhatsApp(),new Sms(),new Gmail()};
		
		for(Ntf nn:n) {
			
			nn.send();
		}
		
		
		

	}

}
