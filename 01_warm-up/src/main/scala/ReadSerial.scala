// Chisel Introduction
// Chair of Electronic Design Automation, TU Kaiserslautern
// File created on 20/10/2022 by M.Sc. Tobias Jauch (@tojauch)

package readserial

import chisel3._
import chisel3.util._


/** controller class */
class Controller extends Module{
  
  val io = IO(new Bundle {
    /* 
     * ToDo: Define IO ports of a the component as stated in the documentation
     */
    })

  // internal variables
  /* 
   * ToDo: Define internal variables (registers and/or wires), if needed
   */

  // state machine
  /* 
   * ToDo: Describe functionality if the controller as a state machine
   */

}


/** counter class */
class Counter extends Module{
  
  val io = IO(new Bundle {
    /* 
     * ToDo: Define IO ports of a the component as stated in the documentation
     */
    })

  // internal variables
  /* 
   * ToDo: Define internal variables (registers and/or wires), if needed
   */

  // state machine
  /* 
   * ToDo: Describe functionality if the counter as a state machine
   */


}

/** shift register class */
class ShiftRegister extends Module{
  
  val io = IO(new Bundle {
    /* 
     * ToDo: Define IO ports of a the component as stated in the documentation
     */
    })

  // internal variables
  /* 
   * ToDo: Define internal variables (registers and/or wires), if needed
   */

  // functionality
  /* 
   * ToDo: Describe functionality if the shift register
   */
}

/** 
  * The design readserial is a serial receiver. It scans an input line (“serial bus”) named rxd for serial
  * transmissions of data bytes. A transmission begins with a start bit ‘0’ followed by 8 data bits. The
  * most significant bit (MSB) is transmitted first. There is no parity bit and no stop bit. After the last
  * data bit has been transferred a new transmission (beginning with a start bit, ‘0’) may immediately
  * follow. If there is no new transmission the bus line goes high (‘1’, this is considered the “idle” bus
  * signal). In this case the receiver waits until the next transmission begins.
  * The outputs of the design are an 8-bit parallel data signal and a valid signal. The valid signal goes
  * high (‘1’) for one clock cycle after the last serial bit has been transmitted, indicating that a new data
  * byte is ready.
  */
class ReadSerial extends Module{
  
  val io = IO(new Bundle {
    /* 
     * ToDo: Define IO ports of a the component as stated in the documentation
     */
    })


  // instanciation of modules
  /* 
   * ToDo: Instanciate the modules that you need
   */

  // connections between modules
  /* 
   * ToDo: connect the signals between the modules
   */

  // global outputs  
  /* 
   * ToDo: Describe output behaviour based on the input values and the internal signals
   */

}