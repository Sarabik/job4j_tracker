package ru.job4j.map;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToDouble(Subj::score)
                .average()
                .orElse(0);
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> new Label(pupil.name(),
                        pupil.subjects().stream()
                                .mapToDouble(Subj::score)
                                .average()
                                .orElse(0)))
                .collect(Collectors.toList());
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subj::name, LinkedHashMap::new, Collectors.averagingDouble(Subj::score)))
                .entrySet()
                .stream()
                .map(entry -> new Label(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> new Label(pupil.name(),
                        pupil.subjects().stream()
                                .collect(Collectors.summarizingDouble(Subj::score))
                                .getSum()))
                .max(Comparator.comparing(Label::score))
                .orElse(null);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subj::name, LinkedHashMap::new, Collectors.summingDouble(Subj::score)))
                .entrySet()
                .stream()
                .map(entry -> new Label(entry.getKey(), entry.getValue()))
                .max(Comparator.comparing(Label::score))
                .orElse(null);
    }
}