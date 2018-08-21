import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}
	
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
        for(int i = 0; i < 5;i++) {
            assertTrue("not same", Sortedarr[i] == arr[i]);
        }
    }
    
    public void testNegative(){
        int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        /** Test data contains negative values only **/
        
        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
        for(int i = 0; i < 5;i++) {
            assertTrue("not same", Sortedarr[i] == arr[i]);
        }
    }
    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = -1;
        arr[1] = 4;
        arr[2] = 2;
        arr[3] = -5;
        arr[4] = 5;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -1;
        Sortedarr[2] = 2;
        Sortedarr[3] = 4;
        Sortedarr[4] = 5;
        
        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
        for(int i = 0; i < 5;i++) {
            assertTrue("not same", Sortedarr[i] == arr[i]);
        }
    }
    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = -2;
        arr[2] = 1;
        arr[3] = -2;
        arr[4] = 1;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 1;
        Sortedarr[3] = 1;
        Sortedarr[4] = 1;
        
        SelectionSort temp1 = new SelectionSort();
        arr = temp1.basicSelectionSort(arr);
        for(int i = 0; i < 5;i++) {
            assertTrue("not same", Sortedarr[i] == arr[i]);
        }
    }
}
