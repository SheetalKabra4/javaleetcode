import org.junit.jupiter.api.Assertions;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @org.junit.jupiter.api.Test
    void bubbleSortUsingArrayList() {
        //SUT - System under testing
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> integers = Arrays.asList(1, 3, 4, 57, 10);
        bubbleSort.bubbleSortUsingArrayList(integers);
        //Verify
        Assertions.assertEquals(Arrays.asList(1,3,4,10,57),integers);
    }

    @org.junit.jupiter.api.Test
    void bubbleSortUsingArrayList_base() {
        //SUT
        BubbleSort bubbleSort = new BubbleSort();
        List<Integer> integers = Arrays.asList(1, 3, 4, 57, 10);
        bubbleSort.bubbleSortUsingArrayList(null);
        //Verify
        Assertions.assertEquals(Arrays.asList(1,3,4,0,57),integers);
    }
}