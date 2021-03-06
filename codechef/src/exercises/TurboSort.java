package exercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TurboSort {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> ints = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			ints.add(Integer.parseInt(br.readLine()));
		}
		
		ints = mergeSort(ints);
		
		String intString = ints.stream().map(i -> Integer.toString(i)).collect(Collectors.joining("\n", "\n", ""));
		System.out.print(intString);
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
}
