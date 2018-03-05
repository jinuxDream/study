/**
 *
 * 选择排序（Selection sort）是一种简单直观的排序算法。它的工作原理是每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。 选择排序是不稳定的排序方法（比如序列[5， 5， 3]第一次就将第一个[5]与[3]交换，导致第一个5挪动到第二个5后面）。
 *
 * 折半插入排序（binary insertion sort）是对插入排序算法的一种改进，所谓排序算法过程，就是不断的依次将元素插入前面已排好序的序列中。
 * Created by jyp on 2017/12/14.
 */
public class SortTest {
    static int[] array1 = {11,3,5,55,7,8,1,2};
    static int[] array2 = {11,3,5,55,7,8,1,2};
    public static void main(String[] args) {
        // 测试折半 所谓排序算法过程，就是不断的依次将元素插入前面已排好序的序列中
        binaryInsertSort(array1);
        for (int i:array1)
            System.out.print(i + ", ");

        selectSort(array2);
        System.out.println();
        // 测试选择    每一次从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完
        for (int i:array2)
            System.out.print(i + ", ");
    }

    /**
     * 折半排序
     * 对插入排序算法的一种改进，由于排序算法过程中，就是不断的依次将元素插入前面已排好序的序列中。
     * 由于前半部分为已排好序的数列，这样我们不用按顺序依次寻找插入点，可以采用折半查找的方法来加快寻找插入点的速度。
     * @param array
     */
    private static void binaryInsertSort(int[] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];  // 将arr[i]暂存到arr[0]
            int low = 0;
            int high = i - 1;
            while(low <= high){ // 在arr[low..high]中折半查找有序插入的位置
                int mid = (low + high) / 2; // 折半
                if(temp < array[mid]){ // 关键字相同时，使low = m + 1，到高半区，保证稳定性
                    high = mid - 1;// 插入点在低半区
                }else{
                    low = mid + 1; // 插入点在高半区
                }
            }
            for(int j = i; j >= low + 1; j--){
                array[j] = array[j - 1];// 记录后移
            }
            array[low] = temp;// 插入
        }
    }

    /**
     * 选择排序
     * 选择排序法的第一层循环从起始元素开始选到倒数第二个元素，
     * 主要是在每次进入的第二层循环之前，将外层循环的下标赋值给临时变量，
     * 接下来的第二层循环中，如果发现有比这个最小位置处的元素更小的元素，则将那个更小的元素的下标赋给临时变量，
     * 最后，在二层循环退出后，如果临时变量改变，则说明，有比当前外层循环位置更小的元素，需要将这两个元素交换.
     * @param array
     */
    private static void selectSort(int[] array){
        int minIndex = 0;
        int temp = 0;
        if (null == array || array.length == 0)
            return;
        for (int i = 0;i<array.length-1;i++){ // 从起始元素开始选到倒数第二个元素
            minIndex=i;// 无序区的最小数据数组下标
            for (int j = i+1; j< array.length;j++){ // 循环剩下的无序数据
                // 在无序区中找到最小数据并保存其数组下标
                if (array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            if (minIndex != i){
                // 如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
                temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }

}
