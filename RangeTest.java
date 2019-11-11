package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * class used to make a map of shipped and unshipped zip codes from Range class 
 * @author sahoo
 *
 */
public class RangeTest {

	/**
	 * Method used to return Map object (key,value) , [shipped => {listofshippedzip}, notshipped =>{listofunshippedzip}]
	 * @param rangeList
	 * @param input
	 * @return
	 */
	public Map<String,List> testZipShipping(List<Range> rangeList,List<Integer> input) {
		Map<String,List> map=new HashMap<String,List>();
		List<Integer> shipped=new ArrayList<Integer>();
		List<Integer> notShipped=new ArrayList<Integer>();
		for(int num: input) {
			if(rangeList.stream().filter(k -> k.contains(num)).findAny().isPresent()) {
				System.out.println("Can Shipped :"+num);
				shipped.add(num);
			}else {
				System.out.println("Cant not be Shipped :"+num);
				notShipped.add(num);
			}
		}
		map.put("shipped", shipped);
		map.put("notshipped", notShipped);
		return map;
	}

}
/**
 * class which acccept range of zipcode
 * @author sahoo
 *
 */
class Range{
	int high;
	int low;
	Range(int low,int high){
		this.low=low;
		this.high=high;
	}
	boolean contains(int num) {
		return num > low && num < high;
	}
}