package com.java.qusertion05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;
import org.w3c.dom.ls.LSOutput;

public class qusetion05 {

  public static void main(String[] args) {
    //최종 도전! 모든 개념을 통합한 문제
    //📝 문제 5: 커피 주문 시스템 완성
    //객체 지향 설계를 적용하여 커피 주문 시스템을 구현하세요.
    //
    //배열, 컬렉션, 스트림, 예외 처리, 상속, 인터페이스, 람다, 제네릭 등을 활용하세요.
    //
    //✅ 필수 요구 사항
    //
    //커피 메뉴(enum)를 정의하세요.
    //
    //주문을 저장하는 ArrayList를 사용하세요.
    //

    List<CoffeeMenu> orders = new ArrayList<>(Arrays.asList( CoffeeMenu.LATTE,CoffeeMenu.COFFEE));

    //주문을 람다를 사용하여 필터링하세요.
    //
    List<CoffeeMenu> menu = orders.stream()
        .filter(order->order.equals(CoffeeMenu.LATTE))
        .collect(Collectors.toList());

    //예외 처리를 적용하세요.
    //

    try {
      if(orders.isEmpty()) {
        throw new DataFormatException("주문이 없습니다");
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    //💡 이 문제를 풀면 자바의 핵심 개념을 종합적으로 활용할 수 있습니다!

    System.out.println(menu);
  }

}
