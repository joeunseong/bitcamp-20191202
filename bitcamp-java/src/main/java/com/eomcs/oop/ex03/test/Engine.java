package com.eomcs.oop.ex03.test;

public class Engine {
  int sylinder;
  int valve;
  int cc;
  int oilState;
  
   Engine(int sylinder, int valve, int cc) {
    this.sylinder = sylinder;
    this.valve = valve;
    this.cc = cc;
  }
   
  void cleanOil() {
    this.oilState = 10;
    
  }
}
