
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/beG/conf/routes
// @DATE:Fri Feb 22 15:25:46 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
