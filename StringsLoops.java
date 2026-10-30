public class StringsLoops{
    public StringsLoops(){
  
    }
  
    public int length(String s){
      int count = 0;
      while(!s.equals("")){
        s = s.substring(1);
        count++;
      }
      return count;
    }
  
    public String copy(String s, int num){
      int count = num;
      String word = "";
      while(count > 0){
        word = word + s;
      count = count - 1;
      }
       return word;
    }
   
    public String interweaving(String s1, String s2){
      String name1 = s1;
      String name2 = s2;
      int count = 0;
      int count1 = i;
      String newWord = "";
      while(count > ){
        newWord = (name1.substring(count, count + 1) + name2.substring(count, count + 1));
        count++;

      }

      return newWord;
    }
  
  
  }