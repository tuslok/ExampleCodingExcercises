package InputOutput;

import java.io.*;
import java.util.*;

public class Locations implements Map<Integer, Location> {

    private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();

    public static void main(String[] args) throws IOException {

        try (BufferedWriter localFile = new BufferedWriter(new FileWriter("locations.txt"));
             BufferedWriter dirFile = new BufferedWriter(new FileWriter("directions.txt"))) {
            for (Location location : locations.values()) {
                localFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                for (String direction : location.getExits().keySet()) {
                    if (!direction.equalsIgnoreCase("Q")) {
                        dirFile.write(location.getLocationID() + "," + direction + "," + location.getExits().get(direction) + "\n");
                    }
                }
            }
        }
        /*FileWriter localFile = null;
        try {
            localFile = new FileWriter("locations.txt");
            for (Location location : locations.values()) {
                localFile.write(location.getLocationID() + "," + location.getDescription() + "\n");
                //throw new IOException("Test exception thrown while writing");
            }
        } finally {
            System.out.println("In finally block");
            if (localFile != null) {
                System.out.println("Attempting to close localFile");
                localFile.close();
            }
        }*/
    }

    static {

        try (DataInputStream locFile = new DataInputStream(new BufferedInputStream(new FileInputStream("locations.dat")))) {
            while (true) {
                Map<String, Integer> exits = new LinkedHashMap<>();
                int locID = locFile.readInt();
                String description = locFile.readUTF();
                int numExits = locFile.readInt();
                System.out.println("Read location " + locID + " : " + description);
                System.out.println("Found " + numExits + " exists");
                for (int i = 0; i < numExits; i++) {
                    String direction = locFile.readUTF();
                    int destination = locFile.readInt();
                    exits.put(direction, destination);
                    System.out.println("\t\t" + direction + ", " + description);
                }
                locations.put(locID, new Location(locID, description, exits));
            }
        } catch (IOException e) {
            System.out.println("IO Exception");
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key, value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
        locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
