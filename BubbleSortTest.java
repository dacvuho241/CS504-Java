package ass5;

public class BubbleSortTest {
	public static void main(String[] args) {
		BubbleSort myArr = new BubbleSort();
		int arr[] = {50, -30, 6, 20, -10, 80, 1, 100};
		myArr.bubbleSort(arr);
		myArr.Display(arr);
	}
}
