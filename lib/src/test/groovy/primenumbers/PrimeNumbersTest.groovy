/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package primenumbers

import spock.lang.Specification

class PrimeNumbersTest extends Specification {
    def "Calculate prime numbers between 1 and 10"() {
        setup:
        def primeNumberCalculator = new primenumbers()

        when:
        def result = primeNumberCalculator.calculatePrimes(0, 10)

        then:
        result == null
    }
}
