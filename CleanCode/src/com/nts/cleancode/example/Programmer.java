package com.nts.cleancode.example;

import java.util.EnumSet;

public class Programmer extends Employee {
	protected EnumSet<Job> responsibilities() {
		return EnumSet.of(Job.TEST, Job.PROGRAM, Job.INTEGRATE, Job.DESIGN);
	}
}
