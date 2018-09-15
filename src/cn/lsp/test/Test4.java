package cn.lsp.test;

/**
 * 
 * @author lsp 常见排序算法
 */
public class Test4 {
	private static int[] array = { 2, 15, 8, 5, 3, 5, 37, 43, 23, 7, 12 };

	// private static int[] array = { 2, 3, 5, 7, 8, 12, 23, 43, 37 };

	public static void main(String[] args) {
		System.out.println("排序前：");
		for (int item : array) {
			System.out.print(item + " ");
		}
		System.out.println();

		// bubbleSortBetter(array);
		// System.out.println("冒泡排序后：");
		// for (int item : array) {
		// System.out.print(item + " ");
		// }

		// selectionSort(array);
		// System.out.println("选择排序后：");
		// for (int item : array) {
		// System.out.print(item + " ");
		// }

		// insertSort(array);
		// System.out.println("插入排序后：");
		// for (int item : array) {
		// System.out.print(item + " ");
		// }

		quickSort(array,0,array.length-1);
		System.out.println("快速排序后：");
		for (int item : array) {
			System.out.print(item + " ");
		}

		// shellSort(array);
		// System.out.println("希尔排序后：");
		// for (int item : array) {
		// System.out.print(item + " ");
		// }
	}

	// 冒泡排序
	public static void bubbleSort(int[] array) {
		// 外层循环控制循环次数，内层循环遍历数组
		for (int i = array.length - 1; i > 0; i--) {
			// j每次到i是因为i之后的数是已排序的，没必要再比较
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
		}
	}

	// 优化冒泡排序
	public static void bubbleSortBetter(int[] array) {

		// 外层循环控制循环次数,一共循环n-1次，内层循环遍历数组
		for (int i = array.length - 1; i > 0; i--) {
			boolean isExchange = false;
			// j每次到i是因为i之后的数是已排序的，没必要再比较
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					isExchange = true;
				}
			}
			// 如果在一轮排序中没有发生交换，则提前结束排序，说明数组已经完成排序
			if (!isExchange) {
				break;
			}

		}
	}

	// 选择排序
	public static void selectionSort(int[] array) {
		// 控制循环次数，一共循环n-1次
		for (int i = 0; i < array.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = tmp;
		}
	}

	// 插入排序
	public static void insertSort(int[] array) {
		// 外层循环控制循环次数，循环n-1次
		for (int i = 1; i < array.length; i++) {
			int tmp = array[i];
			int j = i;
			// 内层循环从后往前比较大小，只要小于就移动位置
			for (; j > 0; j--) {
				if (tmp < array[j - 1]) {
					array[j] = array[j - 1];
				} else {
					break;
				}
			}
			array[j] = tmp;
		}
	}

	// 希尔排序
	public static void shellSort(int[] array) {
		// 增量，初始为数组长度的三分之一
		int gap = array.length / 2;
		// 与插入排序类似，相当于多次插入排序
		while (gap > 0) {
			for (int i = gap; i < array.length; i += gap) {
				int tmp = array[i];
				int j = i;
				// 内层循环从后往前比较大小，只要小于就移动位置
				for (; j > 0; j -= gap) {
					if (tmp < array[j - gap]) {
						array[j] = array[j - gap];
					} else {
						break;
					}
				}
				array[j] = tmp;
			}
			gap = gap / 2;
		}
	}

	// 归并排序
	public static void mergeSort(int[] array) {

	}

	// 快速排序
	public static void quickSort(int[] array, int left, int right) {
		if (left < right) {
			int i = left;
			int j = right;
			int flag = array[i];
			while (i < j) {
				while (i < j && array[j] > flag) {
					j--;
				}
				if (i < j) {
					array[i++] = array[j];
				}
				while (i < j && array[i] < flag) {
					i++;
				}
				if (i < j) {
					array[j--] = array[i];
				}
			}
			array[i] = flag;
			quickSort(array, left, right-1);
			quickSort(array, left+1, right);
		}
	}

	// 堆排序
	public static void heapSort(int[] array) {

	}
}
