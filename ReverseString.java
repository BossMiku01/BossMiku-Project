public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse("Hatsune Miku"));

    }

    public static String reverse(String s) {

        char[] letters = new char[s.length()];
        
        int letterindex = 0;
        for(int i = s.length() - 1; i >= 0; i--)
        {
            letters[letterindex] = s.charAt(i);
            letterindex++;
        }

        String reverseString = "";
        for(int i = 0; i < s.length(); i++)
        {
            reverseString += letters[i];
        }
        return reverseString;
    }
}
