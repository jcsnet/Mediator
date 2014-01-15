import java.util.HashMap;
import java.util.Map;

public class MediatorExchangeCentralImpl implements MediatorExchangeCentral {

	private Map<Integer, PhoneColleague> phoneMap = new HashMap<Integer, PhoneColleague>();

	@Override
	public void sendTextMessage(Integer phoneNumber, String messageContent) {
		phoneMap.get(phoneNumber).receiveMessage(messageContent);
	}

	public void registerPhoneColleague(PhoneColleague colleague) {
		colleague.registerMediator(this);
		phoneMap.put(colleague.getPhoneNumber(), colleague);
	}
}

