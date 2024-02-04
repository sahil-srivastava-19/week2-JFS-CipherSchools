import javax.print.Doc;

abstract class Doctor{
    abstract void treatPatient();
}
class physician extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("I treat patient using medicines");
    }
}
class surgeon extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("I treat patient using surgery");

    }

}class dentists extends Doctor{
    @Override
    void treatPatient() {
        System.out.println("I treat patient's teeth ");
    }
}
public class L10_2 {
    public static void main(String[] args) {
        System.out.println("HI I AM LUCY! RECEPTIONIST AT MAX CARE");
        System.out.println("WHO ARE U LOOKING FOR?");
        System.out.println("Press 1.Physician\n2.Surgeon\n3.Dentist");
        int choice =new java.util.Scanner(System.in).nextInt();
        Doctor d=null;
        switch(choice){
            case 1:
                d=new physician();
                break;
            case 2:
                d=new surgeon();
                break;
            case 3:
                d=new dentists();
                break;
            default:
                System.out.println("A oh!");
        }
        if(choice>0||choice<3){
            System.exit(0);
        }else{
            d.treatPatient();
        }
    }
}
