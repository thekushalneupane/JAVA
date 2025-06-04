class Sentence {
   private String sentence;
   public void setSentence(String sentence){
     this.sentence = sentence;
   }
   
   public void capitalizeWords(){
     String[] words = sentence.split(" ");
     String result = "";
     for(int i=0; i<words.length; i++){
        if(words[i].length()>0){
           String firstChar = words[i].substring(0,1).toUpperCase();
	   String rest = words[i].substring(1);
	   result = result + firstChar + rest + " ";
        }
     }
     System.out.println("Formatted Sentence: "+ result);
   }
}

class CapitalWords {
    public static void main(String[] args) {
        Sentence s = new Sentence();
      s.setSentence("i don't loose, i win!");
      s.capitalizeWords();
    }
}