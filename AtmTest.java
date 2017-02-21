import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class AtmTest{

Atm atm;
Location location;

@Before
public void before(){
  location = new Customer("Rab");
}