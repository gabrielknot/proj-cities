package IFPB.POO;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.io.File;
import java.nio.file.Path;

public class CitiesProcessor{

	private Set<City> citiesSet;

	public void setCitiesSet(Set<City> newCitiesSet){
		this.citiesSet.addAll(newCitiesSet);
	}

	public Set<City> buildSetOfCities(String path ){
		TreeSet<City> treeOfCities = new TreeSet<City>();

			try {
					FileReader reader = new FileReader(path);
            		BufferedReader bufferedReader = new BufferedReader(reader);
 
            		String line;
            		while ((line = bufferedReader.readLine()) != null) {
						City aux = new City();
              			String[] lineSepareted = line.split(", ");
						aux.setName(lineSepareted[0]);
						aux.setState(lineSepareted[1]);
						String zipCode = lineSepareted[2];
						int zipCodeInt = Integer.parseInt(zipCode); 
						aux.setZipCode(zipCodeInt);
						treeOfCities.add(aux);

            		}
           		reader.close(); 
       		 } catch (IOException e) {
        	 	e.printStackTrace();
			}
		
			return treeOfCities;

   	 }

	public void writeSetOfCities(Path newWriteDir,Comparator<City> newComparator){
 		TreeSet<City> newSetOfCities = new TreeSet<City>( newComparator); 
		newSetOfCities.addAll(this.citiesSet);
		try {
				String newWriterDirStr = newWriteDir.toString();
      			FileWriter myWriter = new FileWriter(new File(newWriterDirStr));
			for (City item : newSetOfCities) {
      			myWriter.write(item.getName() + "," + item.getState() + "," + item.getZipCode() + "\n");
				System.out.println("Added item: "+ item.getName() + "," + item.getState() + "," + item.getZipCode());
				
			}
      			myWriter.close();
      			System.out.println("Successfully wrote to the file.");
    		} catch (IOException e) {
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}
	}	
}
