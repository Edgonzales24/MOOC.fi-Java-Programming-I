
public class HealthStation {
    private int weighingCounter;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        weighingCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int tempWeight = person.getWeight();
        person.setWeight(tempWeight+1);
    }
    
    public int weighings() {
        return weighingCounter;
    }

}
