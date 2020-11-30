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
	Set<City> set = cp.buildSetOfCities( Path.of("files/cidades_duplicadas.txt"));

	cp.setCitiesSet(set);

	cp.writeSetOfCities(Path.of("file/cities_orded_by_name.txt"), Comparator.naturalOrder());

	ComparatorByZipCode comparatorByZipCode = new ComparatorByZipCode();
	ComparatorByState comparatorByState = new ComparatorByState();
	
	cp.writeSetOfCities(Path.of("file/cities_orded_by_ZipCodeipCode.txt"), comparatorByZipCodeipCode);
	cp.writeSetOfCities(Path.of("file/cities_orded_by_State.txt"), comparatorByState);
    }
}
