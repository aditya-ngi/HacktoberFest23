import java.util.Scanner;
public class ConsonantsVowels {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a String: ");
            String sentence = sc.nextLine();
            int vowels=0, consonants=0;
            for(int i=0;i<sentence.length();i++){
                char ch=sentence.charAt(i);
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
                ||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowels+=1;
                }
                else if((ch>=65 && ch<=91) || (ch>=97 && ch<=122)){
                    consonants+=1;
                }
            }
            System.out.println("Vowels: "+vowels);
            System.out.println("Consonants: "+consonants);
        }
    }
}
