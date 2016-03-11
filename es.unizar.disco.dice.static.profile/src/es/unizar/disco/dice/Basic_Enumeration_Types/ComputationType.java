/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Computation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getComputationType()
 * @model
 * @generated
 */
public enum ComputationType implements Enumerator {
	/**
	 * The '<em><b>Distributed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTED(0, "distributed", "distributed"),

	/**
	 * The '<em><b>Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	PARALLEL(1, "parallel", "parallel"),

	/**
	 * The '<em><b>Distributed Parallel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED_PARALLEL_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTED_PARALLEL(2, "distributedParallel", "distributedParallel"),

	/**
	 * The '<em><b>Micro Bench</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MICRO_BENCH_VALUE
	 * @generated
	 * @ordered
	 */
	MICRO_BENCH(3, "microBench", "microBench"),

	/**
	 * The '<em><b>Sorting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SORTING_VALUE
	 * @generated
	 * @ordered
	 */
	SORTING(4, "sorting", "sorting"),

	/**
	 * The '<em><b>Grep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREP_VALUE
	 * @generated
	 * @ordered
	 */
	GREP(5, "grep", "grep"),

	/**
	 * The '<em><b>Word Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORD_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	WORD_COUNT(6, "wordCount", "wordCount"),

	/**
	 * The '<em><b>Collab Filtering</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLAB_FILTERING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLAB_FILTERING(7, "collabFiltering", "collabFiltering"),

	/**
	 * The '<em><b>Naive Bayes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAIVE_BAYES_VALUE
	 * @generated
	 * @ordered
	 */
	NAIVE_BAYES(8, "naiveBayes", "naiveBayes"),

	/**
	 * The '<em><b>Bfs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BFS_VALUE
	 * @generated
	 * @ordered
	 */
	BFS(9, "bfs", "bfs"),

	/**
	 * The '<em><b>Page Rank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_RANK_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_RANK(10, "pageRank", "pageRank"),

	/**
	 * The '<em><b>KMeans</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KMEANS_VALUE
	 * @generated
	 * @ordered
	 */
	KMEANS(11, "kMeans", "kMeans"),

	/**
	 * The '<em><b>Connected Components</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTED_COMPONENTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTED_COMPONENTS(12, "connectedComponents", "connectedComponents"),

	/**
	 * The '<em><b>Rel Query</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REL_QUERY_VALUE
	 * @generated
	 * @ordered
	 */
	REL_QUERY(13, "relQuery", "relQuery");

	/**
	 * The '<em><b>Distributed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distributed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED
	 * @model name="distributed"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTED_VALUE = 0;

	/**
	 * The '<em><b>Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PARALLEL
	 * @model name="parallel"
	 * @generated
	 * @ordered
	 */
	public static final int PARALLEL_VALUE = 1;

	/**
	 * The '<em><b>Distributed Parallel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distributed Parallel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTED_PARALLEL
	 * @model name="distributedParallel"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTED_PARALLEL_VALUE = 2;

	/**
	 * The '<em><b>Micro Bench</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Micro Bench</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MICRO_BENCH
	 * @model name="microBench"
	 * @generated
	 * @ordered
	 */
	public static final int MICRO_BENCH_VALUE = 3;

	/**
	 * The '<em><b>Sorting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sorting</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORTING
	 * @model name="sorting"
	 * @generated
	 * @ordered
	 */
	public static final int SORTING_VALUE = 4;

	/**
	 * The '<em><b>Grep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grep</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREP
	 * @model name="grep"
	 * @generated
	 * @ordered
	 */
	public static final int GREP_VALUE = 5;

	/**
	 * The '<em><b>Word Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Word Count</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORD_COUNT
	 * @model name="wordCount"
	 * @generated
	 * @ordered
	 */
	public static final int WORD_COUNT_VALUE = 6;

	/**
	 * The '<em><b>Collab Filtering</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collab Filtering</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLAB_FILTERING
	 * @model name="collabFiltering"
	 * @generated
	 * @ordered
	 */
	public static final int COLLAB_FILTERING_VALUE = 7;

	/**
	 * The '<em><b>Naive Bayes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Naive Bayes</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAIVE_BAYES
	 * @model name="naiveBayes"
	 * @generated
	 * @ordered
	 */
	public static final int NAIVE_BAYES_VALUE = 8;

	/**
	 * The '<em><b>Bfs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bfs</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BFS
	 * @model name="bfs"
	 * @generated
	 * @ordered
	 */
	public static final int BFS_VALUE = 9;

	/**
	 * The '<em><b>Page Rank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Page Rank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_RANK
	 * @model name="pageRank"
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_RANK_VALUE = 10;

	/**
	 * The '<em><b>KMeans</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KMeans</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KMEANS
	 * @model name="kMeans"
	 * @generated
	 * @ordered
	 */
	public static final int KMEANS_VALUE = 11;

	/**
	 * The '<em><b>Connected Components</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Connected Components</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTED_COMPONENTS
	 * @model name="connectedComponents"
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTED_COMPONENTS_VALUE = 12;

	/**
	 * The '<em><b>Rel Query</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Rel Query</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REL_QUERY
	 * @model name="relQuery"
	 * @generated
	 * @ordered
	 */
	public static final int REL_QUERY_VALUE = 13;

	/**
	 * An array of all the '<em><b>Computation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ComputationType[] VALUES_ARRAY =
		new ComputationType[] {
			DISTRIBUTED,
			PARALLEL,
			DISTRIBUTED_PARALLEL,
			MICRO_BENCH,
			SORTING,
			GREP,
			WORD_COUNT,
			COLLAB_FILTERING,
			NAIVE_BAYES,
			BFS,
			PAGE_RANK,
			KMEANS,
			CONNECTED_COMPONENTS,
			REL_QUERY,
		};

	/**
	 * A public read-only list of all the '<em><b>Computation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ComputationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Computation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComputationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComputationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Computation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComputationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ComputationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Computation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ComputationType get(int value) {
		switch (value) {
			case DISTRIBUTED_VALUE: return DISTRIBUTED;
			case PARALLEL_VALUE: return PARALLEL;
			case DISTRIBUTED_PARALLEL_VALUE: return DISTRIBUTED_PARALLEL;
			case MICRO_BENCH_VALUE: return MICRO_BENCH;
			case SORTING_VALUE: return SORTING;
			case GREP_VALUE: return GREP;
			case WORD_COUNT_VALUE: return WORD_COUNT;
			case COLLAB_FILTERING_VALUE: return COLLAB_FILTERING;
			case NAIVE_BAYES_VALUE: return NAIVE_BAYES;
			case BFS_VALUE: return BFS;
			case PAGE_RANK_VALUE: return PAGE_RANK;
			case KMEANS_VALUE: return KMEANS;
			case CONNECTED_COMPONENTS_VALUE: return CONNECTED_COMPONENTS;
			case REL_QUERY_VALUE: return REL_QUERY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ComputationType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ComputationType
