package MiGong;

public class migong_text {
    public static void main(String[] args) {
        int[][] map = new int[8][7];
        for (int i = 0; i < map.length; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        for (int j = 1; j < map[0].length; j++) {
            map[0][j] = 1;
            map[7][j] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        for (int j=0;j<8;j++){
            for (int i=0;i<7;i++){
                System.out.print(map[j][i]+" ");
            }
            System.out.println();
        }

        getmap(map,1,1);
        System.out.println();


        for (int j=0;j<8;j++){
            for (int i=0;i<7;i++){
                System.out.print(map[j][i]+" ");
            }
            System.out.println();
        }
    }

    //0是没走，1是墙，2是通过，
    public static boolean getmap(int[][] arr, int i, int j) {
        if (arr[6][5] == 2) {
            return true;
        }else if (arr[i][j]==0){
            arr[i][j]=2;
            if (getmap(arr,i+1,j)){
                return true;
            }else if (getmap(arr,i,j+1)){
                return true;
            }else if(getmap(arr,i-1,j)){
                return true;
            }else if (getmap(arr,i,j-1)){
                return true;
            }else{
                arr[i][j]=3;
                return false;
            }
        }else{
            return false;
        }
    }
}
