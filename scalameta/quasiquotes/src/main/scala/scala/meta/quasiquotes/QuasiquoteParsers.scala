package scala.meta
package quasiquotes

import scala.meta.parsers.common._
import scala.meta.internal.parsers.ScalametaParser._

// NOTE: It would be nice to have quasiquotes delegate to regular parser routines,
// but for some corner cases of the language this doesn't quite work,
// so we have to work around a bit. Maybe in the future we discover a better approach.
trait QuasiquoteParsers extends scala.meta.parsers.Api {
  implicit lazy val parseQuasiquoteCtor: Parse[Ctor] = toParse(_.parseQuasiquoteCtor())
  implicit lazy val parseQuasiquotePat: Parse[Pat.Arg] = toParse(_.parseQuasiquotePat())
  implicit lazy val parseQuasiquotePatType: Parse[Pat.Type] = toParse(_.parseQuasiquotePatType())
}