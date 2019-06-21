import java.util.ArrayList;
public class Exceptions{


    public void testing(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        try{
            for(int i = 0; i < myList.size(); i++){
                Integer castedValue = (Integer)myList.get(i);
            }
            System.out.println(myList);
        }catch (ClassCastException e) {
            System.out.println("Got exception");
        }
    }
}