public class newSorting {
    public void newSorting(int[] A, int size) {
        if (A.length <= size) {
            quickSort(A, 0, A.length-1);
        }
        else {
            int Middle = A.length / 2;
            int[] Left = new int[Middle];
            for (int i = 0; i < Left.length; i++) {
                Left[i] = A[i];
            }

            int[] Right = new int[A.length - Middle];
            for(int i = 0; i < Right.length; i++ ){
                Right[i] = A[i + Left.length];
            }
            newSorting(Left, size);
            newSorting(Right, size);
            mergeSortHalves(A, Left, Right);
        }
    }
    private void mergeSortHalves(int[] A, int[] Left, int[] Right){
        int i = 0;
        int k = 0;
        int j = 0;
        while(i < Left.length || j < Right.length){
            if(i == Left.length){
                A[k] = Right[j];
                j++;
            }
            else if(j == Right.length){
                A[k] = Left[i];
                i++;
            }
            else if(Left[i] < Right[j]) {
                A[k] = Left[i];
                i++;
            }
            else{
                A[k] = Right[j];
                j++;
            }
            k++;
        }

    }

    private void quickSort(int[] A, int start, int finish){
        if(start < finish){
            int location = partition(A, start, finish);
            quickSort(A, start, location - 1);
            quickSort(A, location + 1, finish);
        }
    }

    private int partition(int[] A, int start, int last){
        int pivot = A[start];
        int L = start;
        int temp;

        for(int j=start+1; j<=last; j++){
            if(A[j] < pivot){
                L++;
                temp = A[L];
                A[L] = A[j];
                A[j] = temp;
            }
        }

        temp = A[start];
        A[start] = A[L];
        A[L] = temp;
        return L;
    }
}
