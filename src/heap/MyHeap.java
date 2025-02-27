package heap;

import java.util.Arrays;

public class MyHeap {
    int size;
    int[] arr;


    MyHeap(){
        arr = new int[150];
        arr[0] = -1;
        size =1;
//          size =0;
    }


    void swap(int[] arr, int parentI, int childI){
        int temp = arr[parentI];
        arr[parentI] = arr[childI];
        arr[childI] = temp;
    }
    void insertion(int val){

        // size pe add kro val
        // jb tk index 1 se bdi h jb tk check kro ki parent chota to nhi h uske child se
        // agr chota h to parent or child ko swap mar do

        // 1st
        int index = size;
        arr[size] = val;
         // 2nd
        size++;
        while(index > 1){
            int parentI = index/2;
            if(arr[parentI] < arr[index]){
                swap(arr,parentI,index);
                index = parentI;
            }else return;
        }
    }

    void print(){
        System.out.println("\nHeap is : ");
        for (int i = 0; i<size; i++) System.out.print(arr[i]+" ");
    }

    void deletion(){
        // 1st bnda delete hota h heap deletion me
        // steps-
        // 1st bnde ki jagah sbse last bnda dal do
        // 1st index k child me se larger child pta kro
        // agr larger child parent se bhi bda h to swap kr do
        // ye process sari index k liye kro

        size--;
        arr[1] = arr[size];

        int index = 1;
        while(index < size){
            int leftI  = index*2;
            int rightI  = index*2+1;
            int maxI = arr[leftI] > arr[rightI] ? leftI : rightI;

            if(arr[index] < arr[maxI]){
                swap(arr,index,maxI);
                index = maxI;
            }else return;
        }

    }


    void heapify(int[] array, int size, int i) {
        int larger = i;
        int left = 2 * i, right = 2 * i + 1;
        if (left <= size && array[left] > array[larger]) {
            larger = left;
        }
        if (right <= size && array[right] > array[larger]) {
            larger = right;
        }
        if (larger != i) {
            swap(array, larger, i);
            heapify(array , size,larger);
        }
    }


    public static void main(String[] args) {
        MyHeap obj = new MyHeap();
        obj.insertion(4);
        obj.insertion(40);
        obj.insertion(45);
        obj.insertion(60);
        obj.insertion(100);
//        obj.insertion(35);
        obj.print();
        obj.deletion();
        obj.print();

        int[] test = {-1, 10, 30, 5, 50, 45, 20};
        int size = test.length - 1;
        System.out.println("\n"+Arrays.toString(test));
        for (int i = size / 2; i >= 1; i--) {
            obj.heapify(test, size, i);
        }
        System.out.println("\n"+Arrays.toString(test));


    }

}
