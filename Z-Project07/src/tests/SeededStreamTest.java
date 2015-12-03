package tests;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import classes.SeededStream;
import interfaces.Stream;

public class SeededStreamTest {

	@Test
	public void test_get1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals((Integer) 1, stream.get(0));
		Assert.assertEquals((Integer) 2, stream.get(1));
		Assert.assertEquals((Integer) 3, stream.get(2));
		Assert.assertEquals((Integer) 4, stream.get(3));
		Assert.assertEquals((Integer) 5, stream.get(4));
		Assert.assertEquals((Integer) 6, stream.get(5));
		Assert.assertEquals((Integer) 7, stream.get(6));
		Assert.assertEquals((Integer) 8, stream.get(7));
		Assert.assertEquals((Integer) 9, stream.get(8));
		Assert.assertEquals((Integer) 10, stream.get(9));
		try {
			stream.get(-1);
			Assert.fail();
		} catch (Exception e) {
		}
		try {
			stream.get(10);
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_get2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1);
		Assert.assertEquals((Integer) 1, stream.get(0));
		Assert.assertEquals((Integer) 2, stream.get(1));
		Assert.assertEquals((Integer) 3, stream.get(2));
		Assert.assertEquals((Integer) 4, stream.get(3));
		Assert.assertEquals((Integer) 5, stream.get(4));
		Assert.assertEquals((Integer) 6, stream.get(5));
		Assert.assertEquals((Integer) 7, stream.get(6));
		Assert.assertEquals((Integer) 8, stream.get(7));
		Assert.assertEquals((Integer) 9, stream.get(8));
		Assert.assertEquals((Integer) 10, stream.get(9));
		try {
			stream.get(-1);
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_forEach() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		final int[] z = new int[] { 0 }; // z must be final
		stream.forEach(x -> z[0] = z[0] + x);
		Assert.assertEquals(55, z[0]);
	}

