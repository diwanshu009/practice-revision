//import java.util.*;
public class DSA{
    //Array's Basics
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static int min(int mark[],int n) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(mark[i] < smallest){
               smallest = mark[i];
            }
        }
        return smallest; 
    }
    public static int maxInArray(int num[]){
        int n = num.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static int linear_Search(int dost[], int key) {
        for(int i=0;i<dost.length;i++){
            if(dost[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static int sum(int dost[],int n){
        int sum = 0;
        for(int i=0;i<n;i++){
            sum =  sum + dost[i];
        }
        return sum;
    }
    public static void reverse_array(int arr[], int n){
        int start = 0;
        int end = n-1;
        while(start<=end){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }
    }
    public static void rev_alt(int arr[], int n){
        for(int i=0;i<arr.length;i+=2){
            if(i+1 < arr.length){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }  
        }
    }
    public static void pair(int arr[],int n){
        int tp=0;
        for(int i=0; i<arr.length;i++){
            int curr = arr[i]; 
            for(int j=i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void sum_of_subarray(int arr[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j = i; j<arr.length;j++){
                int end = j;
                sum = 0;
                for(int k= start;k<=end;k++){
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println("MAXIMUM SUM OF SUBARRAY IS : " + max);
    }
    //⭐️
    public static void kadanes(int arr[]){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            sum = sum + arr[i];
            if(sum < 0){
                sum = 0;
            }
            max = Math.max(sum, max);
        }
        System.out.println(max);
    }
    //⭐️
    public static int binarySearch(int arr[],int key){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int mid = start + (end - start)/2;
        while(start <= end){
            if(arr[mid] == key){
                return mid;
            }
            if(key > arr[mid]){
                start= mid +1;
            }
            if(key<arr[mid]){
                end = mid-1;
            }
            mid = start + (end-start)/2;
        } 
        return -1;  
    }
    //Array's Questions 
        public static int trapped_water(int height[]){
        int n = height.length;
        int left_max[] = new int[n];
        left_max[0] = height[0];
        for(int i=1;i<n;i++){
            left_max[i] = Math.max(left_max[i-1], height[i]);
        }
        int right_max[] = new int[n];
        right_max[n-1] = height[n-1];
        for(int i =n-2;i>=0;i--){
            right_max[i] = Math.max(right_max[i+1], height[i]);
        }
        int trap_water =0;
        for(int i =0;i<n;i++){
            int water_level = Math.min(right_max[i],left_max[i]);
            trap_water +=  water_level - height[i];
        }
        return trap_water;
    }
    public static int stock(int arr[]){
        int buy_price = Integer.MAX_VALUE;
        int max_profit =0;
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(buy_price < arr[i]){
                int profit = arr[i] - buy_price;
                max_profit = Math.max(profit, max_profit);
            }else{
                buy_price = arr[i];
                
            }
        }
        return max_profit;
    }
    // Sorting algorithms
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
    }
    public static void insert_sort(int arr[], int n){
        for(int i=1;i<n;i++) {
            int temp = arr[i];
            int j=i-1;
            for(;j>=0;j--){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
        arr[j+1] = temp;
        }
    }
    // 2-D Array's 
    public static void maxIn2_D(int arr[][]){
        int max = Integer.MIN_VALUE;
        int rowIndex = -1;
        for(int i=0;i<arr.length;i++){
            int sum =0;
            for(int j=0;j<arr[0].length;j++){
                sum =  sum + arr[i][j];
                max = Math.max(max, sum);
                rowIndex = i;
            }
        }
        System.out.println(max);
        System.out.println(rowIndex);
    }
    //⭐️
    public static void spiral_print(int arr[][]){
        int startRow = 0;
        int startCol = 0;
        int endRow = arr.length-1;
        int endCol = arr[0].length-1;

        while(startRow <= endRow &&  startCol <= endCol){
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j] + " ");
            }
            for(int i = startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol] + " ");
            }
            for(int j= endCol-1;j>=startCol;j--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(arr[endRow][j] + " ");
            }
            for(int i = endRow-1;i>=startRow+1;i--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(arr[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static int binary_search(int arr[][],int key){
        int row = arr.length;
        int col = arr[0].length;
        int start = 0;
        int end = row*col -1;
        int mid = start + (end - start)/2;

        while(start<=end){
            int element = arr[mid/col][mid%col];
            if(element == key){
                return 1;
            }
            if(element < key){
                start = mid + 1;
            }
            if(element > key){
                end = mid -1;
            }
            mid = start + (end - start)/2;
        }
        return -1;
    }
    public static int diagonal_sum(int arr[][]){
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i][i];
            if(i != arr.length-1-i)
                sum = sum + arr[i][arr.length-1-i];
        }
        return sum;
    }
    public static boolean searchInSoretd2_dArray(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        int element = arr[row][col];

        while(row < arr.length && col >= 0){
            if(element == key){
                System.out.println("key is found at : " + "(" + row + "," + col + ")");
                return true;
            }
            if(element > key){
                col--;
            }
            else{
                row++;
            }
            element = arr[row][col];
        }
        System.out.println("key not found");
        return false;
    }
    // Strings 
    public static void searchChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    // ⭐️
    public static boolean palindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!= str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void reverseString(String str){
        char ch;
        String nstr = "";
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        System.out.println(nstr);
    }
    /*public static char change(char ch){
        if(ch>='a' && ch<='z'){
            return ch;
        }else{
            char temp = ch - 'A' + 'a';
            return temp;
        }
    }*/
    public static float displacement(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir == 'N'){
                y++;
            }else if(dir =='S'){
                y--;
            }else if(dir=='W'){
                x--;
            }else{
                x++;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);
    }
    public static String ToUpperCase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch= Character.toUpperCase(str.charAt(0));  
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    //⭐️
    public static String compress(String str){
        String newStr = "";
        for(int i=0;i<str.length();i++){
            Integer count = 0;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            newStr += str.charAt(i);
            if(count >1){
                newStr += count.toString();
            }
        }
        return newStr;
    }
    public static void largestString(String fruits[]){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    // Bit manipulation
    public static void check(int n){
        int p=1;
        if((n&p) == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static int getIthBit(int n, int i){
        int bitmask = 1 << i;
        if((n & bitmask) == 0){
            return 0;
        }else {
            return 1;
        }
    }
    public static int setIthBit(int n,int i){
        int bitmask = 1<<i;
        return n| bitmask;
    }
    public static int clearIthBit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int updateIthBit(int n,int i, int newBit){
        if(newBit==0){
            return clearIthBit(n, i);
        }else{
            return setIthBit(n, i);
        }
    }
    public static int clearIBits(int n,int i){
        int bitmask = (~0)<<i;
        return n&bitmask;
    }
    public static int clearBitsinrange(int n,int i,int j){
        int a = (~0) << (j+1);
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n&bitmask;
    }
    public static boolean powerOf2(int n){
        return (n&(n-1)) == 0;
    }
    //⭐️
    public static int Countsetbits(int n){
        int count =0;
        while(n>0){
            if((n&1) != 0){
                count ++;
            }
            n= n>>1;
        }
        return count;
    }
    //⭐️
    public static int fastexpo(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1)!= 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    // Recursion
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return ;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if(n==1){
            System.out.print(1 + " " );
            return ;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }
    public static int factorial(int n){
        if(n == 0) {
            return 1;
        }
        int ans = n * factorial(n-1);
        return ans;
    }
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int ans = n + sum(n-1);
        return ans;
    }
    public static int fibonacci(int n){
        if(n <=1){
            return n;
        }
        int last = fibonacci(n-1);
        int slast = fibonacci(n-2);
        return last + slast;
    }
    public static void reverseArrayRecursion(int i,int arr[]){
        int n = arr.length;
        if(i >= n/2){
            return ; 
        }
        int temp = arr[n-i-1];
        arr[n-i-1] = arr[i];
        arr[i] = temp;
        reverseArrayRecursion(i+1, arr);
    }
    public static boolean palindromeRecursion(int i,String str){
        if(i >= str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt((str.length())-i-1)){
            return false ;
        }
        return palindromeRecursion(i+1, str);
    }
    public static boolean isSorted(int i,int arr[]){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(i+1, arr);
    }
    public static int firstOccurence(int i,int key,int arr[]){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(i-1, key, arr);
    }
    public static int power(int x,int n){  //O(n)
        if(n == 0){
            return 1;
        }
        int ans = x * power(x,n-1);
        return ans;
    }
    public static int optimisation(int x,int n){  //O(log n) --> better code than previous one
        if(n == 0){
            return 1;
        }
        int halfPow = optimisation(x, n/2);
        int halfPowSq = halfPow * halfPow;

        if(n % 2 != 0){
            halfPowSq = x * halfPowSq;
        }
        return halfPowSq;
    }
    // Recursion Questions 
    public static int tiling(int n ){
        if(n==0 || n==1){
            return 1;
        }
        int vertical = tiling(n-1);
        int horizontal = tiling(n-2);
        int total = vertical + horizontal;
        return total;
    }
    // ⭐️
    public static void duplicates(String str,int i,StringBuilder newStr,boolean map[]){
        if(i == str.length()){
            System.out.println(newStr);
            return ;
        }
        char curr = str.charAt(i);
        if(map[curr - 'a'] == true){
            duplicates(str, i+1, newStr, map);
        }else{
            map[curr - 'a'] = true;
            duplicates(str, i+1, newStr.append(curr), map);
        }
    }
    public static int pairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int single = pairing(n-1);
        int pair =  (n-1) * pairing(n-2);
        int total = single + pair;
        return total;
    }
    // ⭐️
    public static void binStr(int n,int lastPlace ,String str){
        if(n==0){
            System.out.println(str);
            return ;
        }
        binStr(n-1, 0, str+"0");
        if(lastPlace == 0){
            binStr(n-1, 1, str+"1");
        }
    }
    public static void reverseStr(int i, String str,StringBuilder newStr){
        int n = str.length();
        if(i == str.length()){
            System.out.println(newStr);
            return ;
        }
        char curr = str.charAt(n-i-1);
        reverseStr(i+1, str, newStr.append(curr));
    }
    public static void sorting_recursion(int arr[],int n){
        if(n == 0 || n == 1){
            return ;
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        sorting_recursion(arr, n-1);
    }
    //⭐️
    public static void mergeSort(int arr[],int s,int e){
        if(s >= e){
            return ;
        }
        int mid = s + (e-s)/2;
        mergeSort(arr, s, mid); // left part
        mergeSort(arr, mid + 1, e); // right part
        merge(arr,s,mid,e);
    }
    public static void merge(int arr[],int s,int mid,int e){
        int temp[] = new int[e-s+1];
        int i = s;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j<= e){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= e){
            temp[k++] = arr[j++];
        }
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
    public static int partition(int arr[],int s,int e){
        int pivot = arr[e];
        int i=s-1;
        for(int j=s; j<e;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        i++;
        int temp1 = arr[e];
        arr[e] = arr[i];
        arr[i] = temp1;
        return i;
    }
    public static void quickSort(int arr[],int s,int e){
        if(s >= e){
            return ;
        }
        int p = partition(arr,s,e);
        quickSort(arr, s, p-1); //left part
        quickSort(arr, p+1, e); //right part
    }
    public static void main (String[] args){
        int arr[] = {24,18,38,43,14,40,1,54};
        quickSort(arr, 0, arr.length-1);
        print(arr);
    } 
}