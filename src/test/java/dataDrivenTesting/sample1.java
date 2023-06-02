package dataDrivenTesting;

public class sample1 {

	public static void main(String[] args) {

			ExcelReader obj=new ExcelReader("D:\\\\file CLass\\\\New folder\\\\vvvvvvv\\\\file2.xlsx");
			
			String a= obj.getData(3,2,1);
			System.out.println(a);
			
			System.out.println("============");
			
			int rows= obj.getRowsCount(0);
			int cell= obj.getCellCount(0);	
			System.out.println(rows);
			System.out.println(cell);

			for(int i=0;i<=rows;i++)
			{
				String b= obj.getData(3,i,0);
				String h=obj.getData(3, i, 1);
						System.out.println(b+" "+h);
			}
			
			
	}

}
