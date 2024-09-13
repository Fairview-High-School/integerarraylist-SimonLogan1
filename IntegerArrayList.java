

public class IntegerArrayList implements IntegerList{
    private Integer[] data;
    private int size;

    public IntegerArrayList()
    {
        size = 0;

        data = new Integer[10];
    }

    private void resizeInternalArrayIfNeccesary()
    {
        if(size >= data.length)
        {
            Integer[] biggerArray = new Integer[data.length*2];
            for(int i = 0; i < data.length; i++)
            {
                biggerArray[i] = data[i];
                data = biggerArray;
            }
        }
    }

    public void add(Integer val)
    {
        resizeInternalArrayIfNeccesary();
        data[size] = val;
        size++;
        
    }
    public void add(int index, Integer val)
    {
        resizeInternalArrayIfNeccesary();
        for(int i = size; i > index; i--)
        {
            data[i] = data[i-1];
        }
        data[index] = val;
        size++;
    }
    public void set(int index, Integer val)
    {
        if(index <= size-1 && index >0)
        {
            data[index] = val;
        }
        else
        throw new IndexOutOfBoundsException("index: " + index);
    }
    public void clear()
    {
        size = 0;
        Integer[] a = new Integer[0];
        data = a;
    }
    public Integer remove(int index)
    {
        throw new UnsupportedOperationException();
    }
    public Integer get(int index)
    {
        if(index < 0 || index >= size)
        {   
            throw new IndexOutOfBoundsException("index: " + index);
        }
        return data[index];
    }
    public int size()
    {
        return size;
    }
    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        else
        return false; 
    }
    public boolean contains(Integer val)
    {
        throw new UnsupportedOperationException();
    }
    public int indexOf(Integer val)
    {
        throw new UnsupportedOperationException();
    }
    public boolean equals(List<Integer> other)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        String result = "[";
        for(int i =0; i < size - 1; i++)
        {
            result += data[i] + ",";
        }
        result += data[size-1];
        result += "]";
        return result;
    }
}
