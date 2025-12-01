class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0) return list;

        int start = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                if (start == nums[i - 1]) {
                    list.add(String.valueOf(start));
                } else {
                    list.add(start + "->" + nums[i - 1]);
                }
                start = nums[i];
            }
        }

        if (start == nums[nums.length - 1]) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + nums[nums.length - 1]);
        }

        return list;
    }
}


/* class Solution {
    public List<String> summaryRanges(int[] n) {
        int cnt=0;
        List<String> list=new ArrayList<>();
        for(int i=0;i<n.length-1;i++){
            if(n[i+1]==n[i]+1) {
                cnt++;
                continue;
            }
            else {
                int a=n[i],b=n[i]+cnt;
                if(cnt==0) list.add(a);
                else list.add(a->b);
            }
        }
        return list;
    }
} */