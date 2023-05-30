package br.com.escola.recommendation;

import br.com.escola.student.Student;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Recommendation {
    private Student indicatingStudent;
    private Student nominatedStudent;

    private LocalDateTime date;


    public Recommendation(Student indicatingStudent, Student nominatedStudent, LocalDate date){
        this.indicatingStudent = indicatingStudent;
        this.nominatedStudent = nominatedStudent;
        this.date = LocalDateTime.now();
    }

    public Student getIndicatingStudent() {
        return indicatingStudent;
    }

    public Student getNominatedStudent() {
        return nominatedStudent;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
