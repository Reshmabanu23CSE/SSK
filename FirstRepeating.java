package problems;

import java.util.Scanner;

public class FirstRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			count = 0;
			for(int j = i ; j < n ; j++){
				if(a[i] == a[j])
					count++;
			}
			if(count > 1){
				System.out.println(a[i]);
				break;
			}
		}
	}
}
