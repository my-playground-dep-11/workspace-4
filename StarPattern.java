public class StarPattern{
    public static void main(String[] args) {  
       printStar(5, 5);
    }

    public static void printStar(int col, int row){
        if (col == 0) {
            col = (row-1);
            row--;
            System.out.println();
        }
        if (row == 0) return;
        System.out.print("* ");
        col--;
        printStar(col, row);
    } 
}