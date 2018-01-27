package day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OverlappingInterval {

	public static class Interval {
		int start;
		int end;

		public Interval(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static class EndPoint implements Comparable<EndPoint> {
		int time;
		boolean isStart;

		public EndPoint(int t, boolean isStart) {
			this.time = t;
			this.isStart = isStart;
		}

		public int compareTo(EndPoint that) {
			if (this.time != that.time)
				return Integer.compare(this.time, that.time);

			return (this.isStart && !that.isStart) ? -1 : (!this.isStart && that.isStart) ? 1 : 0;
		}
	}

	public static int maxSimultaneousInterval(List<Interval> intervals) {
		List<EndPoint> endPoints = new ArrayList<>();
		for (Interval e : intervals) {
			endPoints.add(new EndPoint(e.start, true));
			endPoints.add(new EndPoint(e.end, false));
		}

		Collections.sort(endPoints);

		int maxSimultaneousInterval = 0;
		int simultaneousInterval = 0;
		for (EndPoint e : endPoints) {
			if (e.isStart) {
				simultaneousInterval++;
				maxSimultaneousInterval = Math.max(maxSimultaneousInterval, simultaneousInterval);
			} else {
				simultaneousInterval--;
			}
		}
		return maxSimultaneousInterval;
	}

	public static void main(String[] args) {
		List<Interval> intervals = new ArrayList<>();
		intervals.add(new Interval(1, 5));
		intervals.add(new Interval(2, 7));
		intervals.add(new Interval(4, 5));
		intervals.add(new Interval(6, 10));
		intervals.add(new Interval(8, 9));
		intervals.add(new Interval(9, 17));
		intervals.add(new Interval(11, 13));
		intervals.add(new Interval(12, 13));
		intervals.add(new Interval(12, 15));
		intervals.add(new Interval(14, 15));
		System.out.println("The max intervals simultaneous " + maxSimultaneousInterval(intervals));
		
	}

}
