package cn.sinomdt.sn.oop.extendsMethod;

import cn.sinomdt.sn.oop.abstractdemo.behavior;
import cn.sinomdt.sn.oop.main.People;

public class PublicMethod extends behavior {
	@Override
	public void Eatting(People people) {
		// TODO Auto-generated method stub
		System.out.println(people.Age+"���"+people.Name+"����Eating");
	}

	@Override
	public void Smoking(People people) {
		// TODO Auto-generated method stub
		System.out.println(people.Age+"���"+people.Name+"���ڳ���");
	}

}
