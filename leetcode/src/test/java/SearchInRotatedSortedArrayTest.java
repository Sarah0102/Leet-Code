import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayTest {
    public SearchInRotatedSortedArray searchInRotatedSortedArray;

    @BeforeEach
    public void init(){
        searchInRotatedSortedArray = new SearchInRotatedSortedArray();
    }
    @Test
    public void testCase1(){
        assertEquals(4, searchInRotatedSortedArray.getIndex(new int[] {4,5,6,7,0,1,2},0));
    }
    @Test
    public void testCase2(){
        assertEquals(-1, searchInRotatedSortedArray.getIndex(new int[] {4,5,6,7,0,1,2},3));
    }
    @Test
    public void testCase3(){
        assertEquals(-1, searchInRotatedSortedArray.getIndex(new int[] {1},0));
    }
    @Test
    public void testCase4(){
        assertEquals(2, searchInRotatedSortedArray.getIndex(new int[] {4,5,6,7,0,1,2},6));
    }
    @Test
    public void testCase5(){
        assertEquals(3, searchInRotatedSortedArray.getIndex(new int[] {4,5,6,7,0,1,2},7));
    }
    @Test
    public void testCase6(){
        assertEquals(-1, searchInRotatedSortedArray.getIndex(new int[] {1},2));
    }
}