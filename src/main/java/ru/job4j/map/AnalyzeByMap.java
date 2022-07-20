package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        double sum = 0;
        int counter = 0;
        for (Pupil pupil : pupils) {
            for (Subj subj : pupil.subjects()) {
                sum += subj.score();
                counter++;
            }
        }
        return sum / counter;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subj subj : pupil.subjects()) {
                sum += subj.score();
            }
            list.add(new Label(pupil.name(), sum / pupil.subjects().size()));
        }
        return list;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        Map<String, Double> temp = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subj subj : pupil.subjects()) {
                temp.computeIfPresent(subj.name(), (k, v) -> v + subj.score());
                temp.putIfAbsent(subj.name(), (double) subj.score());
            }
        }
        for (Map.Entry<String, Double> entry : temp.entrySet()) {
            list.add(new Label(entry.getKey(), entry.getValue() / pupils.size()));
        }
        return list;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subj subj : pupil.subjects()) {
                sum += subj.score();
            }
            list.add(new Label(pupil.name(), sum));
        }
        list.sort(Comparator.comparing(Label::score));
        return list.get(list.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Double> temp = new LinkedHashMap<>();
        List<Label> list = new ArrayList<>();
        for (Pupil pupil : pupils) {
            for (Subj subj : pupil.subjects()) {
                temp.computeIfPresent(subj.name(), (k, v) -> v + subj.score());
                temp.putIfAbsent(subj.name(), (double) subj.score());
            }
        }
        for (Map.Entry<String, Double> entry : temp.entrySet()) {
            list.add(new Label(entry.getKey(), entry.getValue()));
        }
        list.sort(Comparator.comparing(Label::score));
        return list.get(list.size() - 1);
    }
}