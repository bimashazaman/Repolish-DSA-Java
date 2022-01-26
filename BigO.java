// what is Big O?
// Big O is a measure of the time complexity of an algorithm.

//Big O gives an upper bound of complexity in the worst case, helping the quantify performance as the input size increases.

// Big O is a measure of the worst case time complexity of an algorithm.

// how to calculate Big O?
// to calculate Big O, we need to know the time complexity of the algorithm.
// time complexity is the number of steps it takes to complete the algorithm.


// what is space complexity?
// space complexity is the number of memory locations needed to complete the algorithm.

//***********Complexities ordered in the form of smallest to biggest **************/

//=====================================================

//Constant Time Complexity : O(1)

//logarithmic Time Complexity : O(log n)

//Linear Time Complexity : O(n)

//Linearithmic Time Complexity : O(n log n)

//Quadratic Time Complexity : O(n^2)

//Cubic Time Complexity : O(n^3)

//Exponential Time Complexity : O(2^n)

//Factorial Time Complexity : O(n!)


//=====================================================

//properties of Big O

//O (n + c) = O (n)
//O (n * c) = O (n)

// f(n) = 7log(n)^3 + 15n^2 + 2n^3 + 8
//O(f(n)) = O(n^3)


//Constant Time Complexity : O(1)
//=================================
//a:=1
//b:=2
//c:=3

//i := 0
//while i < 11 do
//  i := i + 1

//==================================

//Linear Time Complexity : O(n)
//==================================

//i := 0
//while i < n do
//  i := i + 1

//f(n) = n 
//O(f(n)) = O(n)

//==================================

//Quadratic Time Complexity : O(n^2)
//==================================

// for(int i = 0; i < n; i++)
// {
//     for(int j = 0; j < n; j++)
//     {
//         //do something
//     }
// }

//f(n) = n*n = n^2
//O(f(n)) = O(n^2)

//focus on the second loop, since i goes from [0, n] the amount looping done is directly detarmined by what i is. remark that if i=0, we do n work, if i  = 1, we do n-1 work , if i = 2, we do n-2 work, and so on.

//what if (n) + (n-1) + (n-2) + (n-3) + (n-4) + (n-5) + (n-6) + (n-7) + (n-8) + (n-9) + (n-10) + 3 + 2 + 1 = n^2

//how to calculate n^2?
//n^2 = n*n
//O(n(n+1)/2) = O(n^2)

//==================================

//Exponential Time Complexity : O(2^n)
//==================================

// //suppose we have a sorted array and we want to find the index of a value in the array. we can do this in O(log n) time.

// low := 0
// high := n - 1
// while low <= high do
// {
//     mid := (low + high) / 2

//     if a[mid] == x
//     {
//         return mid
//     }
//     else if a[mid] < x
//     {
//         low := mid + 1
//     }
//     else
//     {
//         high := mid - 1
//     }
//return -1 // value not found
// }

//==================================







