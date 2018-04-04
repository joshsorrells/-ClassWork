package apr3;

public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c){
        this.a=a;
        this.b = b;
        this.c = c;
    }


    public boolean isOnline(int x, int y){
        return(x*a + b*y + c == 0);
    }

    public double getSlope(){
        return (double)(-a)/b;
    }

}
