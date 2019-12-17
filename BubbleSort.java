package ass5;

public class BubbleSort {
	public void bubbleSort(int a[]) {
		for(int i = 0; i < a.length-1; i++) {
			for(int j = 0; j < a.length-i-1; j++) {
				if(a[j] > a[j+1]) {
					int swap = a[j];
					a[j] = a[j+1];
					a[j+1] = swap;
				}

			}
		}
	}
	
	public void Display(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
