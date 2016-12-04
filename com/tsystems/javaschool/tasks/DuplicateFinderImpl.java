package com.tsystems.javaschool.tasks;
import java.io.*;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by max on 16.08.16.
 */
public class DuplicateFinderImpl implements DuplicateFinder{
    @Override
    public boolean process(File sourceFile, File targetFile) {
        Map<String , Integer> map = new TreeMap<>();
        String line = null;
        try(
            BufferedReader  reader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter  writer = new BufferedWriter(new FileWriter(targetFile , true)))
            {
            while ( (line = reader.readLine()) != null){
                if ( !map.containsKey(line)){
                    map.put(line , 1);
                }
                else {
                    map.put(line , map.get(line) + 1);
                }
            }
            for ( String entry : map.keySet() ){
                writer.write(entry + " [" +map.get(entry)+"] " +"\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("there is no file with this name");
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
       return true;
    }
    public static void main(String[] args) {
        DuplicateFinder duplicateFinder = new DuplicateFinderImpl();
        System.out.println(duplicateFinder.process
                (new File("/home/max/t-systems.txt") , new File("/home/max/target.txt")));
    }
}
