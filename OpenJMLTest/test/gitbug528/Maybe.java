public class Maybe {
   
    //@ ensures \result == a - b;
    //@ {|
    //@   requires a == b;
    //@  also
    //@   requires a < b;
    //@ |}
    public static int add(int a, int b){
        return a-b;
    }

    public static void main(String args[]){
        System.out.println(add(2,3));
    }
    
    public static void t(java.util.stream.Stream<Integer> s, java.util.function.Consumer<Integer> c) {
    	s.forEachOrdered(c);
    }
}