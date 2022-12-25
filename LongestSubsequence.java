// todo: Find the Longest Increasing Subsequence from a given Sequence of Integers... Eg:- 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 will have the Longest Increasing Subsequence as 0, 4, 6, 9, 11, 15...

import java.util.Scanner;
import java.util.Stack;
public class LongestSubsequence
{
    //! Finding Subsequence... O(1) time...
    public void FindSubsequence(Stack<Integer> sck, int data)
    {
        if(sck.isEmpty())    // Empty Condition...
        {
            sck.push(data);
            return;
        }
        if(sck.peek() > data)
        {
            sck.pop();
            sck.push(data);
            return;
        }
        sck.push(data);
        return;
    }
    //! Printing the Subsequence... O(n) time...
    public void PrintSubsequence(Stack<Integer> sck, Stack<Integer> sck1)
    {
        while(!sck.isEmpty())
        {
            int pop = sck.pop();
            sck1.push(pop);
        }
        System.out.println("The Longest Increasing Subsequence is : ");
        while(!sck1.isEmpty())
        {
            System.out.print(sck1.peek() + " ,");
            sck1.pop();
        }
        return;
    }
    //! Main Function begins...
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int x, a;
        LongestSubsequence longestsequence = new LongestSubsequence();
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> stack1 = new Stack<Integer>();
        System.out.print("Enter the number of Integers in the Sequence : ");
        x = scanner.nextInt();
        for(int i = 1; i <= x; i++)
        {
            System.out.print("Enter the "+i+" value : ");
            a = scanner.nextInt();
            longestsequence.FindSubsequence(stack, a);    //? Function Call... O(n) time...
        }
        longestsequence.PrintSubsequence(stack, stack1);    //? Function call... O(1) time...
        scanner.close();
    }
}

//* The Time Complexity of the above two functions is O(1) and O(n) time... */
//* Space Complexity is 0(n) for the Stack Creation space... */
//! Time Complexity - 0(n) time...
//! Space Complexity - O(n) space...