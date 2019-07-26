class Solution {  //Runtime: 35 ms, faster than 36.43% of Java online submissions for Reorder Log Files.
//Memory Usage: 38.6 MB, less than 69.68% of Java online submissions for Reorder Log Files.
                 
    
    public String[] reorderLogFiles(String[] logs) {
        
       ArrayList<String> str1 = new ArrayList<String>();
        ArrayList<String> str2 = new ArrayList<String>();
        Map<String,String> strlmap = new TreeMap<>();
        for(int i =0;i< logs.length;i++ )
        {
            String[] stunum=new String[2];
            stunum = logs[i].split(" ",2);

            if(stunum[1].charAt(0) >= 'a'&& stunum[1].charAt(0)<='z')
            {
                str1.add(logs[i]);
            }
            if(stunum[1].charAt(0) >= '0'&& stunum[1].charAt(0)<='9')
            {
                str2.add(logs[i]);
            }

        }
        int k =0;
      
  Collections.sort(str1, (o1, o2) -> { //重写sort方法。在字母相同的时候按照标识排序
            int indexo1 = o1.indexOf(" ");
            int indexo2 = o2.indexOf(" ");
            String flago1 = o1.substring(0,indexo1);
            String flago2 = o2.substring(0,indexo2);
            String substro1 = o1.substring(indexo1+1);
            String substro2 = o2.substring(indexo2+1);
          if(substro1.compareTo(substro2)==0)
          {
              return flago1.compareTo(flago2);
          }
            return substro1.compareTo(substro2);
        });

        str1.addAll(str2);
        String[] result = str1.toArray(new String[str1.size()]);
        return result;
               
        }
    }
