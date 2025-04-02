package com.java;

public class qusetion03 {
  //🔹2단계: 추상클래스, 인터페이스, 예외 처리 문제
  //📝 문제 3: 추상클래스와 인터페이스 활용
  //Drink라는 추상 클래스를 만들고, Coffee와 Tea가 이를 상속받도록 구현하세요.
  //
  //getName() 메서드를 abstract로 선언하고, Coffee와 Tea에서 구현하세요.
  public void main(String[] args) {
    // TODO: Coffee와 Tea 객체 생성 후 getName 호출
    Coffee coffee = new Coffee("아메리카노");
    Tea tea = new Tea("아메리카노");


    System.out.println(coffee.getName());
    System.out.println(tea.getName());

  }
}
  abstract class Drink {
    // TODO: 이름을 반환하는 추상 메서드 선언
    abstract String getName();


  }

  class Coffee extends Drink {
    String name;

    public Coffee(String name){
      this.name = name;
    }
    // TODO: getName() 구현
    @Override
    public String getName(){
      return this.name;
    }
  }

  class Tea extends Drink {
    // TODO: getName() 구현
    String name;
    public Tea(String name){
      this.name = name;
    }

    @Override
    public String getName(){
      return this.name;
    }
  }


