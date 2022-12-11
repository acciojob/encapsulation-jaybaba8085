package com.driver;

public class Main {
  public static void  main(String[] args)
  {
      RWOnly r= new RWOnly();
      //String ans = r.name ;
      r.setName("Jay") ;
      System.out.println(r.getName());
  }
}