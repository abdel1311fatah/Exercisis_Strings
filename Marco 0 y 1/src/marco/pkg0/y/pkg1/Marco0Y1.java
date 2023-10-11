
package marco.pkg0.y.pkg1;


public class Marco0Y1 {

    
    public static void main(String[] args) {
        int matriu[][] = matriu= new int [5][5]; 
  
        for (int i=0;i<matriu.length;i++){
            for (int j=0;j<matriu.length;j++){ 
                if (i==0 || i==4 || j==0 || j==4){
                    matriu[i][j]= 1;
                }else{
                    matriu[i][j]= 0;
                }      
            }
        }
        for (int i=0;i<matriu.length;i++){
            for (int j=0;j<matriu.length;j++){ 
                System.out.print(" "+matriu[i][j]);
            }
            System.out.println(" ");
        }
    }
    
}
