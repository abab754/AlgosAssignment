package SortingAlgos;

import java.util.Arrays;
import java.util.HashMap;

public class CountingSort {
    public int getNumUniqueElements(int [] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i: arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }
        return hm.size();
    }

    public int getMax(int [] arr){
        int max =0;
        for(int i : arr){
            if(i > max){
                max=i;
            }
        }
        return max;
    }

    public int[] countSort(int [] arr){
        int k = getMax(arr);
        int [] count = new int[k+1];
        Arrays.fill(count, 0);


        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }

        for(int i =1; i<count.length;i++){
            count[i] = count[i]+count[i-1];
        }
        int [] output = new int[arr.length];

        for(int i = arr.length-1; i>=0;i--){
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        return output;

    }

    public int [] badImplementation(int [] arr){
        int [] count = new int[arr.length];
        int res  [] = new int[arr.length];
        Arrays.fill(count, 0);
//        Arrays.fill(res, 0);

        for(int i =0; i<arr.length-1; i++){
            for(int j = i+1; i<arr.length;i++){
                if(arr[i]<arr[j]){
                    count[j]++;
                }
                else{
                    count[i]++;
                }
            }
        }
        for(int i =0; i<arr.length; i++){
            res[count[i]] = arr[i];
        }
        return res;
    }

    public void printArray(int[] nums){
        for(int n: nums){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
