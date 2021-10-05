import java.util.Scanner;

public class Student {
    private String name;
    private String major;
    private int stu_num;
    private String phone_num;

    public void setMajor(String major) {
        this.major = major;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setStuNum(int stu_num) {
        this.stu_num = stu_num;
    }
    public void setPhoneNum(String phone_num) {
        this.phone_num = phone_num;
    }
    public String getMajor() {
        return this.major;
    }
    public String getName() {
        return this.name;
    }
    public int getStuNum() {
        return this.stu_num;
    }
    public String getPhoneNum() {
        return this.phone_num.substring(0,3)+"-"+this.phone_num.substring(3,7)+"-"+this.phone_num.substring(7,11);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] enr = new Student[3];
        for(int i=0; i<3; i++) {
            System.out.print("학번 이름 전공 전화번호 순으로 입력: ");
            enr[i] = new Student();
            enr[i].setStuNum(sc.nextInt());
            enr[i].setName(sc.next());
            enr[i].setMajor(sc.next());
            enr[i].setPhoneNum(sc.next());
        }
        for(int i=0; i<3; i++) {
            System.out.print(enr[i].getStuNum()+" " + enr[i].getName()+" ");
            System.out.println(enr[i].getMajor()+" "+enr[i].getPhoneNum());
        }
        sc.close();
    }
}