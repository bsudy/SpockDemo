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
package org.moresbycoffee.spock.vending;


public class VendingMachine {

//**** v0 ****//

    public Integer putMoney(final Integer money) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

    public Ticket selectProduct(final String name, final Integer money) {
        throw new UnsupportedOperationException("The method is not implemented yet.");
    }

//**** v1 ****//

//    public Integer putMoney(final Integer money) {
//        return money;
//    }
//
//    public Ticket selectProduct(final String name, final Integer money) {
//        throw new UnsupportedOperationException("The method is not implemented yet.");
//    }

//**** v2 ****//

//    public Integer putMoney(final Integer money) {
//        if (money.intValue() < 0) {
//            throw new IllegalArgumentException();
//        }
//        return money;
//    }
//
//    public Ticket selectProduct(final String name, final Integer money) {
//        throw new UnsupportedOperationException("The method is not implemented yet.");
//    }

//**** v3 ****//

//    public Integer putMoney(final Integer money) {
//        if (money.intValue() < 0) {
//            throw new IllegalArgumentException();
//        }
//        return money;
//    }
//
//    public Ticket selectProduct(final String name, final Integer money) {
//        return new Ticket(name, money);
//    }

//**** v4 ****//

//    private int currentMoney = 0;
//
//    public int putMoney(final int money) {
//        if (money < 0) {
//            throw new IllegalArgumentException();
//        }
//        currentMoney += money;
//        return currentMoney;
//    }
//
//    public Ticket selectProduct(final String name, final int money) {
//        return new Ticket(name, money);
//    }

//**** v5 ****//

//    private final ICashMachine cashMachine;
//
//    public VendingMachine(final ICashMachine cashMachine) {
//        this.cashMachine = cashMachine;
//    }
//
//    public VendingMachine() { this(new CashMachine()); }
//
//    private int currentMoney = 0;
//
//    public int putMoney(final int money) {
//        if (money < 0) {
//            throw new IllegalArgumentException();
//        }
//        currentMoney += money;
//        return currentMoney;
//    }
//
//    public Ticket selectProduct(final String name, final int money) {
//        return new Ticket(name, money);
//    }
//
////    public Ticket selectProduct(final String name, final int money) {
////        cashMachine.returnMoney(currentMoney - money);
////        return new Ticket(name, money);
////    }

}
