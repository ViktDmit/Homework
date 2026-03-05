package org.example;

final class Aspirant extends Student {
    String scientificWork;

    @Override
    int getScholarship() {
        if (averageMark == 5.0) {
            return 2500;
        } else {
            return 2200;
        }
    }
}
