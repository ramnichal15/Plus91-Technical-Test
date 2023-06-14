package com.cdac;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumWeightDifference {
    
   
    public static int maxWeightDifference(int[] arr, int k) {
        Arrays.sort(arr); 
        
        int chefWeight = 0;
        int sonWeight = 0;
        
        // Calculate the weight carried by the chef
        for (int i = k; i < arr.length; i++) {
            chefWeight += arr[i];
        }
        
        // Calculate the weight carried by the son
        for (int i = 0; i < k; i++) {
            sonWeight += arr[i];
        }
        
        // Calculate the maximum weight difference
        return chefWeight - sonWeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int t = scanner.nextInt();
        
        
        for (int testCase = 0; testCase < t; testCase++) {
            
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            
            int[] weights = new int[n];
            for (int i = 0; i < n; i++) {
                weights[i] = scanner.nextInt();
            }
            
           
            int maxWeightDiff = maxWeightDifference(weights, k);
            System.out.println(maxWeightDiff);
        }
        
        scanner.close();
    }
}
