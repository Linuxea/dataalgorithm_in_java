package datastructure.tree;

/**
 * Created by Linuxea on 2017/8/16.
 */
public class SetNullTest {
	private static class User{
		int id;
		String name;

		public User(int id, String name) {
			this.id = id;
			this.name = name;
		}

		@Override
		public String toString() {
			return "User{" +
					"id=" + id +
					", name='" + name + '\'' +
					'}';
		}
	}

	public static void main(String[] argc){
		User root = new User(0,"root");
		User temp = root;
		temp = null;
		System.out.println(root);
	}

}
