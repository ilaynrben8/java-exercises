public class Counter {
    private int count;
    public Counter(int start){
        count = start;
    }
    public void increment(){
        count++;
    }
    public void decrement(){
        count--;
    }
    public void reset(){
        count = 0;
    }
    public int getCount(){
        return count;
    }}

