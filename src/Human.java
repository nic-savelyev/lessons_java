
public class Human {

    private static final int MIN_AGE = 0;
    private static final int MAX_AGE = 130;
    private static final int MIN_NAME_LENGTH = 2;

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName (String newName) {
        if (newName != null && newName.length() >= Human.MIN_NAME_LENGTH) {
            name = newName;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge (int newAge) {
        if (newAge > Human.MIN_AGE && newAge < Human.MAX_AGE)
          age = newAge;
        else {
            System.out.println("You are STUPID!");
        }
    }

}
