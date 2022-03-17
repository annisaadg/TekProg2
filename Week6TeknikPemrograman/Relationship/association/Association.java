/**
*
* @author Annisa
* @since 17/03/2022
*/

package relationship.association;

public class Association {
    public static void main(String[] args) {
        
        University univ = new University("Massachusetts Institute Technology");
        Student stud1 = new Student("Annisa");
        Student stud2 = new Student("Ashira");
        Student stud3 = new Student("Jack");
        Student stud4 = new Student("Zena");

        System.out.println(stud1.getStudentName() + " is Student of " + univ.getUniversityName());
        System.out.println(stud2.getStudentName() + " is Student of " + univ.getUniversityName());
        System.out.println(stud3.getStudentName() + " is Student of " + univ.getUniversityName());
        System.out.println(stud4.getStudentName() + " is Student of " + univ.getUniversityName());
    }
}
