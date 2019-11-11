package java8;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

/**
 * Class used to give Max and Min of zip code from list of zip codes
 * @author sahoo
 *
 */
public class ZipCodeRange {

	
	/**
	 * used to give min and max list from a range of zip codes
	 * @param numbers
	 * @return
	 */
	public List<Integer> range(List<Integer> numbers) {
		List<Integer> rangeList=new ArrayList<Integer>();
		Iterator<Integer> iterator = numbers.iterator();
		int firstElement = iterator.next();
		int max = firstElement;
		int min = firstElement;
		while (iterator.hasNext()) {
			int elementValue = iterator.next();
			if (max < elementValue) {
				max = elementValue;
			}
			if (elementValue < min) {
				min = elementValue;
			}
		}
		rangeList.add(min);
		rangeList.add(max);
		System.out.println(min +":"+max);
		return rangeList;

	}
}
