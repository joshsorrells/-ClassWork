package mar12;

public class Range implements NumberGroup
{
    private int max;
    private int min;

    public Range(int min, int max){
        this.min = min;
        this.max = max;
    }

    public boolean contains(int num){
        return min <= num && num <=max;
    }

}
