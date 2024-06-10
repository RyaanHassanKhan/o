package constructors;
import java.util.Scanner;

public class stack 
{
    private int[] stackArray;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public stack(int size) 
    {
        stackArray = new int[size];
        capacity = size;
        top = -1;  // Stack is initially empty
    }

    // Push operation to add an element to the stack
    public void push(int element) 
    {
        if (isFull()) 
        {
            System.out.println("Stack is full. Cannot push " + element);
        } else 
        {
            stackArray[++top] = element;
            System.out.println("Pushed " + element);
        }
    }

    // Pop operation to remove an element from the stack
    public int pop() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty. Cannot pop an element.");
            return -1;
        } else 
        {
            return stackArray[top--];
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() 
    {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() 
    {
        return top == capacity - 1;
    }

    // Display the elements in the stack
    public void display() 
    {
        if (isEmpty()) 
        {
            System.out.println("Stack is empty.");
        } else 
        {
            System.out.println("Stack elements:");
            for (int i = 0; i <= top; i++) 
            {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
     {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();

        stack stack = new stack(size);

        while (true) 
        {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            int choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    System.out.print("Enter an element to push: ");
                    int element = sc.nextInt();
                    stack.push(element);
                    break;
                case 2:
                    int poppedElement = stack.pop();
                    if (poppedElement != -1) 
                    {
                        System.out.println("Popped element: " + poppedElement);
                    }
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    sc.close();
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
