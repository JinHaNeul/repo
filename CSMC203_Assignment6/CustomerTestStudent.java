import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {

    private Customer customer;
    private Customer copiedCustomer;

    @BeforeEach
    void setUp() {
        customer = new Customer("Alice", 30);
        copiedCustomer = new Customer(customer);
    }

    @Test
    void testGetName() {
        assertEquals("Alice", customer.getName());
    }

    @Test
    void testGetAge() {
        assertEquals(30, customer.getAge());
    }

    @Test
    void testSetName() {
        customer.setName("Bob");
        assertEquals("Bob", customer.getName());
    }

    @Test
    void testSetAge() {
        customer.setAge(45);
        assertEquals(45, customer.getAge());
    }

    @Test
    void testCopyConstructor() {
        assertEquals("Alice", copiedCustomer.getName());
        assertEquals(30, copiedCustomer.getAge());
        assertNotSame(customer, copiedCustomer);
    }

    @Test
    void testToString() {
        assertEquals("Name: Alice, Age: 30", customer.toString());
    }
}
