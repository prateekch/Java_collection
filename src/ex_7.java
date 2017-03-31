import java.util.ArrayList;
import java.util.List;

class Stack
{
    private List<Integer> list;
    int count,size,minValue;

    public Stack()
    {
        list = new ArrayList<Integer>();
        minValue=0;
        count=0;
        size=5;
    }
    public Stack(int size)
    {
        if(size<1)
        {
            this.size=5;
        }
        this.size=size;
    }

    int getSize()
    {
        return size;
    }

    int getCount()
    {
        return count;
    }

    void push(int val)
    {
        if(count==size)
        {
            System.out.println("STACK OVERFLOW!!!!");
            return;

        }
        if(count==0)
            minValue=val;
        if(val<minValue)
            minValue=val;
        list.add(val);
        count++;
    }

    void pop()
    {
        if(count==0)
        {
            System.out.println("STACK UNDERFLOW!!!!");
            return;
        }
        list.remove(count-1);
        count--;
        minValue = Integer.MAX_VALUE;
        for(Integer i : list) {

            if (i < minValue)
                minValue = i;
        }

    }
    int getMinValue()
    {
        if(count==0)
            minValue=0;
        return minValue;
    }

    void print()
    {
        System.out.println("STACK : "+list);
    }
    Boolean isFull()
    {
        return count==size ? true : false;
    }
    Boolean isEmpty()
    {
        return count==0 ? true : false;
    }
}


public class ex_7 {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(11);
        stack.push(10);
        stack.push(5);
        stack.push(3);
        stack.push(9);

        stack.print();
        System.out.println("IS STACK FULL ? :" + stack.isFull());
        System.out.println("Number of Elements:" + stack.getCount());
        System.out.println("Minimum Value : " + stack.getMinValue());
        stack.push(22);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();

        stack.pop();
        stack.pop();
        System.out.println("IS STACK EMPTY ? :" + stack.isEmpty());
        stack.pop();
        stack.print();

    }


}
