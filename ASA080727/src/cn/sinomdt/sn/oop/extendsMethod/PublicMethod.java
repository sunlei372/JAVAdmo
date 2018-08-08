package cn.sinomdt.sn.oop.extendsMethod;

import cn.sinomdt.sn.oop.abstractdemo.behavior;
import cn.sinomdt.sn.oop.main.People;

public class PublicMethod extends behavior {
	@Override
	public void Eatting(People people) {
		// TODO Auto-generated method stub
		System.out.println(people.Age+"岁的"+people.Name+"正在Eating");
	}

	@Override
	public void Smoking(People people) {
		// TODO Auto-generated method stub
		System.out.println(people.Age+"岁的"+people.Name+"正在抽烟");
	}

}
