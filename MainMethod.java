package comparableVscomparator;

import java.util.Arrays;

public class MainMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ary= {2,5,3,4,9,8};
		Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
		
		
		Employee[] employe = new Employee[4];
		employe[0]= new Employee(45, "mola");
		employe[1]= new Employee(4, "zenebuola");
		employe[2]= new Employee(1, "hilufola");
		employe[3]= new Employee(46, "chalaola");
		
		Arrays.sort(employe);
		
		Arrays.sort(employe,Employee.custumuzingComparing ); //using comparator customizing ordering,
		////implements comparator interface override compare method and takes two parametres
		
		System.out.println(Arrays.toString(employe)); // using comparable =>natural ordering, implements
		// comparable interface overrides comparTo method and taks one parametr
		
		
		

	}

}
