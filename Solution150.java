import java.util.Arrays;

public class Solution150 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i = 0;
            while (i<n){
                nums1[i+m]=nums2[i++];
            }
            Arrays.sort(nums1);
        }
}
