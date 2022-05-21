	package Sprint1Day4;
	
	public class Student {
	
		private int Roll;
		private String Name;
		private int Age;
		private int Marks;
		
		//zero argument constructor
		public Student(){
			
		}
		
		public void setRoll(int roll){
			this.Roll=roll;
		}
		
		public int getRoll(){
			return Roll;
		}
		
		public void setName(String name){
			this.Name=name;
		}
		
		public String getName(){
			return Name;
		}
		
		public void setAge(int age) {
			this.Age=age;
		}
		
		public int getAge() {
			return Age;
		}
		
		public void setMarks(int marks){
			this.Marks= marks;
		}
		
		public int getMarks(){
			return Marks;
		}
		
		//parameterized constructor
		public Student(int roll,String name,int age,int marks){
			this.Roll=roll;
			this.Name=name;
			this.Age = age;
			this.Marks=marks;
		}
		
		public void showDetails(){
			System.out.println("Roll is :"+Roll);
			System.out.println("Name is :"+Name);
			System.out.println("Age is :"+Age);
			System.out.println("Marks is :"+Marks);
		}
	}
	

