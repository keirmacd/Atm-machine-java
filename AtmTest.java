import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;


public class AtmTest{

Atm atm;
String location;

@Before
public void before(){
  location = "Glasgow";
  atm = new Atm(location);
}
@Test
public void testifatmhaslocation(){
  assertEquals("Glasgow", atm.getlocation());
}
@Test 
public void checkifatmhascash(){
assertEquals(6000, atm.getmoneyinmachine());
}
@Test
public void checkmoneycanberemoved(){
  assertEquals(5980, atm.withdraw());
}
}