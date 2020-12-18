public class WriteLine{
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            for(int j=0;j<12;j++){
                if(i == 0 || i == 1){
                    if(j == 5 || j == 6){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    if(i == 2 || i == 3){
                        System.out.print("*");
                    }
                    if(i == 4 || i == 5){
                        if(j == 5||j == 6){
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }

}