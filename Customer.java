public class Customer{


public String name;
public int wallet;

  public Customer(String name){
    this.name = name;
    this.wallet = 0;
  }
public int getTotalFunds(){
return this.wallet;
}
public int takemoney(){
  return this.wallet + 20;
}
}