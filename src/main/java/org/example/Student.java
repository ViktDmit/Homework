package org.example;

class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    int getScholarship() {
        if (averageMark == 5.0) {
            return 2000;
        } else {
            return 1900;
        }
    }
}
