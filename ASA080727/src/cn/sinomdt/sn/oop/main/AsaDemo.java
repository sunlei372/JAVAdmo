package cn.sinomdt.sn.oop.main;

public class AsaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("��ʼ��ı���");
		People people = new People();
		people.Name = "����";
		people.Age = 18;
		people.Eatting(people);
		people.Look(people, "��������");
		people.sleep(people);
		People people2 = new People();
		people2.Name = "����";
		people2.Age = 45;
		people2.Smoking(people2);
		people2.Eatting(people2);
   
		System.out.println("���ݽ���");
		System.out.println("����github");

	}

}
