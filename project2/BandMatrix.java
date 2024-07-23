public class BandMatrix {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);        
        
        for (int i = 0; i < n; i++) {
            // i = 2
            for (int j = 0; j < n; j++) {
                // print asterisks for the main diagnol
                if( i == j ){
                    // the main diagnal is always the nth (j) column of the nth row (i)
                    System.out.print("*  ");
                    continue;
                }
                
                if ( j >= i-width && j < i ){
                    System.out.print("*  ");
                    continue;
                }
                
                if ( j <= i+width && j>i) {
                   System.out.print("*  ");
                   continue;
                }
                
                System.out.print(0);
                System.out.print("  ");
            }
            System.err.println();
        }
    }   
}