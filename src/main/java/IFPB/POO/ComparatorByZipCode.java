package IFPB.POO;
import java.util.Collections;
import java.util.Comparator;
public class ComparatorByZipCode implements Comparator<City>{
	
	@Override
	public int compare(City a, City b)
    {
		int zipCodeA =  (int) a.getZipCode();
		int zipCodeB =  (int) b.getZipCode();
		
        return Integer.compare(zipCodeA, zipCodeB);
    }
}