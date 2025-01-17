public class Amount{

    //@ public invariant cents >= -100;
    //@ public invariant cents <= 100;

    //@ public invariant euros > 0 ==> cents >= 0;
    //@ public invariant euros < 0 ==> cents <= 0;
    //@ public invariant euros != Integer.MIN_VALUE;

    private /*@ spec_public @*/ int cents;

    private /*@ spec_public @*/ int euros;

    //@ requires cents >= -100;
    //@ requires cents <= 100;
    //@ requires euros > 0 ==> cents >= 0;
    //@ requires euros < 0 ==> cents <= 0;
    //@ requires euros != Integer.MIN_VALUE;
    //@ ensures this.cents == cents;
    //@ ensures this.euros == euros;
    //@ pure
    public Amount(int euros, int cents){
        this.euros = euros;
        this.cents = cents;
    }

    public /*@ pure @*/ Amount negate(){
        return new Amount(-euros,-cents);
    }

}

