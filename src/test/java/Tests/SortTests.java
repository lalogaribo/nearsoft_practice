package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.nearsoft.constants.SortArray;

public class SortTests {
	int[] array = {5,2,3,5,4};
	int[] arr = SortArray.sortArray(array);
	
	@Test
	public void tests() {
		Assert.assertEquals(arr[0], array[0]);
	}
}
