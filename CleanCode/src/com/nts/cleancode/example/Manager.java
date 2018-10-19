package com.nts.cleancode.example;

import java.util.EnumSet;

public class Manager extends Employee {
	protected EnumSet<Job> responsibilities() {
		return EnumSet.of(Job.MANAGE, Job.MARKET, Job.SELL);
	}
}
