package com.techelevator;

public class HomeworkAssignment {

    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;
    private String letterGrade;

    public HomeworkAssignment(int possibleMark, String submitterName) {
        this.possibleMarks = possibleMark;
        this.submitterName = submitterName;
    }

    public int getEarnedMarks() {
        return earnedMarks;
    }

    public void setEarnedMarks(int earnedMark) {
        this.earnedMarks = earnedMark;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }


    public String getSubmitterName() {
        return submitterName;
    }

    public String getLetterGrade() {

        double score = getEarnedMarks() * 100 / getPossibleMarks();

        if (score >= 90) {
            letterGrade = "A";
        } else if (score >= 80) {
            letterGrade = "B";
        } else if (score >= 70) {
            letterGrade = "C";
        } else if (score >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        return letterGrade;
    }
}