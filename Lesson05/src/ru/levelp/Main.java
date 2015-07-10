package ru.levelp;

import javax.swing.*;

/**
 * Created by vladimir on 07.07.15.
 */
public class Main {
    static int i=0;
    public static void main(String[] args) {
//        GUI gui = new GUI();
//        gui.buildGUI();
        int[] infile = {5,0,1,7,0,3,2,7,5,0};
        Cl y = new Cl(0);
        f2(infile,y,1);
        System.out.println(y.value);
    }

    public static double f1(double a, int n) {
        double p;
        if (n==0)
            return 1;
        else {
            p = f1(a,n/2);
            p = p*p;
            if (n%2 == 1) p = p*a;
            return p;
        }
    }

    public static void f2(int[] infile, Cl y, int z) {
        int x;

        if (i<infile.length) {
            x = infile[i];
            i++;
            f2(infile,y,z);
            if (x>z){
                z=x;y.value=1;
            } else
                if (x==z) {
                    y.value++;
                }
        }else {
            y.value=0;
            z=Integer.MIN_VALUE;
        }
    }
}
