/*
author:pomelos
date:2018/09/26
time:15:17
*/

public void bubbleSort(int a, int n){
	public void bubbleSort(int[] arr,int n) {
		int sw = 0, tmp;
		boolean flag = true;
		for(int i = 0 ; flag ; i++) {
			flag = false;
			for(int j = n-1 ; j >= i+1 ; j--) {
				if(arr[j] < arr[j-1]) {
					tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
					flag = true;
					sw++;
				}
			}
		}
	}
}
