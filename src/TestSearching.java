/**
 * CS152 Section 01, Homework for 13-Feb-2017
 * TestSearching class tests Linear and Binary searching with array of Strings
 * @author (Matthew Sullivan)
 * @version (Feb 13, 2017)
 */

import java.util.Arrays;

public class TestSearching
{
    public static void main(String[] args)
    {
        String[] cityList = new String[]{"London", "Berlin", "Rome", "Dublin", "Warsaw",
                "Madrid", "Bern", "Stockholm", "Copenhagen", "Oslo", "Budapest", "Prague",
                "Bratislava", "Paris", "Vienna"};

        System.out.println("Starting array of strings, unsorted: ");
        System.out.println(Arrays.toString(cityList));

        // This call to getSortedList() method invokes the private insertionSort() method,
        // which sorts the array stored behind the cityList reference, so the sorting
        // of the array is now complete for the next steps.
        System.out.println("\nArray of strings sorted by insertion method: ");
        System.out.println(Arrays.toString(Searching.getSortedList(cityList)));

        System.out.println("\nIndex of search string 'Paris' found using linear search: ");
        System.out.println(Searching.getIndexLinear(cityList, "Paris"));

        System.out.println("\nIndex of search string 'Paris' found using binary search: ");
        System.out.println(Searching.getIndexBinary(cityList, "Paris"));

        System.out.println("\nLinear search for 'New York': ");
        System.out.println(Searching.getIndexLinear(cityList, "New York"));

        System.out.println("\nBinary search for 'New York': ");
        System.out.println(Searching.getIndexBinary(cityList, "New York"));
    }
}
