package cn.sinomdt.sn.oop.abstractdemo;

import cn.sinomdt.sn.oop.interfacedemo.DoSomething;
import cn.sinomdt.sn.oop.main.People;

public abstract class behavior implements DoSomething {
	@Override
	public void speak(People people) {
		// TODO Auto-generated method stub
		System.out.println(people.Age+"���"+people.Name+"��Ҫ�Զ���");
	}
	@Override
	public void sleep(People people) {
		// TODO Auto-generated method stub
		System.out.println(people.Age+"���"+people.Name+"��Ҫ˯��");
	}
	public abstract void Eatting(People people);
    public abstract void Smoking(People people);
	public void Look(People people,String something){
		System.out.println(people.Age+"���"+people.Name+"���ڿ�"+something);
	}

}
