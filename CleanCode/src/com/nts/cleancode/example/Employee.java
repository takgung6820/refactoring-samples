package com.nts.cleancode.example;

import java.util.Collection;

public abstract class Employee {
    private int jobsDone = 0;
    private int jobsSkipped = 0;

    public int jobsDoneCount() {
        return jobsDone;
    }

    public int jobsSkippedCount() {
        return jobsSkipped;
    }

    public void performJob(Job job) {
        if (responsibilities().contains(job))
            jobsDone++;
        else
            jobsSkipped++;
    }

    protected abstract Collection responsibilities();
}
