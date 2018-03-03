package feb26;

public class Fraction implements Comparable<Fraction> {


    private int num;
    private int denom;

    public Fraction(int num, int denom){
        this.num = num;
        this.denom = denom;
        //simplify();
    }

    @Override
    public int compareTo(Fraction o) {
        int difference = this.num*o.denom - o.num*this.denom;
                if(difference > 0)return 1;
                else if(difference < 0)return -1;
                else return 0;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Fraction){
            return this.compareTo((Fraction)o) == 0;
        }
        else return false;
    }

    @Override
    public String toString(){
        return num + "/" + denom;
    }
}
