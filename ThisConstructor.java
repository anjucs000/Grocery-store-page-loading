class ThisConstructor{
	public ThisConstructor(){
		this(4);
		System.out.println("default constructor");
	}
	public ThisConstructor(int a){
		this("sample");
		System.out.println(a);
	}
	public ThisConstructor(String b){
		System.out.println(b);
	}
	public static void main(String args[]){
		ThisConstructor obj=new ThisConstructor();
		//ThisConstructor obj1=new ThisConstructor(5);
		//ThisConstructor obj2=new ThisConstructor("test");	
	}
}


//this() is used for invoking constructor and should be first statement of the method