class Solution {
    public int solution(int[][] sizes) {
        
        int max_width = 0;
        int max_height = 0;
        int wallet_size;
        
        for(int i=0; i<sizes.length; i++){
            int temp;
            
            for(int j=0; j<2; j++){

                if(sizes[i][0] < sizes[i][1]){
                    temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
                }
                

                if(max_width < sizes[i][0]){
                    max_width = sizes[i][0];
                }

               
                if(max_height < sizes[i][1]){
                    max_height = sizes[i][1];
                }
            }
        }
        wallet_size = max_width * max_height;

        return wallet_size;
    }
}