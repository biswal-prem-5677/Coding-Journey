import java.util.*;
class ArrayListDemo
{
	public static void main(String[] a)  {
		
		ArrayList al = new ArrayList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of inputs that you want to insert: ");
		int n = sc.nextInt();
		System.out.println("Enter the numbers");
		for(int i=0; i<n; i++){
			int num = sc.nextInt();
			al.add(num);
		}
		System.out.println(al);
		HashSet hs = new HashSet(al); 
     		//Iterator itr = hs.iterator();
		System.out.println(hs);
		
		}
	}