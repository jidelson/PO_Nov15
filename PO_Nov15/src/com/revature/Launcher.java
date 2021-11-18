package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Launcher {
	
	public static int[][] printNsquare(int n)
    {
        int squareArray[][] = new int[n][n];

        for (int j = 0; j < n; j++)
        {
            for (int k = 0; k < n; k++)
            {
                squareArray[j][k] = n;
            }
        }
        if (n == 0)
        {
            squareArray = new int[][]{};
            System.out.println(Arrays.toString(squareArray));
            return squareArray;
        }
        for (int[] arr: squareArray)
        {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(" ");
        return squareArray;
    }

	        
	
	  public static boolean ascending(String numbers){
	        for(int i = 1; i <= numbers.length() / 2; i++){
	            boolean cons = true;
	            List<Integer> nums = new ArrayList<>();
	            for(int j = 0; j < numbers.length(); j+=i){
	                nums.add(Integer.parseInt(numbers.substring(j, Math.min(j+i, numbers.length()))));
	            }
	            int lastNum = nums.get(0);
	            for(int j = 1; j < nums.size(); j++){
	                if(nums.get(j) - 1 == lastNum) lastNum++;
	                else cons = false;
	            }
	            if(cons) return true;
	        }
	        return false;
	    }

	public static void main(String[] args) {
		
		System.out.println(ascending("232425"));
		System.out.println(ascending("2324256"));
		System.out.println(ascending("444445"));
		
		System.out.println(printNsquare(3));
		
	}

}
