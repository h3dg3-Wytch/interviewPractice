package Collections;

/**
 * Created by h3dg3wytch on 7/20/17.
 */
public class Name implements Comparable<Name>{

    private final String firstName, lastName;

    public Name(String firstName, String lastName){
        if(firstName == null || lastName == null){
            throw new NullPointerException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}

    public boolean equals(Object o){
        if(!(o instanceof Name))
            return false;
        Name n = (Name) o;
        return n.firstName.equals(firstName) && n.lastName.equals(lastName);
    }

    public int hashCode(){
        return 31*firstName.hashCode() + lastName.hashCode();
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public int compareTo(Name o) {
        int lastComp = lastName.compareTo(o.lastName);
        return (lastComp != 0 ? lastComp : firstName.compareTo(o.firstName));
    }

}
