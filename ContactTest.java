import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testGetters(){
        Contact contact = new Contact("12345", "John", "Smith", "8888888888", "123 1st Avenue, New York 12345");
        assertEquals("12345", contact.getContactId());
        assertEquals("John", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("8888888888", contact.getPhone());
        assertEquals("123 1st Avenue, New York 12345", contact.getAddress());
    }


}
