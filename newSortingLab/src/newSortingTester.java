import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class newSortingTester{
    /*
    this test is to see if newSorting works and if this test will passed
    if the numbers are already sorted.
    TEST: Passed
     */
    @Test
    public void newSortingTester1(){
        int[] A = {1,2,3,4,5,6,7};
        newSorting ns = new newSorting();
        ns.newSorting(A, 3);
        assertArrayEquals(A, new int[] {1,2,3,4,5,6,7});
    }
    //this test is to see if all numbers are negatives. if the numbers are negative
    //it should still pass since less than positives.
    // Test: Passed
    @Test
    public void newSortingTester2(){
        int[] A = {-1,-2,-3,-4,-5,-6,-7};
        newSorting ns = new newSorting();
        ns.newSorting(A, 3);
        assertArrayEquals(A, new int[] {-7,-6,-5,-4,-3,-2,-1});
    }
    //this test is to see if all the variables were zero
    //if it fails then to change it i would have to put
    //actual variables for it to sort
    @Test
    public void newSortingTester3(){
        int[] A = {0,0,0,0,0,0,0,0,0,0};
        newSorting ns = new newSorting();
        ns.newSorting(A, 1);
        assertArrayEquals(A, new int[] {0,0,0,0,0,0,0,0,0,0});
    }
    //
    //this test is to see if the code will function when there is no
    //numbers to sort. im predicting that it will fail since nothing is being inputted
    //Test:passed
    @Test
    public void newSortingTester4(){
        int[] A = {};
        newSorting ns = new newSorting();
        ns.newSorting(A, 2);
        assertArrayEquals(A, new int[] {});
    }
    //this test to see if i enter an array of the same number once and
    // put in the expected 1 number if it passes
    //Test:Passed
    @Test
    public void newSortingTester5(){
        int[] A = {1};
        newSorting ns = new newSorting();
        ns.newSorting(A, 3);
        assertArrayEquals(A, new int[] {1});
    }

}
