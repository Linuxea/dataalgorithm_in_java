package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.google.common.collect.Lists;

/**
 * 构造输入的数据全排列
 * @author linuxea.lin
 *
 */
public class DFS {

	private List<String> lists = Lists.newArrayList();
	
	private int[] used;
	private String[] result;
	
	private int total;
	
	
	/**
	 * 数据录入
	 */
	private void scan(){
		Scanner scanner = new Scanner(System.in);
		String line;
		while(null != (line = scanner.nextLine()) && !line.equals("exit")){
			lists.add(line);
		}
		
		used = new int[lists.size()];
		result = new String[lists.size()];
		
		scanner.close();
	}
	
	/**
	 * dfs遍历
	 * @param level
	 */
	private void dfs(int level){
		for(int i = 0;i<lists.size();i++){
			if(used[i] == 0){
				used[i] = 1;
				result[level] = lists.get(i);
				dfs(level + 1);
				used[i] = 0;
			}
		}
		
		// 终止
		if( level == lists.size()){  
			System.out.println(Arrays.toString(result));
			total ++ ;
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		DFS dfs = new DFS();
		dfs.scan();
		dfs.dfs(0);
		System.out.println("共有全排列组数:" + dfs.total);
	}
}
