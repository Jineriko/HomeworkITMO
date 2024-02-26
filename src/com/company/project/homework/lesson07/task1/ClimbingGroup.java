package com.company.project.homework.lesson07.task1;

public class ClimbingGroup {
    private boolean recruitmentIsClose;
    private Climber[] climbers;
    private Mountain mountain;
    public static int counter;


    public ClimbingGroup(Mountain mountain) {
        this.mountain = mountain;
        climbers = new Climber[3];
        counter = 0;
        recruitmentIsClose = false;
    }

    public Climber[] getClimbers() {
        return climbers;
    }

    public static void addClimbingGroup(Climber climber, ClimbingGroup climbingGroup) {
        if (!climbingGroup.recruitmentIsClose) {
            climbingGroup.climbers[counter] = climber;
            counter++;
        }
        if (!(climbingGroup.climbers[climbingGroup.climbers.length - 1] == null)) {
            climbingGroup.recruitmentIsClose = true;
        }
    }
}
