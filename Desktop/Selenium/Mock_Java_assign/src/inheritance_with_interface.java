import java.io.*; 	
    interface intfA
	{
		void name();
	}
	interface intfB extends intfA
	{
		void gender();
	}

	class sample implements intfB
	{

		@Override
		public void name() {
			// TODO Auto-generated method stub
			System.out.println("Pradeepa");
			
		}

		@Override
		public void gender() {
			// TODO Auto-generated method stub
			System.out.println("Female");
			
		}
	}
	class inheritance_with_interface{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample obj=new sample();
		obj.name();
		obj.gender();

	}
}
