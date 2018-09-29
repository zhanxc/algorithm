public void insertSort(int[] arr, int n) {
		int j, i, v;
		for(i = 1 ; i < n ; i++) {
			v = arr[i];
			j = i - 1;
			while(j >= 0 && arr[j] > v) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = v;
	}
}
public List<Integer> getG(int n) {
		List<Integer> list = new ArrayList<>();
		do {
			n = n/3 + 1;
			list.add(n);
		}while(n != 1);
		return list;
	}
public void shellSort(int[] a, int n, List<Integer> g) {
		for(int i = 0 ; i < g.size() ; i++) {
			insertSort(a, n);
	}
}