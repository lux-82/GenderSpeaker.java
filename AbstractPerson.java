public abstract class AbstractPerson{
    protected abstract String myGender();

    public void speak() {
        System.out.println("I'm a  " + myGender());
        
    }
}