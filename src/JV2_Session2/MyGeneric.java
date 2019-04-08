package JV2_Session2;

public class MyGeneric<T,A> {
    public T attribute_1;
    public A attribute_2;

    public T getAttribute_1(){
        return attribute_1;
    }

    public void setAttribute_1(T attribute_1){
        this.attribute_1 = attribute_1;
    }

    public <E> E check(E x){
        return x;
    }

    /*
    K -- Key
    V -- Value
    E -- Element
    N -- Number
     */

}
