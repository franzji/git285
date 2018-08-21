public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    	
    }
    
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length-1; i++) {
        	int min = i;
            for (int j= i+1; j < x.length; j++) {
                if (x[j] < x[min]) {
                	min = j;
                }
            } // end of inner for loop
            temp = x[min];
            x[min] = x[i];
            x[i] = temp;
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method
}