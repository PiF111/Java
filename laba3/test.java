package com.company;

import static javax.print.attribute.standard.MediaSizeName.A;

/**
 * Created by andre on 20.09.2016.
 */
public class test implements var03 {
    public void logika(double d1, double d2, double d3) {

        if (d1 > d3 && d2 > d3)
            System.out.println("Сумма " + (d1 + d2));
        else if (d1 > d2 && d3 > d2)
            System.out.println("Сумма " + (d1 + d3));
        else
            System.out.println("Сумма " + (d2 + d3));
    }
    public void poka(double N) {
        double k=1;
        double summ=0;
        while (summ<N){
           summ+=1/k; k++;
        }
        System.out.println("Наибольшее целое " + k);
        System.out.println("Сумма " + summ);
    }
    public void massivy(double[] A, int K, int L){
    int summ=0;
        for (int i=0;i<A.length;i++) {
            if (i<K || i>L) summ+=A[i];
        }
        System.out.println("Сумма " + summ);
    }
}
