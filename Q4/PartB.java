public boolean clearPair(int row, int col){
        for(int r=row;r<puzzle.length;r++){
            for(int c=col;c<puzzle[r].length;c++){
                if(r !=row || c!=col){} 
                 if(puzzle[row][col]==puzzle[r][c]||puzzle[row][col]+puzzle[r][c]==10){
                    puzzle[row][col]=0;
                    puzzle[r][c]=0;
                    return true;
                 }
                } 
            }
        }
        return false;
    }
