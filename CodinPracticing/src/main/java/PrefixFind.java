class PrefixFind {
    //iterate through, add the
    //largely on the right path
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        String prefix = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);
                if(prefix.isEmpty()){
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] example1 = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(example1)); // Output: "fl"

        String[] example2 = {"dog", "racecar", "car"};
        System.out.println(longestCommonPrefix(example2)); // Output: ""
    }
}