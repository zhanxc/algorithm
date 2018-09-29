public int selectSort(int[] a, int n) {
	int minj, i, j, tmp, sw = 0;
	for(i = 0 ; i < n-1 ; i++) {
		//从i开始向数组末尾移动
		minj = i;
		for(j = i ; j < n ; j++) {
			//在未排序部分寻找最小值的下标minj
			if(a[j] < a[minj]) minj = j;
		}
		//与起始元素a[i]交换位置
		tmp = a[i];
		a[i] = a[minj];
		a[minj] = tmp;
		if(minj != i)
		sw++;
	}
	return sw;
}