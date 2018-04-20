```
[error] <macro>:5:22: The outer reference in this type test cannot be checked at run time.
[error]     final case class B1Op() extends _root_.scala.AnyRef with Op[Unit] { override val FSAlgebraIndex2: _root_.scala.Int = 0 }
[error]                      ^
[error] <macro>:17:24: The outer reference in this type test cannot be checked at run time.
[error]       final case class B2Op() extends _root_.scala.AnyRef with Op[Unit] { override val FSAlgebraIndex22: _root_.scala.Int = 0 }
[error]                        ^
[error] two errors found
[error] (Compile / compileIncremental) Compilation failed
[error] Total time: 3 s, completed Apr 20, 2018 11:44:13 AM
```
