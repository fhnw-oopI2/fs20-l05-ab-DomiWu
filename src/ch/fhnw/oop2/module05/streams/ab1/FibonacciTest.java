package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Stream;

public class FibonacciTest {

	public static void main(String[] args) {
		// Kann zur Anzeige der Tupel benutzt werden
		// Stream.iterate(new Tuple<Integer>(0, 1),  n -> new Tuple<Integer>(n.t2, n.t1 + n.t2)).limit(30).forEach(n -> System.out.println(n.toString()));;
		Stream.iterate(new Tuple<Integer>(0, 1),  n -> new Tuple<Integer>(n.t2, n.t1 + n.t2)).limit(30).forEach(n -> System.out.println(n.t1));;
	}

}
