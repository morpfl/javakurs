public class Main{
    public static void main(String args[]){

        Human h1 = new Student();
        System.out.println(h1.celebrate(0));

        Professor p1 = new Professor();
        System.out.println(p1.celebrate(4));

        Drink d1 = new Beer();

        Student s1 = new Student();
        Student s2 = new Student();
        System.out.println(s1.celebrate(d1));
        System.out.println(s2.celebrate(d1));


        /*
            h1.celebrate(d1);

            Das funktioniert nicht. Warum?
        */
    }
}