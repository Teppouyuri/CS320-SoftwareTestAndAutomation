import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class ContactServiceTest {
    private ContactService contactService;

    @Before
    public void setUp(){
        contactService = new ContactService();

    }

    @Test
    public void testAddContact(){
        Contact contact = new Contact("12345", "John", "Smith", "8888888888", "123 1st Avenue, New York 12345");
        contactService.addContact(contact);
        assertNotNull(contactService.getContact(contact.getContactId()));
    }
    @Test
    public void testDeleteContact(){
        Contact contact1 = new Contact("12345", "John", "Smith", "8888888888", "123 1st Avenue, New York 12345");
        Contact contact2 = new Contact("123456", "Mary", "Johnson", "1888888888", "234 1st Avenue, New York 12345");
        contactService.addContact(contact1);
        contactService.addContact(contact2);
        //Verify contact2 is added
        assertNotNull(contactService.getContact(contact2.getContactId()));
        //Delete contact 2
        contactService.deleteContact(contact2.getContactId());
        //Verify contact2 is deleted
        assertNull(contactService.getContact(contact2.getContactId()));
    }
    @Test
    public void updateContact(){
        Contact contact = new Contact("12345", "John", "Smith", "8888888888", "123 1st Avenue, New York 12345");
        contactService.addContact(contact);
        //Verify contact before update
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("8888888888", contact.getPhone());
        assertEquals("123 1st Avenue, New York 12345", contact.getAddress());
        //Update contact
        contactService.updateContact("12345", "Mary", "Johnson", "2222222222", "321 47th St, San Diego 92115");
        //Verify after update contact
        assertEquals("12345", contact.getContactId());
        assertEquals("Mary", contact.getFirstName());
        assertEquals("Johnson", contact.getLastName());
        assertEquals("2222222222", contact.getPhone());
        assertEquals("321 47th St, San Diego 92115", contact.getAddress());
    }


}
