public class L10_4 {
    public static void main(String[] args) {
        Encap en=new Encap();
        en.setRolllNo(5);
        en.setSection("A");
        en.setStandard("12th");
        System.out.printf("RollNo: %d  Standard: %s  Section: %s",en.getRolllNo(),en.getStandard(),en.getSection());
    }
}
class Encap{
    private String standard;
    private int rolllNo;
    private String section;

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }


    public int getRolllNo() {
        return rolllNo;
    }

    public void setRolllNo(int rolllNo) {
        this.rolllNo = rolllNo;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

}
