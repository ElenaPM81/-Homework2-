

public class Homework2 {
    public static void main(String[] args) {

        String s = "name\":Ivanov\", \"country\": \"Russia\", \"city\":\"Moscow\", \"age\":\"null";
        System.out.println(s
        .replaceAll("\\p{P}", " ")
        .replace(",", " ")
        .replace("null", " ")
        .replaceAll("\\s", " "));
        String[] arr = new String[s.length()];
        StringBuilder builder = new StringBuilder();
        builder
        .append(arr[0])
        .append(" :")
        .append(arr[1])
        .append(",")
        .append(arr[2])
        .append(":")
        .append(arr[3])
        .append(",")
        .append(arr[4])
        .append(":")
        .append(arr[5])
        .append(",")
        .append(arr[6])
        .append(":")
        .append(arr[7]);  
        System.out.println(arr);      
    
String s2 = "фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";



 System.out.println(s2
        .replaceAll("\\p{P}", " ")
        .replace(",", " ")
        .replace("null", " ")
        .replaceAll("\\s", " "));
        String[] arr2 = new String[s2.length()];
        StringBuilder builder2 = new StringBuilder();
          builder2
        .append(arr2[2])
        .append(" :")
        .append(arr2[10])
        .append("-")
        .append(arr2[6])
        .append(",")
        .append(arr2[14])
        .append(":")
        .append(arr2[22])
        .append("-")
        .append(arr2[18])
        .append(",")
        .append(arr2[26])
        .append(":")
        .append(arr2[34])
        .append("-")
        .append(arr2[31]);
        
         System.out.println(arr2);
    }
}
   
 