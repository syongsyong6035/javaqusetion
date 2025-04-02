package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.zip.DataFormatException;

public class qusetion04 {
  //🔹3단계: 컬렉션, 스트림, 예외 처리 활용
  //📝 문제 4: 컬렉션 & 스트림 사용
  //List를 사용해 커피 주문 목록을 저장하고, 스트림을 이용해 필터링하세요.
  //
  //예외 처리를 적용하여 리스트가 비어 있을 경우 예외 발생하도록 구현하세요.

  public static void main(String[] args) {
    List<String> orders = new ArrayList<>();

    // TODO: 주문 추가
    orders =Arrays.asList("아메리카노","라떼","에스프레소");

    // TODO: 스트림을 사용해 특정 조건으로 필터링 후 출력
    List<String> menu =orders.stream()
        .filter(order->order.equals("라떼"))
        .collect(Collectors.toList());

    // TODO: 주문이 없을 경우 예외 발생


      try {
        if(orders.isEmpty()) {
          throw new DataFormatException("주문이 없습니다");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }


  }

}
