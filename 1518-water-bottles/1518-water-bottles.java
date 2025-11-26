class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total=numBottles,empty=numBottles;
        while(empty>=numExchange){
            int newBottles=empty/numExchange;
            total+=newBottles;
            empty=newBottles+(empty%numExchange);
        }
        return total;
    }
}

        /*  drunk=0,empty=0;
            drunk += bottles;
            empty += bottles;
            bottles = empty / exchange;
            empty %= exchange; */