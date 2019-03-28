package com.test.question690;

import java.util.List;

public class Employee {

	// 唯一ID
	public int id;

	// 員工重要性價值
	public int importance;

	// 直接下屬的ID
	public List<Integer> subordinates;

	public Employee() {

	}

	public Employee(int id, int importance) {
		this.id = id;
		this.importance = importance;
	}

	public Employee(int id, int importance, List<Integer> subordinates) {
		this.id = id;
		this.importance = importance;
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "\n" + "[id=" + id + ", importance=" + importance + ", subordinates=" + subordinates + "]";
	}

}
