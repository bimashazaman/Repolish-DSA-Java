public class DoublyLinkedlist <T> implements Iterable <T>
{
    private int size = 0; //keep track of the size of the list
    private Node <T> head = null; // initializes the head to null
    private Node <T> tail = null; //initializes the tail to null

    //internal node class to repreasent the datas

    private class Node <T>
    {
        T data;
        Node <T> prev, next;

        public Node(T data, Node <T> prev, Node <T> next)
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @overwrite public String toString()
        {
            return data.toString();
        }

        public void clear()
            {
                Node <T> Trav = head;
                while(Trav != null)
                {
                    Trav.data = null;
                    Trav.prev = null;
                    Trav.next = null;
                    Trav = Trav.next;
                }

                head = null;
                tail = null;
                size = 0;
            }

            public int size()
            {
                return size;
            }

            public boolean isEmpty()
            {
                return size == 0;
            }

            public void addFirst(T data)
            {
                Node <T> newNode = new Node <T>(data, null, head);
                if(head != null)
                {
                    head.prev = newNode;
                }
                else
                {
                    tail = newNode;
                }
                head = newNode;
                size++;
            }

            public void addLast(T data)
            {
                Node <T> newNode = new Node <T>(data, tail, null);
                if(tail != null)
                {
                    tail.next = newNode;
                }
                else
                {
                    head = newNode;
                }
                tail = newNode;
                size++;
            }

            public T removeFirst()
            {
                if(isEmpty())
                {
                    return null;
                }
                
                T data = head.data;
                head = head.next;
                if(head != null)
                {
                    head.prev = null;
                }
                else
                {
                    tail = null;
                }
                size--;
                return data;
            }

            public T removeLast()
            {
                if(isEmpty())
                {
                    return null;
                }
                T data = tail.data;
                tail = tail.prev;
                if(tail != null)
                {
                    tail.next = null;
                }
                else
                {
                    head = null;
                }
                size--;
                return data;
            }

            public T getFirst()
            {
                if(isEmpty())
                {
                    return null;
                }
                return head.data;
            }


            public T getLast()
            {
                if(isEmpty())
                {
                    return null;
                }
                return tail.data;
            }

            public void print()
            {
                Node <T> Trav = head;
                while(Trav != null)
                {
                    System.out.println(Trav.data);
                    Trav = Trav.next;
                }
            }

            public void printReverse()
            {
                Node <T> Trav = tail;
                while(Trav != null)
                {
                    System.out.println(Trav.data);
                    Trav = Trav.prev;
                }
            }


        
    }




}

