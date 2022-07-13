package ru.job4j.map;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class AnalyzeByMapTest {
    @Test
    public void whenSinglePupil() {
        double average = AnalyzeByMap.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subj("Math", 100)))
                )
        );
        assertThat(average).isEqualTo(100D);
    }

    @Test
    public void whenPupilAverage() {
        double average = AnalyzeByMap.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subj("Math", 100))),
                        new Pupil("Petrov", List.of(new Subj("Math", 60)))
                )
        );
        assertThat(average).isEqualTo(80D);
    }

    @Test
    public void whenListOfPupilAverage() {
        List<Label> average = AnalyzeByMap.averageScoreBySubject(
                List.of(
                        new Pupil("Ivanov", List.of(new Subj("Math", 100),
                                new Subj("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subj("Math", 60),
                                new Subj("Lang", 60)))
                )
        );
        assertThat(average).hasSameElementsAs(List.of(
                new Label("Ivanov", 100D),
                new Label("Petrov", 60D)
        ));
    }

    @Test
    public void whenListOfSubjectAverage() {
        List<Label> average = AnalyzeByMap.averageScoreByPupil(
                List.of(
                        new Pupil("Ivanov",
                                List.of(
                                        new Subj("Math", 100),
                                        new Subj("Lang", 100),
                                        new Subj("Philosophy", 100)
                                )
                        ),
                        new Pupil("Petrov",
                                List.of(
                                        new Subj("Math", 60),
                                        new Subj("Lang", 60),
                                        new Subj("Philosophy", 60)
                                )
                        )
                )
        );
        assertThat(average).hasSameElementsAs(List.of(
                new Label("Math", 80D),
                new Label("Lang", 80D),
                new Label("Philosophy", 80D)
        ));
    }

    @Test
    public void whenBestPupil() {
        Label best = AnalyzeByMap.bestStudent(
                List.of(
                        new Pupil("Ivanov", List.of(new Subj("Math", 100),
                                new Subj("Lang", 100))),
                        new Pupil("Petrov", List.of(new Subj("Math", 60),
                                new Subj("Lang", 60)))
                )
        );
        assertThat(best).isEqualTo(new Label("Ivanov", 200D));
    }

    @Test
    public void whenBestSubject() {
        Label best = AnalyzeByMap.bestSubject(
                List.of(
                        new Pupil("Ivanov", List.of(new Subj("Math", 100),
                                new Subj("Lang", 40))),
                        new Pupil("Petrov", List.of(new Subj("Math", 60),
                                new Subj("Lang", 60)))
                )
        );
        assertThat(best).isEqualTo(new Label("Math", 160D));
    }
}