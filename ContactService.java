import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contactMap;
    public ContactService(){
        contactMap = new HashMap<>();
    }
    public void addContact(Contact contact){
        if (null != contact && !contactMap.containsKey(contact.getContactId())){
            contactMap.put(contact.getContactId(), contact);
        }
    }
    public void deleteContact(String contactId){
        if(contactMap.containsKey(contactId)){
            contactMap.remove(contactId);
        }
    }
    public void updateContact(String contactId, String firstName, String lastName, String phone, String address){
        if (contactMap.containsKey(contactId)){
            Contact contact = contactMap.get(contactId);
            if(!"".equals(firstName) && null != firstName){
                contact.setFirstName(firstName);
            }
            if(!"".equals(lastName) && null != lastName){
                contact.setLastName(lastName);
            }
            if (!"".equals(phone) && null != phone){
                contact.setPhone(phone);
            }
            if(!"".equals(address) && null != address){
                contact.setAddress(address);
            }
        }

    }
    public Contact getContact(String contactId){
        return contactMap.get(contactId);
    }
}
