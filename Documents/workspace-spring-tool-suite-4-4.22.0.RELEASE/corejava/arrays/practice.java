package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class Employee
{
	private String name;
	private Integer age;
	private Integer id;
	
	
	Employee(String name, Integer age, Integer id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
	}
	
	
}

public class practice {
	
	

	public static void main(String[] args) {
		

		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee("Rohit",25,100));
		empList.add(new Employee("Raj",35,101));
		empList.add(new Employee("Mohit",31,102));
		
		System.out.println(empList.stream().filter((em)->em.getAge() == 31).collect(Collectors.toList()));
		
		
		System.out.println(empList);

		
		
//		int n[] = new int[]{1,2,3,4,5};
//		int sum=0;
//		int avg=0;
//		for(int i=0; i<=n.length; i++) {
//			sum +=i;
//			avg = sum/n.length;
//		}
//		System.out.println("Total sum of array = "+sum);
//System.out.println("Total average = "+avg);
		
		
//		String str[] = new String[] {"Rohith"};
//		String str1[] = new String[] {"Kumar"};
//		
//		int tlength = str.length + str1.length;
//		String[] mergedArray = new String[tlength];
//		for(int i=0; i<str.length; i++) {
//			mergedArray[i] = str[i];
//		}
//		for(int j=0; j<str1.length; j++) {
//			mergedArray[str.length + j] = str1[j];
//		}
//		System.out.println("Merged elements : ");
//			for(String e : mergedArray) {
//				System.out.print(e);
//			}
		
//		int n[] =  {1,2,3,4};
//		int maxValue = n[0];
//		int maxIndex = 0;
//		
//		for(int i=1;i<n.length; i++) {
//			//if(n[i]>maxValue)
//			maxValue = n[i];
//			maxIndex = i;
//		}
//				System.out.println(maxValue);
//				System.out.println(maxIndex);
		
		
//		String n[] = {"Rohith", "Kumar"};
//		
//		Arrays.toString(n);
//		Arrays.sort(n);
//		System.out.println(Arrays.toString(n));
		
//		int a[][] = new int[10][7];
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<7;j++) {
//				System.out.print(" "+a[i][j]);
//			}
//			System.out.println(" ");
//		}
		
		
//		List<String> a = new ArrayList<String>();
//		
//	a.add("rohith");
//	a.add("kumar");
//	a.add("asc");
//	System.out.println(a);
//	
//	a.add(1, "def");
//	System.out.println(a);
		
	
		}
	}


