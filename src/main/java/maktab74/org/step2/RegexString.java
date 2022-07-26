package maktab74.org.step2;


import java.util.ArrayList;
import java.util.List;

public class RegexString {
    public static void main(String[] args) {

        String input = " 1234m 0000m";

        chekOutString(input);

    }

    public static List<String> chekOutString(String input) {
        List<String> outPutString = new ArrayList();
        String[] partArrayString = input.split(" ");
        for (int i = 0; i < partArrayString.length; i++) {
            String partString = partArrayString[i];


            int number = 0;
            for (int j = 0; j < partString.length(); j++) {
//                if (Pattern.matches("000{4,999}", partString) ||
//                        Pattern.matches("000{4,999}", partString) ||
//                        Pattern.matches(".000{4,999}", partString) ||
//                        Pattern.matches("000.", partString) ||
//                        Pattern.matches(".000.{4,999}", partString)) {
//                    int count = 0;
//                    if (partString.charAt(j) == '0') {
//                        count++;
//                    }
//                    String addtoArray = null;
//                    String cuntString = String.valueOf(count);
//                    for (int k = 0; k < cuntString.length(); k++) {
//                        addtoArray = addtoArray.concat("0");
//                    }
//                    outPutString.add(addtoArray);
//                }

                char charPart = partString.charAt(j);
                if (charPart >= 49 && charPart <= 57) {
                    int intCharPart = charPart - 48;
                    number = number * 10 + intCharPart;


                } else {

                    String numerDigit = String.valueOf(number);
                    number = 0;
                    if (numerDigit.length() >= 3) {
                        outPutString.add(numerDigit);

                    }

                }
                String endnumber = String.valueOf(number);
                if (partString.length() == j + 1 && endnumber.length() >= 3) {
                    outPutString.add(endnumber);
                    number = 0;

                }
            }
        }
        outPutString.forEach(System.out::println);
        return outPutString;
    }
}

