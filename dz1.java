//1768. Merge Strings Alternately
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            try {
                merge.append(word1.charAt(i));
            } catch (Exception e) {
            }
            try {
                merge.append(word2.charAt(i));
            } catch (Exception e) {
            }
            i++;
        }
        return merge.toString();
    }
}

//27. Remove Element

class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++] = nums[i];
            }
        }
        return count;
    }
}

//88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        n -= 1;
        m -= 1;
        int copyInd = nums1.length - 1;

        while (n >= 0) {
            if (m >= 0 && nums1[m] > nums2[n]) {
                nums1[copyInd] = nums1[m--];
            } else {
                nums1[copyInd] = nums2[n--];
            }
            copyInd -= 1;
        }
    }
}

//151. Reverse Words in a String
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }

            int start  = end - 1;

            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}