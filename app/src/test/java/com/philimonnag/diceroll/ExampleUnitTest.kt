package com.philimonnag.diceroll

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
  fun generates_number(){
      val dice= MainActivity.Dice(6)
        val rollResult=dice.roll()

        assertTrue("the value of the rollresult was not between 1 and 6",rollResult in 1..6)
  }


}