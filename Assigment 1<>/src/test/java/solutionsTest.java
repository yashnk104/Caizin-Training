import org.example.solutions;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class solutionsTest {
    solutions solver = new solutions();

    @Test
    public void test_PairFound(){
        int [] arr={1,4,6,5};
        int n= arr.length;
        int target = 10;
        ArrayList<Integer> result = solver.Solutions1(n,arr,target);
        assertEquals(Arrays.asList(4,6),result);
    }
    @Test
    public void test_Pair_not_Found(){
        int [] arr={1,4,6,5};
        int n= arr.length;
        int target = 12;
        ArrayList<Integer> result = solver.Solutions1(n,arr,target);
        assertTrue(result.isEmpty());
    }
    @Test
    public void test_PairFound_for_negative_values(){
        int [] arr={1,4,8,-4};
        int n= arr.length;
        int target = 0;
        ArrayList<Integer> result = solver.Solutions1(n,arr,target);
        assertEquals(Arrays.asList(-4,4),result);
    }




}