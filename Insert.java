/*
author:pomelos
date:2018/09/26
time:15:17
*/
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