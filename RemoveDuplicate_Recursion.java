public static void removeDuplicates(String str, StringBuilder newStr, int idx, boolean map[] ) {      
        //base case
        if(idx == str.length()){
          System.out.println(newStr);
          return;
        }

        char curruntChar = str.charAt(idx);
        if(map[curruntChar - 'a'] == true){
          removeDuplicates(str, newStr, idx+1, map);
        }else{                                                                      //Microsoft & //Google
          map[curruntChar - 'a'] = true;
          removeDuplicates(str, newStr.append(curruntChar), idx+1, map);
        }
    }

    public static void main(String args[]) {
        String str = "hellojeekyahaalhaisabke";  //Output : "helojkyaisb"                                  
        removeDuplicates(str, new StringBuilder(""), 0 , new boolean[26]);
    }
