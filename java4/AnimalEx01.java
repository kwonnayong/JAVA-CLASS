package java4;

interface Animal {

	public abstract void sound();
}

class Dog implements Animal {
// ��ȿȭ��Ű��.

	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat implements Animal {

	
	public void sound() {
		System.out.println("�߿�");
	}
}

class Tiger implements Animal {
	public void sound() {
		System.out.println("����");
	}
}

class Bird implements Animal {

	
	public void sound() {
		System.out.println("±±");
	}
}

class Pig implements Animal {

	
	public void sound() {
		System.out.println("�ܲ�");

	}

}

public class AnimalEx01 {

	public static void play(Animal b) {
		b.sound();
	}

	public static void main(String[] args) {
		Bird b1 = new Bird();
		play(b1);

		Cat c1 = new Cat();
		play(c1);

		play(new Dog());

		play(new Tiger());

		play(new Pig());

	}
}
