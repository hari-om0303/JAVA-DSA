package Questions;

import java.util.HashSet;

public class union_of_2_arr {
    public static int hashset_size(int [] arr1 , int [] arr2){
        HashSet<Integer> set = new HashSet<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i=0; i<n1; i++){
            set.add(arr1[i]);
        }
        for (int i=0; i<n2; i++){
            set.add(arr2[i]);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int [] arr1 = {7,3,9};
        int [] arr2 = {6,3,9,2,9,4,1};
      int ans = hashset_size(arr1, arr2);
        System.out.println(ans);
    }
}
