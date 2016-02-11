package pkg1;

import java.util.Scanner;

public class Grid {
	Scanner sc = new Scanner(System.in);
	
	public void input() {
		
		System.out.println("Enter the interger for size of matrix :");
		int Lsize = sc.nextInt();
		System.out.println("enter the interger for size of matrix for sum :");
		int Ssize = sc.nextInt();

		int arr[][] = new int[Lsize][Lsize];

		if (Lsize <= 1000 && Ssize <= Lsize) {

			for (int i = 0; i < Lsize; i++) {

				for (int j = 0; j < Lsize; j++) {
					System.out.println("Enter the number for index[" + i + "]["
							+ j + "] value");
					arr[i][j] = sc.nextInt();
				}
			}
		
		
			int total=0;
			
		
		
			int start=0;
			int end=Ssize;
			
			for(int i=start; i<end; i++){
				for(int j=start; j<end; j++){
					
					 total += arr[i][j];
				}
				
			}
			start +=start;
			end +=end;
			
			if(Lsize >= end){
			for(int i=start; i<end; i++){
				for(int j=start ; j<end; j++){
					
					 total += arr[i][j];
				}
				
			}
			
			}
			
		
		} else {
			System.out.println("Matrix size must be less then or eqal to 1000");
		}
	}
	
	

	public static void main(String[] args) {
		new Grid().input();
		System.out.println("changes done");
		
	}
}
