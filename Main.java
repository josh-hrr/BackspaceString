import java.util.ArrayList; 

class Main { 
  public static void main(String[] args) { 
    String s = "ab#c";
    String t = "ad#c";
    System.out.println(backspaceCompare(s, t)); 
  }

  public static boolean backspaceCompare(String s, String t) {
        String test1 = "";  
        ArrayList<Character> arrResult1 = new ArrayList<>();

        String test2 = "";  
        ArrayList<Character> arrResult2 = new ArrayList<>();

            for(int i = 0; i<s.length(); i++){
                test1 = test1 + s.charAt(i); 
                int index = 0;
                arrResult1.add(s.charAt(i));

                try {
                    if(test1.charAt(i) == '#'){  
                        index = index + i;
                        arrResult1.remove(index);

                        if(arrResult1.indexOf(i) != 0){
                            arrResult1.remove(index - 1);
                        } 
                    }   

                }catch(Exception e){
                    System.out.println("normal");
                }
                
            } 

            for(int i = 0; i<t.length(); i++){
                test2 = test2 + t.charAt(i); 
                int index = 0;
                arrResult2.add(t.charAt(i));

                try {
                    if(test2.charAt(i) == '#'){  
                        index = index + i;
                        arrResult2.remove(index);
                        arrResult2.remove(index - 1);
                    }

                    if(test2.charAt(i) == '#' && test2.indexOf(i) == 0){  
                        index = index + i;
                        arrResult2.remove(index); 
                    }
  
                }catch(Exception e){
                    System.out.println("normal");
                }
                
            }  

            boolean testingComp = false;

            for(int i = 0; i<arrResult1.size(); i++){ 
                for(int k = 0; k<arrResult2.size(); k++){  
                    if(arrResult1.get(i) == arrResult2.get(i)){ 
                        testingComp = true;
                    }
                }
            } 
        return testingComp;
    }
}


