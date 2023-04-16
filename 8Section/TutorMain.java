import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {

		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 2_000_000; i++) {
			linkedList.add(i);
            arrayList.add(i);
        }

        /******************FETCHING DATA******************/

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
		linkedList.get(1_000_000);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(1_000_000);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");
        

        /******************FIRST / LAST INDEX******************/

        System.out.println("\nFIRST / LAST INDEX\n");

        start = System.currentTimeMillis();
		linkedList.get(0);
        linkedList.get(linkedList.size() - 1);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(0);
        arrayList.get(arrayList.size() - 1);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION FROM MIDDLE******************/

        System.out.println("\nINSERTION FROM MIDDLE\n");

        start = System.currentTimeMillis();
        linkedList.add(5, 121); // insert 121 at index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(5, 121);  // insert 121 at index 5
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION******************/

        System.out.println("\nINSERTION\n");

        start = System.currentTimeMillis();		
        linkedList.add(121);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(121);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        /******************REMOVAL******************/
        
        System.out.println("\nREMOVAL\n");

        start = System.currentTimeMillis();			
        linkedList.remove(400);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();			
        arrayList.remove(400);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************UPDATES******************/

        System.out.println("\nUPDATES\n");

        start = System.currentTimeMillis();					
		linkedList.set(1_000_000, 5);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();			
		arrayList.set(1_000_000, 5);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

	}

}