package com.unisystechhub.desingpatterns.behavioural.strategy;

public class OperationManager {
   private Strategy strategy;
   public OperationManager(Strategy strategy){
       this.strategy=strategy;
   }
   public int perform(int num1, int num2){
      return this.strategy.execute(num1,num2);
   }

   public void setStrategy(Strategy strategy) { this.strategy = strategy; }
}
