package cn.sinomdt.sn.oop.main;

public class AsaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始你的表演");
		People people = new People();
		people.Name = "张三";
		people.Age = 18;
		people.Eatting(people);
		people.Look(people, "看足球赛");
		people.sleep(people);
		People people2 = new People();
		people2.Name = "李四";
		people2.Age = 45;
		people2.Smoking(people2);
		people2.Eatting(people2);
   
		System.out.println("表演结束");
		System.out.println("测试github1");

	}

}
