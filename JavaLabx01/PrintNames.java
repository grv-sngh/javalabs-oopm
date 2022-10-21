public class PrintNames {
    public static void main(String[] args) {
        char[] myName = {'G', 'A', 'U', 'R', 'A', 'V'};
        String fatherName = "Narayan";
        String motherName = "Bharti";

        for(int i = 0; i < myName.length; i++){
            System.out.print(myName[i]);
        }
        System.out.println();
        System.out.println(fatherName);
        System.out.println(motherName);
    }
}
