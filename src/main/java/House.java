import java.util.*;

public class House {

    private Map<String,Integer> residents;

    public House() {
        residents = new HashMap<>();
    }

    public static void main(String[] args) {
        House bigHouse = new House();

        bigHouse.addResident("Степан Иванов", 23);
        bigHouse.addResident("Петр Васницов", 8);
        bigHouse.addResident("Роман Ткачев", 18);
        bigHouse.addResident("Владислав Еремин", 10);
        bigHouse.addResident("Николай Потрушев", 20);
       bigHouse.addResident("Александр Монастырев" ,32);

        List<String> adults = bigHouse.getAdults();

        Collections.sort(adults);

        System.out.println(adults);
    }

    public void addResident(String name, int age) {
        residents.put(name, age);
    }

    public List getAdults() {
        List<String> adults = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : residents.entrySet()) {
            if(entry.getValue() > 18){
                adults.add(entry.getKey());
            }
        }
        return adults;
    }
}
