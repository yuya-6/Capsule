//演習①
public class Person {
	
	public String name = null;
	public int age = 0;//演習④public →　private
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//演習⑤
	public int getAge(){
		return this.age;
	}
	
	public void setAge(int age){
		this.age = age;
	}

}
