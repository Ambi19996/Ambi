package ambifelloship;

import java.util.Random;
import java.util.Scanner;

public class HeadTail {
	public static void main(String [] args)
    {
        
    Scanner scan=new Scanner(System.in);
    int n=scan.nextInt();
    Random random=new Random();
    double head=0;double tail=0;
    for(int i=0;i<n;i++) {
    double d=Math.random();	
    	if(d<0.5) 
    		tail++;
    	else 
    		
    		head++;
    	
    }
    System.out.println("head"+(head/n)*100);
    System.out.println("tail"+(tail/n)*100);
         
      
        
        
    }}