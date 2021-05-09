public class ZAlgorithm {
    //Compute Z-Array
    public int[] calculateZArray(String value){
        int[] zArray = new int[value.length()];
        int left = 0, right = 0;
        for(int i = 1; i < value.length(); i++){
            if(i > right){
                left = right = i;
                while(right < value.length() && value.charAt(right) == value.charAt(right-left))
                    right++;

                zArray[i] = right-left;
                right--;
            }

            else{
                int k = i - left;

                if(zArray[k] < right - k + 1)
                    zArray[i] = zArray[k];
                else
                {
                    left = k;
                    while(right < value.length() && value.charAt(right) == value.charAt(right-left))
                        right++;
                    zArray[k] = right - left;
                    right--;
                }
            }
        }

        return zArray;
    }

    //calculate number of given subString present in String value.
    public int substringsInString(String value, String subString){
        value = subString + "$" + value;
        int[] zArray = calculateZArray(value);
        int subStringsCount = 0;
        for(int a : zArray)
        {
            if(a == subString.length())
                subStringsCount++;
        }

        return subStringsCount;
        }

    //Calculate whether given subString present in String value or not.
    public boolean isSubStringPresent(String value, String subString){
        value = subString + "$" + value;
        int[] zArray = calculateZArray(value);
        for(int a : zArray)
        {
            if(a == subString.length())
                return true;
        }

        return false;
    }
}
