package grokking_the_coding_interview.merge_intervals;

import common.Interval;
import junit.framework.TestCase;

public class ConflictingAppointmentsTest extends TestCase {
    public void testCantAttendAllAppointments() {
        assertFalse(new ConflictingAppointments().canAttendAllAppointments(
                new Interval[]{new Interval(1, 4), new Interval(2, 5), new Interval(7, 9)})
        );
    }

    public void testCanAttendAllAppointments() {
        assertTrue(new ConflictingAppointments().canAttendAllAppointments(
                new Interval[]{new Interval(6, 7), new Interval(2, 4), new Interval(8, 12)})
        );
    }
}