	@Test
	public void test_toList() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		List<Integer> list = stream.toList();
		Assert.assertEquals(10, list.size());
		Assert.assertEquals((Integer) 1, list.get(0));
		Assert.assertEquals((Integer) 2, list.get(1));
		Assert.assertEquals((Integer) 3, list.get(2));
		Assert.assertEquals((Integer) 4, list.get(3));
		Assert.assertEquals((Integer) 5, list.get(4));
		Assert.assertEquals((Integer) 6, list.get(5));
		Assert.assertEquals((Integer) 7, list.get(6));
		Assert.assertEquals((Integer) 8, list.get(7));
		Assert.assertEquals((Integer) 9, list.get(8));
		Assert.assertEquals((Integer) 10, list.get(9));
	}

	@Test
	public void test_count() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals(10, stream.count(x -> true));
		Assert.assertEquals(0, stream.count(x -> false));
		Assert.assertEquals(1, stream.count(x -> x == 1));
		Assert.assertEquals(9, stream.count(x -> x > 1));
	}

	@Test
	public void test_matchAll() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals(true, stream.matchAll(x -> true));
		Assert.assertEquals(false, stream.matchAll(x -> false));
		Assert.assertEquals(false, stream.matchAll(x -> x == 1));
		Assert.assertEquals(false, stream.matchAll(x -> x > 1));
		Assert.assertEquals(true, stream.matchAll(x -> x >= 1));
	}

	@Test
	public void test_matchAny1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals(true, stream.matchAny(x -> true));
		Assert.assertEquals(false, stream.matchAny(x -> false));
		Assert.assertEquals(true, stream.matchAny(x -> x == 1));
		Assert.assertEquals(true, stream.matchAny(x -> x > 1));
		Assert.assertEquals(false, stream.matchAny(x -> x < 1));
	}

	@Test
	public void test_matchAny2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1);
		Assert.assertEquals(true, stream.matchAny(x -> true));
		Assert.assertEquals(true, stream.matchAny(x -> x == 1));
		Assert.assertEquals(true, stream.matchAny(x -> x > 1));
	}

	@Test
	public void test_find1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals((Integer) 1, stream.find(x -> true));
		Assert.assertEquals((Integer) null, stream.find(x -> false));
		Assert.assertEquals((Integer) 1, stream.find(x -> x == 1));
		Assert.assertEquals((Integer) 2, stream.find(x -> x > 1));
		Assert.assertEquals((Integer) null, stream.find(x -> x < 1));
	}

	@Test
	public void test_find2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1);
		Assert.assertEquals((Integer) 1, stream.find(x -> true));
		Assert.assertEquals((Integer) 1, stream.find(x -> x == 1));
		Assert.assertEquals((Integer) 2, stream.find(x -> x > 1));
	}

	@Test
	public void test_reduce() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals((Integer) 55, stream.reduce((x, y) -> x + y));
		Assert.assertEquals((Integer) 10, stream.reduce((x, y) -> Math.max(x, y)));
		Assert.assertEquals((Integer) 1, stream.reduce((x, y) -> Math.min(x, y)));
		Assert.assertEquals((Integer) 1, stream.limit(1).reduce((x, y) -> x + y));
		Assert.assertEquals((Integer) null, stream.limit(0).reduce((x, y) -> x + y));
	}

	@Test
	public void test_limit1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals(10, stream.limit(12).countAll());
		Assert.assertEquals(10, stream.limit(10).countAll());
		Assert.assertEquals(9, stream.limit(9).countAll());
		Assert.assertEquals(1, stream.limit(1).countAll());
		Assert.assertEquals(0, stream.limit(0).countAll());
		try {
			stream.limit(-1).countAll();
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_limit2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1);
		Assert.assertEquals(12, stream.limit(12).countAll());
		Assert.assertEquals(10, stream.limit(10).countAll());
		Assert.assertEquals(9, stream.limit(9).countAll());
		Assert.assertEquals(1, stream.limit(1).countAll());
		Assert.assertEquals(0, stream.limit(0).countAll());
		try {
			stream.limit(-1).countAll();
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_skip1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals(10, stream.skip(0).countAll());
		Assert.assertEquals(9, stream.skip(1).countAll());
		Assert.assertEquals((Integer) 2, stream.skip(1).get(0));
		Assert.assertEquals(1, stream.skip(9).countAll());
		Assert.assertEquals((Integer) 10, stream.skip(9).get(0));
		Assert.assertEquals(0, stream.skip(10).countAll());
		Assert.assertEquals(0, stream.skip(11).countAll());
		try {
			stream.skip(-1).countAll();
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_skip2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1);
		Assert.assertEquals((Integer) 2, stream.skip(1).get(0));
		Assert.assertEquals((Integer) 10, stream.skip(9).get(0));
		try {
			stream.skip(-1).countAll();
			Assert.fail();
		} catch (Exception e) {
		}
	}

	@Test
	public void test_filter1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10);
		Assert.assertEquals(10, stream.filter(x -> true).countAll());
		Assert.assertEquals(0, stream.filter(x -> false).countAll());
		Assert.assertEquals(1, stream.filter(x -> x == 1).countAll());
		Assert.assertEquals((Integer) 1, stream.filter(x -> x == 1).get(0));
		Assert.assertEquals(9, stream.filter(x -> x > 1).countAll());
		Assert.assertEquals((Integer) 2, stream.filter(x -> x > 1).get(0));
		Assert.assertEquals(5, stream.filter(x -> x % 2 == 0).countAll());
		Assert.assertEquals((Integer) 2, stream.filter(x -> x % 2 == 0).get(0));
	}

	@Test
	public void test_filter2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1);
		Assert.assertEquals((Integer) 2, stream.filter(x -> x > 1).get(0));
		Assert.assertEquals((Integer) 2, stream.filter(x -> x % 2 == 0).get(0));
	}

	@Test
	public void test_map1() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1, x -> x <= 10).map(x -> x - 1);
		Assert.assertEquals((Integer) 0, stream.get(0));
		Assert.assertEquals((Integer) 1, stream.get(1));
		Assert.assertEquals((Integer) 2, stream.get(2));
		Assert.assertEquals((Integer) 3, stream.get(3));
		Assert.assertEquals((Integer) 4, stream.get(4));
		Assert.assertEquals((Integer) 5, stream.get(5));
		Assert.assertEquals((Integer) 6, stream.get(6));
		Assert.assertEquals((Integer) 7, stream.get(7));
		Assert.assertEquals((Integer) 8, stream.get(8));
		Assert.assertEquals((Integer) 9, stream.get(9));
	}

	@Test
	public void test_map2() {
		Stream<Integer> stream = new SeededStream<>(1, x -> x + 1).map(x -> x - 1);
		Assert.assertEquals((Integer) 0, stream.get(0));
		Assert.assertEquals((Integer) 1, stream.get(1));
		Assert.assertEquals((Integer) 2, stream.get(2));
		Assert.assertEquals((Integer) 3, stream.get(3));
		Assert.assertEquals((Integer) 4, stream.get(4));
		Assert.assertEquals((Integer) 5, stream.get(5));
		Assert.assertEquals((Integer) 6, stream.get(6));
		Assert.assertEquals((Integer) 7, stream.get(7));
		Assert.assertEquals((Integer) 8, stream.get(8));
		Assert.assertEquals((Integer) 9, stream.get(9));
	}
}
