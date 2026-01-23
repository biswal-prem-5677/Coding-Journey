class NestedTryCatch{
	public static void main(String a[]){
		try{
			try{
				System.out.println(50/0);
			}
			catch(ArithmeticException ae){
				System.out.println(50/2);
			}
			System.out.println(10/0);

		}
		catch(Exception e){
			System.out.println(10/2);
		}
	}
}