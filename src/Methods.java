public class Methods {
    public static int score(String finalMessage)
    {
        finalMessage = finalMessage.toLowerCase();
        int score = 0;
        String current = "";
        for (int i = 0; i < finalMessage.length(); i++)
        {
            current = finalMessage.substring(i, i + 1);
            if (current.equals("a") | current.equals("e") | current.equals("i") | current.equals("o") | current.equals("u"))
            {
                score += 5;
            }
            else if (current.equals(".") | current.equals("!"))
            {
                score += 2;
            }
            else
            {
                score ++;
            }
//            System.out.println(score);
        }
        return score;
    }

}
