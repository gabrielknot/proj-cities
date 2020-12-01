package IFPB.POO;

import java.util.Set;
import java.nio.file.Paths;

public class CitiesProcessorDemo 
{
    public static void main( String[] args )
    {
	CitiesProcessor cp = new CitiesProcessor();
	Set<City> set = cp.buildSetOfCities("files/cidades_duplicadas.txt");

	cp.setCitiesSet(set);


	ComparatorByZipCode comparatorByZipCode = new ComparatorByZipCode();
	ComparatorByState comparatorByState = new ComparatorByState();
	NaturalOrderComparator naturalOrderComparator = new NaturalOrderComparator();
	cp.writeSetOfCities(Paths.get("file/cities_orded_by_name.txt"), naturalOrderComparator);

	cp.writeSetOfCities(Paths.get("file/cities_orded_by_ZipCodeipCode.txt"), comparatorByZipCode);
	cp.writeSetOfCities(Paths.get("file/cities_orded_by_State.txt"), comparatorByState);
    }
}
