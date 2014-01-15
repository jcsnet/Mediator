
public class Booter {
	
	public static void main(String[] args) {
		
        PhoneColleague phone1 = new PhoneColleague(11111); 
        PhoneColleague phone2 = new PhoneColleague(22222); 
        PhoneColleague phone3 = new PhoneColleague(33333);
        PhoneColleague phone4 = new PhoneColleague(44444);
        PhoneColleague phone5 = new PhoneColleague(55555);
 
        MediatorExchangeCentralImpl mediator = new MediatorExchangeCentralImpl();
        mediator.registerPhoneColleague(phone1);
        mediator.registerPhoneColleague(phone2);
        mediator.registerPhoneColleague(phone3);
        mediator.registerPhoneColleague(phone4);
        mediator.registerPhoneColleague(phone5);
 
        phone1.sendMessage(33333, "Czesc!");
        phone3.sendMessage(22222, "Hello");
        phone5.sendMessage(33333, "Co slychac?");
        phone4.sendMessage(22222, "Witaj");
    }
}
