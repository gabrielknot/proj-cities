package IFPB.POO;

import java.util.Collections;
import java.util.Set;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;

public class CitiesProcessorDemo 
{
    public static void main( String[] args )
    {
	CitiesProcessor cp = new CitiesProcessor();
	Set<City> set = cp.buildSetOfCities("files/cidades_duplicadas.txt");

	cp.setCitiesSet(set);

	cp.writeSetOfCities(Paths.get("file/cities_orded_by_name.txt"), Comparator.naturalOrder());

	ComparatorByZipCode comparatorByZipCode = new ComparatorByZipCode();
	ComparatorByState comparatorByState = new ComparatorByState();
	
	cp.writeSetOfCities(Paths.get("file/cities_orded_by_ZipCodeipCode.txt"), comparatorByZipCode);
	cp.writeSetOfCities(Paths.get("file/cities_orded_by_State.txt"), comparatorByState);
    }
}
