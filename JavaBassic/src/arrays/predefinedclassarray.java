package arrays;

public class predefinedclassarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//in multidimensional array multiple rows and multiple columns are there
		int[][] array=new int[3][4];
		System.out.println(array.length);
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;i++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
