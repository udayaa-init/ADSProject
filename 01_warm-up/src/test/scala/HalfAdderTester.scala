// ADS I Class Project
// Chisel Introduction
//
// Chair of Electronic Design Automation, RPTU in Kaiserslautern
// File created on 18/10/2022 by Tobias Jauch (@tojauch)

package adder

import chisel3._
import chiseltest._
import org.scalatest.flatspec.AnyFlatSpec


/** 
  * Half adder tester
  * Use the truth table from the exercise sheet to test all possible input combinations and the corresponding results exhaustively
  */
class HalfAdderTester extends AnyFlatSpec with ChiselScalatestTester {

  "HalfAdder" should "work" in {
    test(new HalfAdder).withAnnotations(Seq(WriteVcdAnnotation)) { dut =>


          /*dut.io.a.poke(...)
           *dut.io.b.poke(...)
           *dut.io.ci.poke(...)
           *dut.io.s.expect(...)
           *dut.io.co.expect(...)
           *...
           *TODO: Insert your test cases
           */
          for (a <- 0 to 1)
          { // Loop over all possible values for 'a'
          for (b <- 0 to 1)
           { // Loop over all possible values for 'b'
          val expectedSum = a ^ b // XOR operation gives sum
          val expectedCout = a & b // AND operation gives carry

          dut.io.a.poke(a.U)
          dut.io.b.poke(b.U)
          dut.clock.step(1) // Evaluate combinational logic

          // Validate results
          dut.io.s.expect(expectedSum.U)
          dut.io.cout.expect(expectedCout.U)
           }
         }

        }
    } 
}

