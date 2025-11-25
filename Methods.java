public class Methods {
    public static int score(String finalMessage, int consonantScore, int vowelScore, int punctuationScore, String specialChar, int specialPoints)
    {
        finalMessage = finalMessage.toLowerCase();
        int score = 0;
        String current;
        for (int i = 0; i < finalMessage.length(); i++)
        {
            current = finalMessage.substring(i, i + 1);
            if (current.equals(specialChar))
            {
                score += specialPoints;
            }
            else if (current.equals("a") | current.equals("e") | current.equals("i") | current.equals("o") | current.equals("u"))
            {
                score += vowelScore;
            }
            else if (current.equals(".") | current.equals("!"))
            {
                score += punctuationScore;
            }
            else if (current.equals(" "))
            {
                score += 0;
            }
            else
            {
                score += consonantScore;
            }
//          use this to test if the score is being added correctly...
//          System.out.println(score);
        }
        return score;
    }

}
