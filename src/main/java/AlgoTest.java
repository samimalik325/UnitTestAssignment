package main.java;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlgoTest {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	SortDemoData data = new SortDemoData();

    
//      Test sorting an empty list with Bubble Sort
   
    @Test
    public final void testEmptySort() {
    	
//    	System.out.println("Inside test");
    	
    	data.initializeArray("0");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());    	
    	Assert.assertTrue(outputBuf.toString().equals(""));
    }
    
   
//      Test sorting a list with one element Bubble Sort
     
    @Test
    public final void testSingleSort() {
    	System.out.println("Inside test single sort");
    	data.initializeArray("1 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("1 "));
    }

   //	Test Ascending Values Array with Bubble Sort 
    @Test
    public final void testAscendingSort() {
//    	System.out.println("Inside Double Ascending Sort");
    	data.initializeArray("10 20 30 40 50 60 70");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("10 20 30 40 50 60 70 "));
    }

  // 	Test Descending Array Values with Bubble Sort 
    @Test
    public final void testDoubleDescendingSort() {    	
//    	System.out.println("Inside Double Descending Sort");
    	data.initializeArray("100 99 87 84 92 10 5 3 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("3 5 10 84 87 92 99 100 "));
    }
    
  // 	Test Sort Duplicate Values with Bubble Sort
    
    @Test
    public final void testDuplicateSort() {
        
//    	System.out.println("Inside Duplicate Sort");
    	data.initializeArray("1 1 0 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("0 1 1 "));
    }
    
   // 	Test Same Values in an Array with Bubble Sort
    
    @Test
    public final void testSameValuesinAnArraySort() {
    	
//    	System.out.println("Inside Test Large Sort");
    	data.initializeArray("1 1 1 1 1 1 1 1 1 1 ");
    	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(0).intValue());
		Assert.assertTrue(outputBuf.toString().equals("1 1 1 1 1 1 1 1 1 1 "));
    }

    
////  Test sorting an empty list with Selection Sort
    
@Test
public final void testEmptySelectionSort() {
	
//	System.out.println("Inside test");
	
	data.initializeArray("0");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());    	
	Assert.assertTrue(outputBuf.toString().equals(""));
}


//  Test sorting a list with one element Selection Sort
 
@Test
public final void testSingleSelectionSort() {
//	System.out.println("Inside test single sort");
	data.initializeArray("1 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//	Test Ascending Values Array with Selection Sort 
@Test
public final void testAscendingSelectionSort() {
//	System.out.println("Inside Double Ascending Sort");
	data.initializeArray("10 20 30 40 50 60 70");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("10 20 30 40 50 60 70 "));
}

// 	Test Descending Array Values with Selection Sort 
@Test
public final void testDoubleDescendingSelectionSort() {    	
//	System.out.println("Inside Double Descending Sort");
	data.initializeArray("100 99 87 84 92 10 5 3 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("3 5 10 84 87 92 99 100 "));
}

// 	Test Sort Duplicate Values with Selection Sort

@Test
public final void testDuplicateSelectionSort() {
    
//	System.out.println("Inside Duplicate Sort");
	data.initializeArray("1 1 0 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("0 1 1 "));
}

// 	Test Same Values in an Array with Selection Sort

@Test
public final void testSameValuesinAnArraySelectionSort() {
	
//	System.out.println("Inside Test Large Sort");
	data.initializeArray("1 1 1 1 1 1 1 1 1 1 ");
	StringBuffer outputBuf = data.runAlgo(Integer.valueOf(1).intValue());
	Assert.assertTrue(outputBuf.toString().equals("1 1 1 1 1 1 1 1 1 1 "));
}

//Test sorting an empty list with Insertion Sort

@Test
public final void testEmptyInsertionSort() {

//System.out.println("Inside test");

data.initializeArray("0");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());    	
Assert.assertTrue(outputBuf.toString().equals(""));
}


//Test sorting a list with one element Insertion Sort

@Test
public final void testSingleInsertionSort() {
//System.out.println("Inside test single sort");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Ascending Values Array with Insertion Sort 
@Test
public final void testAscendingInsertionSort() {
//System.out.println("Inside Double Ascending Sort");
data.initializeArray("10 20 30 40 50 60 70");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("10 20 30 40 50 60 70 "));
}

//	Test Descending Array Values with Insertion Sort 
@Test
public final void testDoubleDescendingInsertionSort() {    	
//System.out.println("Inside Double Descending Sort");
data.initializeArray("100 99 87 84 92 10 5 3 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("3 5 10 84 87 92 99 100 "));
}

//	Test Sort Duplicate Values with Insertion Sort

@Test
public final void testDuplicateInsertionSort() {

//System.out.println("Inside Duplicate Sort");
data.initializeArray("1 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 1 "));
}

//	Test Same Values in an Array with Insertion Sort

@Test
public final void testSameValuesinAnArrayInsertionSort() {

//System.out.println("Inside Test Large Sort");
data.initializeArray("1 1 1 1 1 1 1 1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(2).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 1 1 1 1 1 1 1 "));
}


//Test sorting an empty list with Merge Sort

//@Test
//public final void testEmptyMergeSort() {
//
//System.out.println("Inside test");
//
//data.initializeArray("0");
//StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());    	
//Assert.assertTrue(outputBuf.toString().equals(""));
//}


//Test sorting a list with one element Merge Sort

@Test
public final void testSingleMergeSort() {
//System.out.println("Inside test single sort");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Ascending Values Array with Merge Sort 
@Test
public final void testAscendingMergeSort() {
//System.out.println("Inside Double Ascending Sort");
data.initializeArray("10 20 30 40 50 60 70");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("10 20 30 40 50 60 70 "));
}

//	Test Descending Array Values with Merge Sort 
@Test
public final void testDoubleDescendingMergeSort() {    	
//System.out.println("Inside Double Descending Sort");
data.initializeArray("100 99 87 84 92 10 5 3 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("3 5 10 84 87 92 99 100 "));
}

//	Test Sort Duplicate Values with Merge Sort

@Test
public final void testDuplicateMergeSort() {

//System.out.println("Inside Duplicate Sort");
data.initializeArray("1 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 1 "));
}

//	Test Same Values in an Array with Insertion Sort

@Test
public final void testSameValuesinAnArrayMergeSort() {

//System.out.println("Inside Test Large Sort");
data.initializeArray("1 1 1 1 1 1 1 1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(3).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 1 1 1 1 1 1 1 "));
}

