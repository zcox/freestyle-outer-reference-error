import freestyle.free._
import freestyle.tagless._

class AProvider[A] {

  @free trait B1 {
    def b1: FS[Unit]
  }

  @tagless(true) trait B2 {
    def b2: FS[Unit]
  }

}
