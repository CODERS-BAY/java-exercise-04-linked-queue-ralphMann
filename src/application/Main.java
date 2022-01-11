package application;

import impl.Employee;
import impl.QueueImpl;

public class Main {

	public static void main(String[] args) {
		QueueImpl queue = new QueueImpl();

		Employee emp = new Employee("Hans","Home Office", "Work");

		queue.add(emp);
		queue.print();
		queue.add(new Employee("Fritz","Comp.", "Sleep"));
		queue.print();
		emp = new Employee("qwertz","asdf", "jklö");
		queue.add(emp);
		queue.print();
		System.out.println(queue.retrieve());
		System.out.println("--------------------");
		queue.print();
		System.out.println(queue);
		queue.clear();
		System.out.println(queue);
		queue.print();
	}

}