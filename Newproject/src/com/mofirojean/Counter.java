package com.mofirojean;

public class Counter {
    private int count;
    public Counter(){ }// constructor method
    public Counter(int initial){
        count = initial;
    }
    public int getCount(){
        return count;
    }
    public void increment(){
        count++;
    }
    public void increment(int delta){
        count += delta;
    }
    public void reset(){
        count = 0;
    }
    // decrementing
    public  void decrement(){
        count--;
    }
    // snapshot (snaps the count)
    public void snapShot(){
        System.out.println(count);
    }
    public  void  setCount(int newCount){
        this.count = newCount;
    }
}
