
import javax.swing.JOptionPane;

public class Sort {
	
	public static int [] sortedList (int [] numberList){
		
		JOptionPane.showInputDialog(null, "Enter ten numbers");
		for(int i = 0; i<numberList.length; i++)
			for(int j=1; j<numberList.length; j++)
				if(numberList[i]>numberList[j])
					swap(numberList,i,j);
		return numberList;
	}
	
	private static void swap(int[] numberList, int i, int j){
		int temp = numberList[i];
		numberList[i] = numberList[j];
		numberList[j] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] unsortedList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		int [] sortedList = sortedList(unsortedList);
		for(int i=0; i<sortedList.length; i++) {
			System.out.println(sortedList[i]);
		}

	}

}

