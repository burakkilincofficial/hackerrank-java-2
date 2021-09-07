package telenity;

import java.util.*;

public class Hobbies {

    private final HashMap<String, String[]> hobbies = new HashMap<>();

    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }

    public List<String> findAllHobbyists(String hobby) {
        List<String> resultNames = new ArrayList<>();
        for (Map.Entry<String, String[]> entry : hobbies.entrySet()) {
            if (Arrays.asList(entry.getValue()).contains(hobby)) {
                resultNames.add(entry.getKey());
                return resultNames;
            }
        }
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("Steve", "Fashion", "Piano", "Reading");
        hobbies.add("Patty", "Drama", "Magic", "Pets");
        hobbies.add("Chad", "Puzzles", "Pets", "Yoga");

        System.out.println(Arrays.toString(hobbies.findAllHobbyists("Pets").toArray()));
    }
}
