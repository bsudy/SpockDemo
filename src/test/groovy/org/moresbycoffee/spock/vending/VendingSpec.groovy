/*
 * Moresby Coffee Bean
 *
 * Copyright (c) 2013, Barnabas Sudy (barnabas.sudy@gmail.com)
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those
 * of the authors and should not be interpreted as representing official policies,
 * either expressed or implied, of the FreeBSD Project.
 */
package org.moresbycoffee.spock.vending

import spock.lang.Specification

class VendingSpec extends Specification {

    def "Vending machine should accept the money are put in"() {
        given:
            def vendingMachine = new VendingMachine()
        when:
            def currentMoney = vendingMachine.putMoney(2)
        then:
            currentMoney == 3
//            currentMoney == 2
    }

//**** v2 ****//

//    def "vending machinge should not accept negative money"() {
//        given: "a vending machine"
//            def vendingMachine = new VendingMachine()
//        when: "a negative coint is put into it"
//            vendingMachine.putMoney(-2)
//        then: "it should throw an exception"
//            thrown(IllegalArgumentException)
//    }

//**** v3 ****//

//    def "vending machine should print ticket when the a product is selected and enough money in the machine"() {
//        given: "a vending machine"
//            def vendingMachine = new VendingMachine();
//        and: "£10 in it"
//            vendingMachine.putMoney(10)
//        when: "a Ten Ride product is selected"
//            def ticket = vendingMachine.selectProduct("Ten Ride", 10)
//        then: "it should return a Ten Ride ticket"
//            ticket == new Ticket("Ten Ride", 11)
////            ticket == new Ticket("Ten Ride", 10)
//    }

//**** v4 ****//
/*
 * Sometimes we want to run the same test against different data.
 * JUnit solution: Parameterized test, Theories...
 */

//    def "Vending machine should show £7 when £2 and £5 coins are put into it"() {
//        given:
//            def vendingMachine = new VendingMachine()
//        when:
//            def currentMoney
//            [2, 5].each {
//                currentMoney = vendingMachine.putMoney(it)
//            }
//
//        then:
//            currentMoney == 7
//    }


    //Using where
//    def "Vending machine should show £7 when £2 and £5 coins are put into it /where/"() {
//        given:
//            def vendingMachine = new VendingMachine()
//        when:
//            def currentMoney
//            [2, 5].each {
//                currentMoney = vendingMachine.putMoney(it)
//            }
//
//        then:
//            currentMoney == result
//        where:
//            coins = [2, 5]
//            result = 7
//    }

    //Data driven test
//    def "Vending machine should count the coins are put into it"() {
//        given:
//            def vendingMachine = new VendingMachine()
//        when:
//            def currentMoney
//            coins.each {
//                currentMoney = vendingMachine.putMoney(it)
//            }
//
//        then:
//            currentMoney == result
//        where:
//            coins << [[2, 5], [12, 7, 3]]
//            result << [7, 23]
//            //Unroll
////            result << [7, 22]
//    }

//    @Unroll
//    def "Vending machine should show £#result when #coins coins are put into it"() {
//        given:
//            def vendingMachine = new VendingMachine()
//        when:
//            def currentMoney
//            coins.each {
//                currentMoney = vendingMachine.putMoney(it)
//            }
//
//        then:
//            currentMoney == result
//        where:
//            coins << [[2, 5], [12, 7, 3]]
//            result << [7, 23]
//    }

    //Datatable
//    @Unroll
//    def "Vending machine should show £#result when #coins coins are put into it /datatable/"() {
//        given:
//            def vendingMachine = new VendingMachine()
//        when:
//            def currentMoney
//            coins.each {
//                currentMoney = vendingMachine.putMoney(it)
//            }
//
//        then:
//            currentMoney == result
//        where:
//            coins      | result
//            [2, 5]     | 7
//            [12, 7, 3] | 22
//    }




//**** v5 ****//

    //Mocking
//    def "vending machine should return the difference"() {
//        given:
//            def cashMachine = Mock(ICashMachine)
//            def vendingMachine = new VendingMachine(cashMachine)
//        and:
//            vendingMachine.putMoney(15)
//        when:
//            def ticket = vendingMachine.selectProduct("One Way", 10)
//        then:
//            1 * cashMachine.returnMoney(5)
//    }

}
