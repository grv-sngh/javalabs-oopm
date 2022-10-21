class Student {
    private int studentrollno;
    private int yrofeng;
    private String studentname;
    private float cetscore;
    private String branchname;
    private char residentialstatus;

    public Student() {
    }

    public Student(int srn, int ye, String name, float score, String branch, char rs) {
        this.studentrollno = srn;
        this.yrofeng = ye;
        this.studentname = name;
        this.cetscore = score;
        this.branchname = branch;
        this.residentialstatus = rs;
    }

    public int getstudentrollno() {
        return studentrollno;
    }

    public void setstudentrollno(int roll) {
        this.studentrollno = roll;
    }

    public int getyrofeng() {
        return yrofeng;
    }

    public void setyrofeng(int ye) {
        this.yrofeng = ye;
    }

    public String getstudentname() {
        return studentname;
    }

    public void setstudentname(String name) {
        this.studentname = name;
    }

    public float getcetscore() {
        return cetscore;
    }

    public void setcetscore(float score) {
        this.cetscore = score;
    }

    public String getbranchname() {
        return branchname;
    }

    public void setbranchname(String branch) {
        this.branchname = branch;
    }

    public char getresidentialstatus() {
        return residentialstatus;
    }

    public void setresidentialstatus(char rs) {
        this.residentialstatus = rs;
    }
}

class hostelite extends Student {
    private String hostelname;
    private int roomno;
    private String roomtype;

    public hostelite() {
    }

    public hostelite(int srn, int ye, String name, float score, String branch, char rs, String hostel, int room, String type) {
        super(srn, ye, name, score, branch,rs);
        this.hostelname = hostel;
        this.roomno = room;
        this.roomtype = type;
    }

    public String gethostelname() {
        return hostelname;
    }

    public void sethostelname(String hostel) {
        this.hostelname = hostel;
    }

    public int getroomno() {
        return roomno;
    }

    public void setroomno(int room) {
        this.roomno = room;
    }

    public String getroomtype() {
        return roomtype;
    }

    public void setroomtype(String type) {
        this.roomtype = type;
    }
}

class dayscholar extends Student {
    private int distance;
    private String modeoftransport;
    private String placeofaddress;

    public dayscholar() {
    }

    public dayscholar(int srn, int ye, String name, float score, String branch, char rs, int dist, String mode,
            String address) {
        super(srn, ye, name, score, branch,rs);
        this.distance = dist;
        this.modeoftransport = mode;
        this.placeofaddress = address;
    }

    public int getdistance() {
        return distance;
    }

    public void setdistance(int dist) {
        this.distance = dist;
    }

    public String getmodeoftransport() {
        return modeoftransport;
    }

    public void setmodeoftransport(String mode) {
        this.modeoftransport = mode;
    }

    public String getplaceofaddress() {
        return placeofaddress;
    }

    public void setplaceofaddress(String address) {
        this.placeofaddress = address;
    }
}

class StudentInheritanceTest {
    public static void main(String[] args) {

        hostelite s = new hostelite(21, 2, "Manisha", 92.5f, "extc", 'y', "Oyasumi Apt.", 314, "3BHK");
        System.out.println("Roll No: " + s.getstudentrollno());
        System.out.println("Year of Engineering: " + s.getyrofeng());
        System.out.println("Student Name: " + s.getstudentname());
        System.out.println("Cet Score: " + s.getcetscore());
        System.out.println("Branch name: " + s.getbranchname());
        System.out.println("Residential status: " + s.getresidentialstatus());
        System.out.println("Hostel name: " + s.gethostelname());
        System.out.println("Room no: " + s.getroomno());
        System.out.println("Roomtype: " + s.getroomtype());
        
        System.out.println();

        dayscholar ds = new dayscholar(18, 2, "Subra", 87.5f, "etrx", 'y', 3, "Train", "Chembur");
        System.out.println("Roll No: " + ds.getstudentrollno());
        System.out.println("Year of Engineering: " + ds.getyrofeng());
        System.out.println("Student Name: " + ds.getstudentname());
        System.out.println("Cet Score: " + ds.getcetscore());
        System.out.println("Branch name: " + ds.getbranchname());
        System.out.println("Residential status: " + ds.getresidentialstatus());
        System.out.println("Distance: " + ds.getdistance());
        System.out.println("Mode of transport: " + ds.getmodeoftransport());
        System.out.println("Place of address: " + ds.getplaceofaddress());
    }

}
