package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        solutions solver= new solutions();
        int n= 5;
        int[] arr = {1,4,6,5};
        int target = 10;
        ArrayList<Integer> ans1 = solver.Solutions1(n,arr,target);
        System.out.println(ans1);

        }
    }
