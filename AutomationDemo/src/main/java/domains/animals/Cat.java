package domains.animals;

public class Cat {

    private String breed;
    private String name;
    private int age;
    private boolean isVaccinated;

    public Cat(String breed, String name, int age, boolean isVaccinated) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

}
