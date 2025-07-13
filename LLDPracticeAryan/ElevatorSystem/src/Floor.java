import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Floor implements Cloneable {

    Floor(){
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4));
        List<Integer> integerListClone =  new ArrayList<>(integerList);
        integerListClone.add(5);

        System.out.println(integerListClone.hashCode()+" "+integerList.hashCode()+" "+integerList.equals(integerListClone)+" "+integerList);
    }
}
