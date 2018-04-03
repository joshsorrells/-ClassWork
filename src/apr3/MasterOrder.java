package apr3;

import java.util.ArrayList;
import java.util.List;

public class MasterOrder {

    private List<CookieOrder> orders;


    public MasterOrder() {
        orders = new ArrayList<CookieOrder>();
    }

    public int getTotalBoxes(){
        int total = 0;
        for(CookieOrder x: orders){
            total += x.getNumBoxes();
        }
        return total;
    }

    public int removeVariety(String cookieVar){
        int sum = 0;
        int pos = 0;
        while(pos < orders.size()){
            if(orders.get(pos).getVariety().equals(cookieVar)){
                sum+=orders.get(pos).getNumBoxes();
                orders.remove(pos);
            }
            else pos++;
        }
        return sum;
    }
}
