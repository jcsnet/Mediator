
class PhoneColleague {
	
    private MediatorExchangeCentral mediator;
    private Integer phoneNumber;
 
    public PhoneColleague(int phoneNumber) { 
    	this.phoneNumber = phoneNumber; 
    }
    
    public void registerMediator(MediatorExchangeCentral mediator) {
    	this.mediator = mediator; 
    }
    
    public int getPhoneNumber() { 
    	return phoneNumber; 
    }
 
    public void sendMessage(Integer phoneNumber, String messageContent) {
        System.out.println("Send message from " + this.phoneNumber + " to " + phoneNumber + " : "+messageContent);
        
        // komunikacja przez mediatora
        mediator.sendTextMessage(phoneNumber, messageContent); 
    }
 
    public void receiveMessage(String messageContent) {
        System.out.println("Message received by : " + phoneNumber + " : " + messageContent + "\n");
    }
 }