
package algorithm;

/**
 * 马踏棋盘递归走法
 * @author linuxea.lin
 *
 */
public class OkHorse {
	
	private int X = 8; //棋盘橫向
	private int Y = 8; //棋盘纵向
	
	private int[][] cheeseFlate = new int[X][Y]; // 棋盘 init with 0
	
	private int fx[]={1,2,2,1,-1,-2,-2,-1};  // 马字橫向走势
	private int fy[]={2,1,-1,-2,-2,-1,1,2};  // 马字纵向走势
	
	
	/**
	 * 打印棋盘
	 */
	private void printCheese(){
		
		for(int i = 0;i<X;i++){
			for(int j = 0;j<Y;j++){
				System.out.print(cheeseFlate[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * 检查当前步是否可行
	 * @param x
	 * @param y
	 * @return
	 */
	private int check(int x, int y){
		
		if(x >= 0 && x < X && y >= 0 && y < Y && cheeseFlate[x][y] == 0)
			return 1;
		
		return 0;
	}
	
	/**
	 * explore next
	 * @param x
	 * @param y
	 * @param dept
	 * @return
	 */
	private int find(int x, int y, int dept){
		
		int xx;
		int yy;
		
		for(int i = 0;i<8;i++){ // a horse has eight next step (由此可见递归的广度与深度
			
			xx = x + fx[i];
			yy = y + fy[i];
			
			if(check(xx, yy) == 1){
				
				cheeseFlate[xx][yy] = dept;
				
				if(dept == X * Y){
					printCheese();
					return 1;
				}
				
				if(find(xx,yy, dept+1) == 1){
					return 1;
				}else{
					// 没有下一步 将当前节点重新置为0  与 return 0 对应(0 表示不同的意思
					cheeseFlate[xx][yy] = 0;
				}
			}
			
		}
		
		return 0;  // 马的八种走路都不能找到下一步
		
	}
	
	
	public static void main(String[] args) {
		OkHorse okHorse = new OkHorse();
		okHorse.cheeseFlate[0][0] = 1;
		okHorse.find(0,0,2);
	}

}
