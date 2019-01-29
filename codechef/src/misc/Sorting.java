package misc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	enum Algorithm {
		Merge, R_Quick, Heap, Bubble, Insertion, Selection, 
		Bucket, Counting, Radix, Select, R_Select;
	}

	public static <T extends Comparable<T>> List<T> sort(List<T> list, Algorithm algorithm){
		switch (algorithm) {
		case Merge:
			return mergeSort(list);
		default:
			return null;
		}
	}
	

	public static <T> List<T> sort(List<T> list, Algorithm algorithm, Comparator<T> comparator){
		return null;
	}

	private static <T extends Comparable<T>> List<T> mergeSort(List<T> list) {
		if (list.size() == 1)
			return list;

		int m = list.size() / 2;
		
		List<T> list1 = mergeSort(list.subList(0, m));
		List<T> list2 = mergeSort(list.subList(m, list.size()));
		
		return merge(list1, list2);
	}
	
	/**
	 * Helper function for merging two sorted lists.
	 */
	private static <T extends Comparable<T>> List<T> merge(List<T> list1, List<T> list2) {
		List<T> merged = new ArrayList<>();
		int i1 = 0, i2 = 0;
		int size1 = list1.size();
		int size2 = list2.size();

		while (i1 < size1  &&  i2 < size2) {
			T elem1 = list1.get(i1);
			T elem2 = list2.get(i2);
			
			if (elem1.compareTo(elem2) == 1) {
				merged.add(elem2);
				i2++;
			} else {
				merged.add(elem1);
				i1++;
			}
		}
		
		// Either list is exhausted, append trailing subsequence
		merged.addAll(list1.subList(i1, size1));
		merged.addAll(list2.subList(i2, size2));
		
		return merged;
	}
	
	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>(Arrays.asList(3, 1, 2));
		System.out.println(Sorting.sort(ints, Algorithm.Merge));
	}
}
