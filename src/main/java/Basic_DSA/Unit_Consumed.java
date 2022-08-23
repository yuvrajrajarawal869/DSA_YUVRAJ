package Basic_DSA;

//Electricity consumption is measured via slab rates for a particular wattage capacity, which is as follows
//        Apart from the slab rates, a fixed charge of Rs. 80 is also added to every bill.
//        You are given total amount of bill, N , you need to find total unit consumed.

// unit consumed                    per-unit price( in rupees/unit)
//  0 to 50                            3
//  51 to 150                          5
//  151 above                          10


import java.util.Scanner;

public class Unit_Consumed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Number");
        int n = scanner.nextInt();
        int unit =0;
        if(n<=230)
        {
            unit=(n-80)/3;
        }
        else if(n<=730)
        {
            unit=(50+((n-80-150)/5));
        }
        else
        {
            unit=(50+100+((n-80-150-500)/10));
        }
        System.out.println(unit);
    }
}
