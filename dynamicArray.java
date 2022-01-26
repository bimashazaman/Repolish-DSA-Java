public class Array <T> implements Iterable <T> 
{
    private T[] arr; //internal static array
    private int len = 0; // length of array
    private int capacity = 0; // actual array size

// free slots
public Array()
{
    this(10);
}


    public Array(int capacity)
    {
        if(capacity < 0)
        {
            throw new IllegalArgumentException("capacity must be >= 0");
        }
        this.capacity = capacity; // set capacity
        arr = (T[]) new Object[capacity]; // create array
    }

    public int Size()
    {
        return len; // return size
    }

    public boolean IsEmpty()
    {
        return len == 0; // return true if empty
    }



    public T get(int index)
    {
        if(index < 0 || index >= len)
        {
            throw new IndexOutOfBoundsException("index must be >= 0 and < " + len);
        }
        return arr[index]; // return element at index
    }

    public void set(int index, T value)
    {
        if(index < 0 || index >= len)
        {
            throw new IndexOutOfBoundsException("index must be >= 0 and < " + len);
        }
        arr[index] = value; // set element at index
    }
// add element to end of array
    public void add(T value)
    {
        if(len == capacity)
        {
            grow(); // grow if full
        }
        arr[len++] = value; // add to end
    }

    public void clear()
    {
        for(int i = 0; i < len; i++)
        {
            arr[i] = null;
        }
        len = 0; // reset length
    }


    public void removeAt(int index)
    {
        if(index < 0 || index >= len)
        {
            throw new IndexOutOfBoundsException("index must be >= 0 and < " + len);
        }
        for(int i = index; i < len - 1; i++)
        {
            arr[i] = arr[i + 1]; // shift elements down
        }
        arr[len - 1] = null; // clear last slot
        len--; // decrement length
    }

    public void insert(int index, T value)
    {
        if(index < 0 || index >= len)
        {
            throw new IndexOutOfBoundsException("index must be >= 0 and < " + len);
        }
        if(len == capacity)
        {
            grow(); // grow if full
        }
        for(int i = len; i > index; i--)
        {
            arr[i] = arr[i - 1]; // shift elements up
        }
        arr[index] = value; // add to index
        len++; // increment length
    }


    public void grow()
    {
        capacity = capacity * 2; // double capacity
        T[] newArr = (T[]) new Object[capacity]; // create new array
        for(int i = 0; i < len; i++)
        {
            newArr[i] = arr[i]; // copy elements
        }
        arr = newArr; // set new array
    }

    public Iterator <T> iterator()
    {
        return new ArrayIterator <T>(this);
    }

    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0; i < len; i++)
        {
            sb.append(arr[i]);
            if(i < len - 1)
            {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Array <String> a = new Array <String>();
        a.add("hello");
        a.add("world");
        a.add("!");
        System.out.println(a);
        a.removeAt(1);
        System.out.println(a);
        a.insert(1, "goodbye");
        System.out.println(a);
    }

    
}