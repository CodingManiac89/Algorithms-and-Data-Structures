import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CodeSprint {

    public static void main(String[] args) {
        
        int[] score = new int[]{10,5,20,20,4,5,2,25,1};
        
        HashSet<Integer> maxSet = new HashSet<>();
        HashSet<Integer> minSet = new HashSet<>();
        int min = score[0];
        int max = score[0];
        for(int i=1;i<score.length-1;i++){
        	if(score[i] > max){
        		maxSet.add(score[i]);
        		max = score[i];
        	}
        	else if(score[i]<min){
        		minSet.add(score[i]);
        		min = score[i];
        	}
        }
        
        System.out.println(maxSet.size()+" "+minSet.size());
    }
}
