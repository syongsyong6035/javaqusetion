package com.java.question02;

public class Coffee {
  String name;

  public Coffee(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Coffee){
      return this.name.equals(((Coffee) obj).name);
    }
    return false;
  }
}
