import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertTest {
    SearchInsert searchInsert;
    @BeforeEach
    public void init(){
        searchInsert = new SearchInsert();
    }

    @Test
    public void testCase1(){
        assertEquals(2,searchInsert.searchInsert(new int[]{1, 3, 5, 6},5));
    }
    @Test
    public void testCase2(){
        assertEquals(1,searchInsert.searchInsert(new int[]{1, 3, 5, 6},2));
    }

    @Test
    public void testCase3(){
        assertEquals(4,searchInsert.searchInsert(new int[]{1, 3, 5, 6},7));
    }
    @Test
    public void testCase4(){
        assertEquals(0,searchInsert.searchInsert(new int[]{1, 3, 5, 6},0));
    }
    @Test
    public void testCase5(){
        assertEquals(0,searchInsert.searchInsert(new int[]{1},0));
    }
    @Test
    public void testCase6(){
        assertEquals(0,searchInsert.searchInsert(new int[]{1},1));
    }

}