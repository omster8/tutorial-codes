import java.util.ArrayList;

public class SumUpElements
{
  public static int sumArrUsingFor (int[] arr)
  {
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
    {
      sum += arr[i];
    }
    return sum;
  }
  
  public static int sumArrUsingForEach (int[] arr)
  {
    int sum = 0;
    for (int n : arr)
    {
      sum += n;
    }
    return sum;
  }
  
  public static int sumArrListUsingFor (ArrayList<Integer> arrList)
  {
    int sum = 0;
    for (int i = 0; i < arrList.size(); i++)
    {
      sum += arrList.get(i);
    }
    return sum;
  }
  
  public static int sumArrListUsingForEach (ArrayList<Integer> arrList)
  {
    int sum = 0;
    for (int n : arrList)
    {
      sum += n;
    }
    return sum;
  }
  
  public static void main (String[] args)
  {
    // play around with the methods here
  }
}