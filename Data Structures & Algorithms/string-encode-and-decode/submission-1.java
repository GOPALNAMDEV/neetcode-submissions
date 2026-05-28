class Solution {

//Encoding of string using length and Character as a seperator of word
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j =i;
            while(str.charAt(j) != '#'){
                j++;
            }
            // Integer.parseInt convert the string to number "12" to 12 ans substring(start, end of string char)
            int length = Integer.parseInt(str.substring(i,j));
            j++;
            // if the # in 2nd position then the word start after that whch is in 3rd thats why j+1 which is the starsting position of string end end becomes the length of the string if gopal then g is 3 and 7ths is l so it become 3,7 
            String word = str.substring(j, j + length);
            // now i start from the next index after previous word which means after gopal 8th index
            i = j + length;
            result.add(word);
        }
        return result;

    }
}
