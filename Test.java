public class Test {

    public static void main(String[] args)
    {
        IntegerArrayList list = new IntegerArrayList();

        System.out.println("---------------------------------------------");
        System.out.println("Test: add(val) and get(index): add 11 values to the list and then get the 11 values from the list.");
        System.out.println("Expected: 10 20 30 40 50");

        System.out.println();

        for (int val = 10; val <= 50; val+=10)
        {
            list.add(val);
        }
        System.out.println(list);
        for (int i=0; i<5; i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\n");
        System.out.println("---------------------------------------------");
        System.out.println("Test add(val): add the 11th item to the list, which causes an array resize.");
        System.out.println("Expected: 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110");

        for (int val = 10; val <= 110; val+=10)
        {
            list.add(val);
        }
        System.out.println(list);
        System.out.println("---------------------------------------------");
        System.out.println("Test get(index): try to get the item at an invalid index (position 11) from the list.");
        System.out.println("Expected: IndexOutOfBoundsException: 11");
        try{
            System.out.println(list.get(11));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Test get(index): try to get the item at an invalid index (position -1) from the list.");
        System.out.println("Expected: IndexOutOfBoundsException: -1");
        try{
            System.out.println(list.get(-1));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }


        System.out.println("---------------------------------------------");
        System.out.println("Test add(index, val): try to add a value at a specfic index from the list, and an invalid index from the list.");
        System.out.println("Expected: 10, 100, 20, 30, 40, 50 ");
        

        IntegerArrayList list1 = new IntegerArrayList();
        for (int val = 10; val <= 50; val+=10)
        {
            list1.add(val);
        }
        list1.add(1, 100);
        System.out.println(list1);

        System.out.println("---------------------------------------------");
        System.out.println("Test set(index, val): try to set the item at an  index from the list.");
        System.out.println("Expected: Expected: 99, 100, 20, 30, 40, 50 ");
        try{
            list1.set(0,99);
            System.out.println(list1);
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }

        System.out.println("---------------------------------------------");
        System.out.println("Test .clear(), .size(), and isEmpty: try to .get(0) and .size() after cleared.");
        System.out.println("Expected: IndexOutOfBoundsException @ 0, and 0 and true");
        System.out.println(list1.size());
        try{
            list1.clear();
            System.out.println(list1.get(0));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        try{ 
        System.out.println(list1.size());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(list1.isEmpty());

        System.out.println("---------------------------------------------");
        System.out.println("Test .contains(), to see if the list contains a value.");
        System.out.println("Expected: true, false");
        IntegerArrayList list2 = new IntegerArrayList();
        for (int val = 10; val <= 50; val+=10)
        {
            list2.add(val);
        }
        System.out.println(list2.contains(10));
        System.out.println(list2.contains(999));


        System.out.println("---------------------------------------------");
        System.out.println("Test .indexOf(), to see if the list contains a value.");
        System.out.println("Expected: 0, -1");
       
        System.out.println(list2.indexOf(10));
        System.out.println(list2.indexOf(999));

        System.out.println("---------------------------------------------");
        System.out.println("Test .equals(), to see if two lists equal each other.");
        System.out.println("Expected: true, false");
        IntegerArrayList list3 = new IntegerArrayList();
        IntegerArrayList list4 = new IntegerArrayList();
        for (int val = 10; val <= 50; val+=10)
        {
            list3.add(val);
        }
        for (int val = 10; val <= 40; val+=10)
        {
            list4.add(val);
        }
    
        System.out.println(list2.equals(list3));

        System.out.println(list3.equals(list4));

        System.out.println("---------------------------------------------");
        System.out.println("Test remove(index): try to remove the item at an index from the list.");
        System.out.println("Expected: 40, [10,20,30,50]");
       try{
            System.out.println(list3.remove(3));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(list3.toString());
    }
}

