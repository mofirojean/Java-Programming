public class CounterDemo {
    public static void main(String[] args){
        Counter c;  // declares a variable; no counter yet constructed
        c = new Counter(); // construct a counter and assign its reference to c
        c.increment(); // increase its value by 1
        c.snapshot();
        c.increment(3); // increases it value by 3
        c.snapshot();
        c.decrement();
        c.snapshot();
        int temp = c.getCount(); // will be 4
        c.reset(); // value becomes 0
        c.snapshot();
        Counter d = new Counter(5); // declare and constructs a counter with a value 5
        d.increment(); // value becomes 6
        d.snapshot();
        Counter e = d; // assigns e to reference the same object as d
        e.snapshot();
        temp = e.getCount(); // will be 6
        e.increment(2); // value of e and d becomes 8
        e.snapshot();
        d.snapshot();
    }
}
