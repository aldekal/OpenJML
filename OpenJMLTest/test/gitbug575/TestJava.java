public class TestJava {
    
    public int x;
    public int[] a = new int[10];
    
    //@ requires a.length == 10;
    public void m() {
        x = 2;
        a[0] = 4;
        a[2] = 6;
        a[3] = 7;
        mm();
        //@ assert a[0] == 4;
        //@ assert a[3] == 7;
        //@ assert  x == 3;
        
    }
    
    //@ requires a.length == 10 && x == 2;
    //@ assignable x, a[x];
    //@ ensures x == 3;
    public void mm() {
        x = 3;
    }
    
    
    //@ requires a.length == 10;
    public void q() {
        x = 8;
        a[0] = 4;
        a[2] = 6;
        a[3] = 7;
        a[4] = 8;
        qq();
        //@ assert a[0] == 4;
        //@ assert a[4] == 8;
        //@ assert x == 40;
        
    }
    
    //@ requires a.length == 10 && x == 8;
    //@ assignable x, a[x .. x+1];
    //@ ensures x == 40;
    public void qq() {
        x = 40;
    }
    
    
    
    
}