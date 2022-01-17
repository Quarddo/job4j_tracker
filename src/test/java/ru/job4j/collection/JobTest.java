package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertThrows;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorAscByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescByName() {
        List<Job> rls = Arrays.asList(
                new Job("Sing", 0),
                new Job("Talk", 1),
                new Job("Listen", 2)
        );
        rls.sort(new JobDescByName());
        List<Job> expected = Arrays.asList(
                new Job("Talk", 1),
                new Job("Sing", 0),
                new Job("Listen", 2)
        );
        assertThat(rls, is(expected));
    }

    @Test
    public void whenJobDescByPriority() {
        List<Job> rls = Arrays.asList(
                new Job("Sing", 0),
                new Job("Talk", 1),
                new Job("Listen", 2)
        );
        rls.sort(new JobDescByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Listen", 2),
                new Job("Talk", 1),
                new Job("Sing", 0)
        );
        assertThat(rls, is(expected));
    }

    @Test
    public void whenJobAscByName() {
        List<Job> rls = Arrays.asList(
                new Job("Sing", 0),
                new Job("Talk", 1),
                new Job("Listen", 2)
        );
        rls.sort(new JobAscByName());
        List<Job> expected = Arrays.asList(
                new Job("Listen", 2),
                new Job("Sing", 0),
                new Job("Talk", 1)
        );
        assertThat(rls, is(expected));
    }

    @Test
    public void whenJobAscByPriority() {
        List<Job> rls = Arrays.asList(
                new Job("Sing", 0),
                new Job("Talk", 1),
                new Job("Listen", 2)
        );
        rls.sort(new JobAscByPriority());
        List<Job> expected = Arrays.asList(
                new Job("Sing", 0),
                new Job("Talk", 1),
                new Job("Listen", 2)
        );
        assertThat(rls, is(expected));
    }
}
