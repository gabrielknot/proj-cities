package IFPB.POO;
import java.util.Comparator;
public class ComparatorByState implements Comparator<City>{
	@Override
	public int compare(City a, City b)
    {
		String stateA =   a.getState();
		String stateB =   b.getState();
		
        return stateA.compareTo(stateB);
    }
}
