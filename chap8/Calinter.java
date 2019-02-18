package chap8;

public interface Calinter{
    public int plus(int i,int j);
    public int minus(int i,int j);
    default int sum(int i,int j){
        return i+j;
    }
    public static int subtract(int i,int j){
        return i-j;
    }
    
}
