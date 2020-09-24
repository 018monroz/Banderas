public class Bandera {
    public static void main(String args[]) {
        int [][] chile;
        chile = new int [10][30];
        System.out.println("CHILE");
        for(int i=0;i<10;i++){
            for (int j=0;j<30;j++){
                if(i==2 && j==4){
                  System.out.print("\033[0m"+"*");  
                }else{
                if(i<5 && j<9){
                System.out.print("\033[0;34m"+chile [i][j]);
                }
                if(i<5 && j>=9){
                   System.out.print("\033[0m"+chile [i][j]);
                }
                if(i>=5 && j>=9 || i>=5 && j<9){
                    System.out.print("\033[0;31m"+chile [i][j]);
                }
                }

                
            }
                System.out.println();
            }

        }
    }