////Test sorting an empty list with Quick Sort
//
//@Test
//public final void testEmptyQuickSort() {
//
//System.out.println("Inside test");
//
//data.initializeArray("0");
//StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());    	
//Assert.assertTrue(outputBuf.toString().equals(""));
//}


//Test sorting a list with one element Quick Sort

@Test
public final void testSingleQuickSort() {
//System.out.println("Inside test single sort");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Ascending Values Array with Quick Sort 
@Test
public final void testAscendingQuickSort() {
//System.out.println("Inside Double Ascending Sort");
data.initializeArray("10 20 30 40 50 60 70");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("10 20 30 40 50 60 70 "));
}

//	Test Descending Array Values with Quick Sort 
@Test
public final void testDoubleDescendingQuickSort() {    	
//System.out.println("Inside Double Descending Sort");
data.initializeArray("100 99 87 84 92 10 5 3 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("3 5 10 84 87 92 99 100 "));
}

//	Test Sort Duplicate Values with Quick Sort

@Test
public final void testDuplicateQuickSort() {

//System.out.println("Inside Duplicate Sort");
data.initializeArray("1 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 1 "));
}

//	Test Same Values in an Array with Quick Sort

@Test
public final void testSameValuesinAnArrayQuickSort() {

//System.out.println("Inside Test Large Sort");
data.initializeArray("1 1 1 1 1 1 1 1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(4).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 1 1 1 1 1 1 1 "));
}



//Test sorting an empty list with Heap Sort

@Test
public final void testEmptyHeapSort() {

//System.out.println("Inside test");

data.initializeArray("0");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());    	
Assert.assertTrue(outputBuf.toString().equals(""));
}


//Test sorting a list with one element Heap Sort

@Test
public final void testSingleHeapSort() {
//System.out.println("Inside test single sort");
data.initializeArray("1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 "));
}

//Test Ascending Values Array with Heap Sort 
@Test
public final void testAscendingHeapSort() {
//System.out.println("Inside Double Ascending Sort");
data.initializeArray("10 20 30 40 50 60 70");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("10 20 30 40 50 60 70 "));
}

//	Test Descending Array Values with Heap Sort 
@Test
public final void testDoubleDescendingHeapSort() {    	
//System.out.println("Inside Double Descending Sort");
data.initializeArray("100 99 87 84 92 10 5 3 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("3 5 10 84 87 92 99 100 "));
}

//	Test Sort Duplicate Values with Merge Sort

@Test
public final void testDuplicateHeapSort() {

//System.out.println("Inside Duplicate Sort");
data.initializeArray("1 1 0 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("0 1 1 "));
}

//	Test Same Values in an Array with Insertion Sort

@Test
public final void testSameValuesinAnArrayHeapSort() {

//System.out.println("Inside Test Large Sort");
data.initializeArray("1 1 1 1 1 1 1 1 1 1 ");
StringBuffer outputBuf = data.runAlgo(Integer.valueOf(5).intValue());
Assert.assertTrue(outputBuf.toString().equals("1 1 1 1 1 1 1 1 1 1 "));
}


    

}