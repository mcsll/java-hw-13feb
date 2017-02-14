/**
 * CS152 Section 01, Homework for 13-Feb-2017
 * Searching class contains methods for Linear and Binary searching
 * @author (Matthew Sullivan)
 * @version (Feb 13, 2017)
 */

public class Searching
{
    public static Comparable getIndexLinear(Comparable[] compList, Comparable searchTerm)
    {
        for(int i = 0; i < compList.length; i++)
        {
            if(compList[i].compareTo(searchTerm) == 0)
            {
                return i;
            }
        }
        return null;
    }

    // Binary search
    public static Comparable getIndexBinary(Comparable[] compList, Comparable searchTerm)
    {
        int startIndex = 0;
        int endIndex = compList.length-1;
        int middleIndex;

        // This call to insertionSort method is included to ensure that the array is
        // sorted in ascending order before the binary search is attempted. The order
        // of method calls in TestSearching already yields a sorted array before the
        // call is made to getIndexBinary(), however, so this isn't strictly necessary.
        compList = Searching.insertionSort(compList);

        while (startIndex <= endIndex)
        {
            middleIndex = (startIndex + endIndex)/2;
            if (compList[middleIndex].compareTo(searchTerm) == 0)
            {
                return middleIndex;
            }
            else
            {
                if(compList[middleIndex].compareTo(searchTerm) < 0)
                    startIndex = middleIndex + 1;
                else
                    endIndex = middleIndex - 1;
            }
        }
        return null;
    }

    private static Comparable[] insertionSort(Comparable[] compList)
    {
        for(int i = 1; i < compList.length; i++)
        {
            Comparable temp = compList[i];
            int j = i;
            while(j > 0 && temp.compareTo(compList[j-1]) < 0)
            {
                compList[j] = compList[j-1];
                j--;
            }
            compList[j] = temp;
        }
        return compList;
    }

    public static Comparable[] getSortedList(Comparable[] compList)
    {
        return Searching.insertionSort(compList);
    }
}
