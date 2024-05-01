package co6_strings;

public class dob {
    public static void main(String[] args) {

        String inputDate = "26/2/2004";

        String[] dateParts = inputDate.split("/");

        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[0]);
        int year = Integer.parseInt(dateParts[2]);


        System.out.println(month + " " + day + " " + year);
    }
}
