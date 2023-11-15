public class Solution26 {
    static int removeDuplicates(int arr[])
    {
        if (arr.length == 0 || arr.length == 1)
            return arr.length;

        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];

        temp[j++] = arr[arr.length - 1];

        for (int i = 0; i < j; i++)
            arr[i] = temp[i];

        return j;
    }
}
