package ru.job4j.oop;

public class DummyDic {
public String engToRus(String eng){
String say = "Неизвестное слово:"+eng;
    System.out.println(say);
return say;
  }
  public static void main(String []args){
    DummyDic dictionary = new DummyDic();
    dictionary.engToRus("Word");
  }
}
