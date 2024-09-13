public class Test {
public static void main(String[] args) {
    IntegerArrayList list = new IntegerArrayList();
    System.out.println("------------------------------------------------------------");
    System.out.println("Test add(val) and get(index): add 5 values to list, and then get the 5 values from the list");
    System.out.println("Expected: 10 20 30 40 50");
    for(int val = 10; val <=50; val+=10)
    {
        list.add(val);
    }
    
    System.out.println(list);
    for(int i = 0; i < 5; i++)
    {
        System.out.print(list.get(i) + " ");
    }
    System.out.println();
    System.out.println("------------------------------------------------------------");
    System.out.println("Test add(val): add 11th item to the list (causes an array resize)");
    System.out.println("Expected: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110");
    for(int val = 10; val <= 110; val+=10)
    {
        list.add(val);
    }
    System.out.println(list);
    System.out.println("------------------------------------------------------------");
    System.out.println("Text get(index): Try to get the item at the invalid index(position 11) from the list");
    System.out.println("Expected: IndexOutOfBoundsException: 11");
    try {
    System.out.println(list.get(11));
    }catch(IndexOutOfBoundsException e){
        System.out.println(e);
    }
    System.out.println("------------------------------------------------------------");
    System.out.println("Text get(index): Try to get the item at the invalid index(position -1) from the list");
    System.out.println("Expected: IndexOutOfBoundsException: -1");
    try {
    System.out.println(list.get(-1));
    }catch(IndexOutOfBoundsException e){
        System.out.println(e);
    }
System.out.println("------------------------------------------------------------");
System.out.println("Test add(index, val): add item to position 1");
System.out.println("Expected: 10, 100, 20, 30, 40, 50");
IntegerArrayList list2 = new IntegerArrayList();
for(int val = 10; val <=50; val+=10)
{
    
    list2.add(val);
}
list2.add(1,100);
System.out.println(list2);

System.out.println("------------------------------------------------------------");
System.out.println("Test set(index, val): set item to position 2");
System.out.println("Expected: 10, 100, 20, 30, 40");
list2.set(2,100);
System.out.println(list2);

System.out.println("------------------------------------------------------------");
System.out.println("Test clear(): clear array of values");
System.out.println("Expected: java.lang.IndexOutOfBoundsException: index: 0");

try {
    list2.clear();
    System.out.println(list2.get(0));
    }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e);
    };
try {
        System.out.println(list2.size());
        }
    catch(IndexOutOfBoundsException e)
    {
        System.out.println(e);
    };
System.out.println(list2.isEmpty());
}
}
