package feb26;

import java.util.Arrays;
import java.util.List;
public class FractionRunner {

        public static void main(String[] args){
            Fraction f1 = new Fraction(1, 4);
            Fraction f2 = new Fraction(1, 3);
            Fraction f3 = new Fraction(1,4);
            Fraction[] fractions = new Fraction[2];
            fractions[0] = f1;
            fractions[1] = f2;

            System.out.println(f1.compareTo(f2));
            String s1 = "frog";
            String s2 = "frog";
            System.out.println(s1==s2);
            System.out.println(f1==f3);
            List<Fraction> list = Arrays.asList(fractions);
            System.out.println(list);
            System.out.print(fractions);
        }

}
