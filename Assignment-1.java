public ArrayList<Integer> Solutions1(int n, int []arr, int target){
    ArrayList<Integer> sol = new ArrayList<>();
    int i =0,j= n-1;
    Arrays.sort(arr);
    while( i < j ){
        int sum = arr[i]+arr[j];
        if(sum > target) j--;
        else if(sum < target) i++;
        else{
            sol.add(arr[i]);
            sol.add(arr[j]);
            break;
        }
    }
    return sol;
}

void main() {
    int n= 5;
    int[] arr = {1,4,6,5};
    int target = 10;
    ArrayList<Integer> ans1 = Solutions1(n,arr,target);
    System.out.println(ans1);

}
