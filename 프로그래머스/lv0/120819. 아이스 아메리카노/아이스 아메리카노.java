class Solution {
    public int[] solution(int money) {
        int iceAmericanoPrice = 5500;
        
        int buyAble = money / iceAmericanoPrice;
        int exchange = money % iceAmericanoPrice;
        
        return new int[]{buyAble, exchange};  
    }
}