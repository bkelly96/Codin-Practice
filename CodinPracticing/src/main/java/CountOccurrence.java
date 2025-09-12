class CountOccurrence {
    public int countWords(String[] words1, String[] words2) {

        Map<String, Integer> count1 = new HashMap<>();
        Map<String, Integer> count2 = new HashMap<>();

        for(String w: words1){
            count1.put(w, count1.getOrDefault(w,0) + 1);
        }

        for(String w: words2){
            count2.put(w, count2.getOrDefault(w,0) + 1);
        }

        int result = 0;
        for(String w: count1.keySet()){
            if(count1.get(w) == 1 && count2.getOrDefault(w,0) == 1){
                result ++;
            }
        }

        return result;
    }