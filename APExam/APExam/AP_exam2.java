public class AP_exam2
{

    //655X6VY4
    //Y.T.


    //PART a
    public static String changeKey(String letter,String key) {
        String word = "";
        if (key.indexOf(letter) >= 0)//exist
        {
            for (int i = 0; i < key.length(); i++)
            {
                if (!key.substring(i, i + 1).equals(letter))
                {
                    word += key.substring(i, i + 1);
                }
            }
        } else {
            word = letter;
        }
        return word;


    }


    //Part b
    I would make a new method call getChangeKey, returning the int variable of the count.
    inside the method, it needs a int variable called COUNT to keep track of the count of key modification,
    starting at 0. Inside the method getChangeKey, I would provoked the method changeKey. If the word is not
    the same as the word returned by changeKey, then COUNT incremented by 1;









}
