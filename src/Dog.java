public class Dog 
{
    private String breed;
    // Add an instance variable here for name.
    
    public Dog(String theBreed)
    {
        breed = theBreed;
    }
    

    public void printDogInfo()
    {
        System.out.println(name + " is a " + breed);
    }
}