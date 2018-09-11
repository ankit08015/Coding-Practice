package QuickSort;

public class QuickSort {

    public static void main(String [] arg){
        int[] a= {11,4,5,2,9,98,7,43,0,45,1, 7, 0, 0, 6, 8, 9};

        Sorting sort= new Sorting();

        a= sort.sortQ(a);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }





}

class Sorting {

    public int[] sortQ(int[] a) {
        if (a.length < 2) return a;

        else {
            int pivot = a[0];
            int less = 0, more = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > pivot) more++;
                else {
                    less++;
                }
            }
            int[] lessArr = new int[less];
            int[] moreArr = new int[more];
            int l = 0;
           int  m = 0;
            for (int i = 1; i < a.length; i++) {
                if (a[i] > pivot) {
                    moreArr[m] = a[i];
                    m++;
                } else {
                    lessArr[l] = a[i];
                    l++;
                }
            }

            return mergeArr(sortQ(lessArr), pivot, sortQ(moreArr));

        }

    }

    public int[] mergeArr(int[] less, int pivot, int[] more) {
        int[] newArr = new int[less.length + 1 + more.length];
        for (int i = 0; i < less.length; i++) {
            newArr[i] = less[i];
        }
        newArr[less.length] = pivot;
        for (int i = 0; i < more.length; i++) {
            newArr[less.length + 1 + i] = more[i];
        }

        return newArr;
    }
}
