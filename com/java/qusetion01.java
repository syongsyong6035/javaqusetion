package com.java;

public class qusetion01 {
//  🔹1단계: 기초 개념 문제 (배열, 반복문, 상속, 동등성/동일성)
//📝 문제 1: 커피 주문 시스템에서 배열과 반복문 활용하기
//커피 종류를 저장하는 String 배열을 만들고, for-each 문을 사용해 모든 커피를 출력하세요.
public static void main(String[] args) {
  String[] coffeeManager = {"아메리카노","라떼","에이드"};
  for (int i = 0 ; i< coffeeManager.length; i++){
    System.out.println(coffeeManager[i]);
  }
}


}
