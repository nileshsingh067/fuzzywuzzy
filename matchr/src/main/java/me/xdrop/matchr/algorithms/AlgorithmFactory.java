package me.xdrop.matchr.algorithms;


/**
 * Interface for a factory for Matchr implementations.
 *
 * @param <A> Type-variable for the algorithm to create.
 */
public interface AlgorithmFactory<A extends Algorithm> {
    /**
     * Creates a new Matchr implementation for this algorithm.
     *
     * @return A new implementation instance.
     */
    A craft();
}
