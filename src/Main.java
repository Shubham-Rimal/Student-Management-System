import model.Classes;
import model.Marks;
import model.Students;

public class Main {
    public static void main(String[] args) {
        Students st1= new Students("Ramraju", 16, 11);
        Students st2= new Students("Geeta", 18, 12);
        Students st3= new Students("Laxman", 17, 11);

        Classes cl1= new Classes(11, st1.getName());
        Classes cl2= new Classes(12, st2.getName());
        Classes cl3= new Classes(11, st3.getName());

        Marks m1= new Marks(st1.getName(), 70, 80, 87);
        Marks m2= new Marks(st2.getName(), 85, 97, 100);
        Marks m3= new Marks(st3.getName(), 69, 67, 92);

        st1.details();
        st2.details();
        st3.details();
        System.out.println("\n\nThe total percentage of each student:\n\n");
        m1.getTotal();
        m2.getTotal();
        m3.getTotal();
    }
}