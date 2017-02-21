import java.util.*;

public class Atm{

public int cashReserve;
public String location;

  public Atm(String location){
    this.location = location;
    this.cashReserve = 6000;
  }
public String getlocation(){
return location;
}
public int getmoneyinmachine(){
  return cashReserve;
}
public int withdraw(){
 return cashReserve - 20;
}
}