package IFPB.POO;
import java.util.Comparator;
public class NaturalOrderComparator implements Comparator<City>{
	@Override
	public int compare(City a, City b)
    {
		String nameA =   a.getName();
		String nameB =   b.getName();
		
        return nameA.compareTo(nameB);
    }
}
