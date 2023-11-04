package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  int money = 0;

  public static VendingMachine getInstance() {
    return new VendingMachineImpl();
  }

  @Override
  public void insertQuarter() {
    money += 25; 
  }

  @Override
  public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
      if(name == "ScottCola"){
        if(money >= 75){
          money -= 75;
          return new DrinkImpl(name, true);
        }else{
          throw new NotEnoughMoneyException();
        }
      } else if (name == "KarenTea") {
        if(money >= 100){
          money -= 100;
          return new DrinkImpl(name, false);
        }else{
          throw new NotEnoughMoneyException();
        }
      }else{
        throw new UnknownDrinkException();
      }
  }
}
