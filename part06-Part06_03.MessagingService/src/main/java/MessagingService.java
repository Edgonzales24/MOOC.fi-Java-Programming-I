import java.util.*;
public class MessagingService {
    
    private ArrayList<Message> list;
    
    public MessagingService() {
        this.list = new ArrayList<>();
    }
    
    public void add(Message message) {
        int charLimit = 0;
        charLimit += message.getContent().length();
        if (charLimit <= 280) {
            this.list.add(message);
            
        }
    }
    
    public ArrayList getMessages() {
        return list;
    }
}
