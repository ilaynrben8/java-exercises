public class Bag{
    private String[] items;
    private int n;
    //Constructor
    public Bag(int size){
        items=new String[size];
         n=0;
    }
    public void add(String item) {
        if (n == items.length) {
            System.out.println("stack overflow");
            return;
        }
        items[n++] = item;
    }
    public boolean isEmpty(){
            return n ==0;
        }

public int  size(){
    return n;
}public void  print(){
    for(int i=0;i<n;i++) {
        System.out.println(items[i]);
    }
}
     public static void main(String[] args){

        Bag bag = new Bag(5);
        bag.add("a");
        bag.add("b");
    System.out.println ("Bag is empty? " + bag.isEmpty());
        bag.add("c");
        bag.add("d");
    System.out.println("Bag is empty? " + bag.isEmpty());
    System.out.println("Bag size: " + bag.size());
        bag.add("e");
        bag.add("f");
        bag.print();


}

}
