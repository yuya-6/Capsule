//演習②
public class Capsule {
	
	public static void main(String[] args){
		Person taro = new Person("山田太郎",20); 
		System.out.println(taro.getName());//演習④(getName)
		//演習③→実行
		
		//演習④
		taro.setName("花子");
		System.out.println(taro.getName());	
		
		//演習⑤
		System.out.println(taro.getAge());
		
		taro.setAge(30);
		System.out.println(taro.getAge());
	}

}
