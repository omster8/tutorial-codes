import java.util.ArrayList;
import java.util.Arrays;

public class TutorialCodes
{
  public int sequentialSearch (int[] arr, int search)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == search)
        return i;
    }
    return -1;
  }
  
  public static int recursiveBinarySearch (int[] arr, int search, int start, int end)
  {
    int middle = (start + end)/2;
    if (end < start)
      return -1;
    if (search > arr[middle])
      return recursiveBinarySearch (arr, search, middle+1, end);
    if (search < arr[middle])
      return recursiveBinarySearch (arr, search, start, middle-1);
    return middle;
  }
  
  public static int iterativeBinarySearch (int[] arr, int search)
  {
    int start = 0, end = arr.length - 1, middle;
    while (!(end < start))
    {
      middle = (start + end)/2;
      if (search > arr[middle])
        start = middle + 1;
      else if (search < arr[middle])
        end = middle - 1;
      else
        return middle;
    }
    return -1;
  }
  
  public static void selectionSort (int[] arr)
  {
    int n = arr.length, tempMaxIndex, temp;
    while (n > 1)
    {
      tempMaxIndex = 0;
      for (int i = 0; i < n; i++)
      {
        if (arr[i] > arr[tempMaxIndex])
          tempMaxIndex = i;
      }
      temp = arr[tempMaxIndex];
      arr[tempMaxIndex] = arr[n-1];
      arr[n-1] = temp;
      n--;
    }
  }
  
  public static void insertionSort (int[] arr)
  {
    int k = 1;
    while (k < arr.length)
    {
      int insertElement = arr[k];
      for (int i = k-1; i >= 0; i--)
      {
        if (insertElement > arr[i])
        {
          arr[i+1] = insertElement;
          break;
        }
        if (i == 0)
        { 
          arr[i+1] = arr[i];
          arr[i] = insertElement;
          break;
        }
        arr[i+1] = arr[i];
      }
      k++;
    }
  }
  
  public static int[] mergeArrays (int[] arr1, int[] arr2)
  {
    int smallerArrLength = Math.min (arr1.length, arr2.length);
    int[] mergedArr = new int[arr1.length + arr2.length];
    int arr1FirstIndex = 0, arr2FirstIndex = 0;
    for (int i = 0; i < mergedArr.length; i++)
    {
      if (arr1FirstIndex >= arr1.length)
      {
        mergedArr[i] = arr2[arr2FirstIndex];
        arr2FirstIndex++;
      }
      else if (arr2FirstIndex >= arr2.length)
      {
        mergedArr[i] = arr1[arr1FirstIndex];
        arr1FirstIndex++;
      }
      else
      {
        mergedArr[i] = Math.min (arr1[arr1FirstIndex], arr2[arr2FirstIndex]);
        if (arr1[arr1FirstIndex] < arr2[arr2FirstIndex])
          arr1FirstIndex++;
        else
          arr2FirstIndex++;
      }
    }
    return mergedArr;
  }
  
  public static int[] mergeSort (int[] arr)
  {
    if (arr.length == 1)
      return arr;
    int[] firstHalf = mergeSort (Arrays.copyOfRange (arr, 0, arr.length/2));
    int[] secondHalf = mergeSort (Arrays.copyOfRange (arr, arr.length/2, arr.length));
    return mergeArrays (firstHalf, secondHalf);
  }
  
  public static void quickSort (int[] array, int lowerIndex, int higherIndex)
  {
    int temp;
    int i = lowerIndex;
    int j = higherIndex;
    int pivot = array [lowerIndex + (higherIndex - lowerIndex) / 2]; //Finds pivot number
    while (i <= j)
    {
      while (array [i] < pivot)//Finds a number to the left of the pivot that should be to its right
      {
        i++;
      }
      while (array [j] > pivot)//Finds a number to the right of the pivot that should be to its left
      {
        j--;
      }
      //swaps the numbers
      temp = array [i];
      array [i] = array [j];
      array [j] = temp;
      i++;
      j--;
    }
    if (lowerIndex < j)
      quickSort (array, lowerIndex, j);
    if (i < higherIndex)
      quickSort (array, i, higherIndex);
  }
  
  public static int factorial (int n)
  {
    if (n == 1)
      return 1;
    return n * factorial (n-1);
  }
  
  public static boolean isEven (int n)
  {
    if (n == 0)
      return true;
    return isOdd (n-1);
  }
  
  public static boolean isOdd (int n)
  {
    if (n == 0)
      return false;
    return isEven (n-1);
  }
  
  public static int addUpElementsIterative (int[] arr)
  {
    int sum = 0;
    for (int i : arr)
      sum += i;
    return sum;
  }
  
  public static int addUpElementsRecursive (int[] arr, int index)
  {
    if (index == arr.length-1)
      return arr[index];
    return arr[index] + addUpElementsRecursive (arr, index + 1);
  }
  
  public static void main (String[] args)
  {
  }
}