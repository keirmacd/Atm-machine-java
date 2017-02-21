import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class CustomerTest {

 Customer customer;


@Before
public void before(){
  customer = new Customer("Rab");
}
@Test 
public void testifwallethasfunds(){
assertEquals(0, customer.getTotalFunds());
}

}