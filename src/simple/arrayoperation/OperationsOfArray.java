package simple.arrayoperation;

public class OperationsOfArray {
	// delete operation on array
	int deleteElem(int arr[], int n, int x) {
		int i;
		for (i = 0; i < n; i++) {
			if (arr[i] == x)
				break;
		}
		if (i == n)
			return n;
		for (int j = i; j < n - 1; j++)
			arr[j] = arr[j + 1];
		return (n - 1);

	}
//to find the largest element index in an array
	int getlargestElem(int arr[]) {
		int res = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[res])
				res = i;

		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int result;
		OperationsOfArray operation = new OperationsOfArray();
		// result = operation.deleteElem(arr, 5, 6);
		result = operation.getlargestElem(arr);
		System.out.println(result);
	}

}
