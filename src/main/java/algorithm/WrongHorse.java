package algorithm;


/**
 * 马踏棋盘思想错误番
 * @author linuxea.lin
 *
 */
 @Deprecated
public class WrongHorse {
	
	int X = 8;
	int Y = 8;
	
	int[][] qiPan = new int[X][Y]; //棋盘 init with zeor
	int step;
	
	
	/**
	 * 从起始节点 begin 开始
	 * @param begin
	 */
	public void begin(Node begin){
		move(begin);
	}
	
	public int move(Node node){
		
		if(node.getDept() == X * Y ) return 1 ;
		
		qiPan[node.getX()][node.getY()] = node.getDept();
		
		if(node.getX()+2<X && node.getY()-1>=0 && qiPan[node.getX()+2][node.getY()-1] == 0){
			
			return move(new Node(node.getX()+2, node.getY()-1, node.getDept() + 1));
			
		}else if(node.getX()+1<X && node.getY()-2>=0 && qiPan[node.getX()+1][node.getY()-2] == 0){
			
			return move(new Node(node.getX()+1, node.getY()-2, node.getDept() + 1));
			
		}else if(node.getX()+2<X && node.getY()+1<Y && qiPan[node.getX()+2][node.getY()+1] == 0){
			
			return move(new Node(node.getX()+2, node.getY()+1, node.getDept() + 1));
			
		}else if(node.getX()+1<X && node.getY()+2<Y && qiPan[node.getX()+1][node.getY()+2] == 0){
			
			return move(new Node(node.getX()+1, node.getY()+2, node.getDept() + 1 ));
			
		}else if(node.getX()-1>=0 && node.getY()+2<Y && qiPan[node.getX()-1][node.getY()+2] == 0){
			
			return move(new Node(node.getX()-1, node.getY()+2, node.getDept() + 1 ));
			
		}else if(node.getX()-2>=0 && node.getY()+1<Y && qiPan[node.getX()-2][node.getY()+1] == 0){
			
			return move(new Node(node.getX()-2, node.getY()+1, node.getDept() + 1 ));
			
		}else if(node.getX()-1>=0 && node.getY()-2>=0 && qiPan[node.getX()-1][node.getY()-2] == 0){
			
			return move(new Node(node.getX()-1, node.getY()-2, node.getDept() + 1 ));
			
		}else if(node.getX()-2>=0 && node.getY()-1>=0 && qiPan[node.getX()-2][node.getY()-1] == 0){
			
			return move(new Node(node.getX()-2, node.getY()-1, node.getDept() + 1 ));
			
		}else{
			// no optional for next step
			qiPan[node.getX()][node.getY()] = 0;
		}
		return 0;
		
	}
	
	public static void main(String[] args) {
		WrongHorse horse = new WrongHorse();
		horse.begin(new Node(0,0,1));
		for(int i = 0;i<horse.X;i++){
			for(int j = 0;j<horse.Y;j++){
				System.out.print(horse.qiPan[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
}


class Node{
	
	int x;
	int y;
	int dept;
	
	public Node(){}
	
	public Node(int x, int y, int dept){
		this.x = x;
		this.y = y;
		this.dept = dept;
	}
	
	
	
	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Node [x=" + x + ", y=" + y + "]";
	}
	
	
}
