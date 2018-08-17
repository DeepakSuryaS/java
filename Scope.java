import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;

public class Scope{

	private int[] elements;
	public int maximumDifference;
	private int max = 0, min = 0;
	
	Scope(int[] arr){
		this.elements = arr;
	}
	
	public int computeDifference(){
	
		for(int val: elements){
			if(val > max) max = val;
		}
		min = max;
		for(int val: elements){
			if(val < min) min = val;
		}
		
		maximumDifference = max - min;
		
		return maximumDifference;
		
	}
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
