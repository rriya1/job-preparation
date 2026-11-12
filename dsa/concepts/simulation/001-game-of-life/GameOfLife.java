import java.util.Scanner;

class GameOfLife{
    public void gameOfLife(int[][] initalLife, int generations){

        for(int generation = 0; generation< generations; generation++){

            int rows = initalLife.length;
            int cols = initalLife[0].length;
            int[][] newGeneration = new int[rows][cols];

            for(int i = 0; i<rows; i++){
                for( int j = 0; j< cols; j++){
                    int aliveCell = 0;

                    boolean isColLess = j-1<0? true: false;
                    boolean isColSpill = j+1>=cols? true: false;

                    //one row above
                    if(i-1>=0){
                        if(!isColLess){
                            if(initalLife[i-1][j-1]!=0)
                                aliveCell++;
                        }
                        if(initalLife[i-1][j]!=0)
                                aliveCell++;
                        if(!isColSpill){
                            if(initalLife[i-1][j+1]!=0)
                                aliveCell++;
                        }   
                    }

                    //early death to cell to remove computation
                    if(aliveCell>3){
                        newGeneration[i][j] = 0;
                        continue;
                    }

                    //same row as cell
                    if(!isColLess){
                            if(initalLife[i][j-1]!=0)
                                aliveCell++;
                        }
                        if(!isColSpill){
                            if(initalLife[i][j+1]!=0)
                                aliveCell++;
                        }
                        
                     //early death to cell to remove computation
                    if(aliveCell>3){
                        newGeneration[i][j] = 0;
                        continue;
                    }
                    
                     //one row below
                    if(i+1<rows){
                        if(!isColLess){
                            if(initalLife[i+1][j-1]!=0)
                                aliveCell++;
                        }
                        if(initalLife[i+1][j]!=0)
                                aliveCell++;
                        if(!isColSpill){
                            if(initalLife[i+1][j+1]!=0)
                                aliveCell++;
                        }   
                    }

                    if(aliveCell <=1 || aliveCell > 3)
                        newGeneration[i][j] = 0;
                    else
                        if(aliveCell == 3)
                            newGeneration[i][j] = 1; // 3 will make a cell alive
                    else
                        newGeneration[i][j] = initalLife[i][j]; // 2 alive cell don't change state
                }
            }

        //print this generation
        System.err.println("generation" + generation);
        for(int i=0; i< rows ; i++){
            for(int j=0; j< cols; j++){
                    System.out.print(" "+ newGeneration[i][j]+ " ");
                }
                System.out.print("\n");
            }
            initalLife = newGeneration; 
        }
    }
}

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a new game of life board size\n");

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        int[][] newLife = new int[rows][cols];

        GameOfLife newGameOfLife = new GameOfLife();
        System.out.println("enter a new game of life configuration (0 = dead, 1 = alive)");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                newLife[row][col] = scanner.nextInt();
            }
        }

        newGameOfLife.gameOfLife(newLife, 5);

        scanner.close();

    }
}