package easy;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean isValidSudoku(char[][] board) {
		HashSet set=new HashSet();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(board[i][j]!='.'){
					if(set.contains(board[i][j]))
						return false;
					else
						set.add(board[i][j]);
				}
			}
			set.clear();
		}
		for(int j=0;j<9;j++){
			for(int i=0;i<9;i++){
				if(board[i][j]!='.'){
					if(set.contains(board[i][j]))
						return false;
					else
						set.add(board[i][j]);
				}
			}
			set.clear();
		}
		for(int i=0;i<3;i++){
			for(int k=0;k<3;k++){
				for(int j=i*3;j<(i+1)*3;j++){
					for(int h=k*3;h<(k+1)*3;h++){
						if(board[j][h]!='.'){
							if(set.contains(board[j][h]))
								return false;
							else
								set.add(board[j][h]);
						}
					}
				}
				set.clear();
			}
		}
		return true;
    }

}
