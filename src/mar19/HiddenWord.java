package mar19;

public class HiddenWord {

    private String word;

    public HiddenWord(String word)
    {
        this.word = word;
    }

    public String getHint(String guess){
        String result = "";
        for(int x = 0; x < guess.length(); x++){
            if(guess.substring(x, x+1).equals(word.substring(x,x+1))){
                result += guess.substring(x,x+1);
            }
            else if(word.indexOf(guess.substring(x,x+1))!= -1){
                result += "+";
            }
            else result += "*";
        }
        return result;
    }





    public static void main(String[] args){
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA"));
        System.out.println(puzzle.getHint("HELLO"));
        System.out.println(puzzle.getHint("HEART"));
        System.out.println(puzzle.getHint("HARMS"));
        System.out.println(puzzle.getHint("HARPS"));

    }


}
