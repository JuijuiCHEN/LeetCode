package com.test.question690;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 *  返回指定員工以及其下屬的importance加總，
 *  若其下屬還有下屬則須一同加入。
 */
public class EmployeeImportance {

	public static void main(String[] args) {
		List<Integer> Subordinates = Arrays.asList(2, 3);
		List<Integer> Subordinates2 = Arrays.asList(4);
		List<Employee> employees = new ArrayList<Employee>();
		
		employees.add(new Employee(1, 5, Subordinates));
		employees.add(new Employee(2, 3, Subordinates2));
		employees.add(new Employee(3, 4));
		employees.add(new Employee(4, 1));

		System.out.println("answer:" + getImportance(employees, 1));
	}

	public static int getImportance(List<Employee> employees, int id) {
		
		// 紀錄id
		int targetedEm = 0;
		
		// 加總 importance
		int importance = 0;

		// 記錄該 id
		for (Employee employee : employees) {
			if (employee.id == id) {
				targetedEm = employee.id;

			}
		}

		Queue<Integer> queue = new LinkedList<Integer>();
		// 把id放入queue
		queue.add(targetedEm);

		// queue 有值才需近來做加總
		while (!queue.isEmpty()) {
 
			// 取得queue第一個值(id)轉int，並刪除
			int now = (int) queue.poll();
			Employee nowEm = new Employee();

			// 跑迴圈加總importance
			for (Employee employee : employees) {
				if (employee.id == now) {
					nowEm = employee;
					importance += nowEm.importance;
				}
			}

			// 如果有下屬，將下屬都加進queue
			if (nowEm.subordinates != null) {
				for (Integer subordinate : nowEm.subordinates) {
					queue.add(subordinate);
				}
			}
		}

		return importance;
	}

}
