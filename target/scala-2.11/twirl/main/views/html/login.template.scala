
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object login_Scope1 {
import helper._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Login],models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.Login], user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.52*/("""

"""),_display_(/*4.2*/main("login",user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""

    """),format.raw/*6.5*/("""<div class="container">
        <div class="row">
            <div class = "col-lg-6 col-md-6 col-sm-8 col-xs-12 col-centered" id = "loginbounds">
                <h2 class = "text-center text-muted">Login into <span class = "logo">Sneaker Sanctuary</span></h2>

                """),_display_(/*11.18*/if(loginForm.hasGlobalErrors)/*11.47*/{_display_(Seq[Any](format.raw/*11.48*/("""
                    """),format.raw/*12.21*/("""<p class = "alert alert-warning">
                        """),_display_(/*13.26*/loginForm/*13.35*/.globalError.message),format.raw/*13.55*/("""
                    """),format.raw/*14.21*/("""</p>
                """)))}),format.raw/*15.18*/("""

                """),_display_(/*17.18*/if(flash.containsKey("error"))/*17.48*/{_display_(Seq[Any](format.raw/*17.49*/("""
                    """),format.raw/*18.21*/("""<p class = "alert alert-warning">
                    """),_display_(/*19.22*/flash/*19.27*/.get("loginRequired")),format.raw/*19.48*/("""
                    """),format.raw/*20.21*/("""</p>
                """)))}),format.raw/*21.18*/("""

                """),_display_(/*23.18*/helper/*23.24*/.form(action = controllers.routes.LoginController.loginSubmit())/*23.88*/ {_display_(Seq[Any](format.raw/*23.90*/("""
                    """),_display_(/*24.22*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control", 'placeholder -> "Email")),format.raw/*24.117*/("""
                    """),_display_(/*25.22*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control", 'placeholder -> "Password")),format.raw/*25.127*/("""
                    """),format.raw/*26.21*/("""<div class="form-actions">
                        <br>
                        <p class="text-center">
                            <input type="submit" value = "Login" class="btn btn-md btn-dark" placeholder="Login">
                        </p>
                    </div>
                </div>
        </div>
    </div>
""")))}),format.raw/*35.2*/(""" """),format.raw/*35.18*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.Login],user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.Login],models.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Thu Feb 28 13:16:09 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/login.scala.html
                  HASH: f8fcdcdb1b8a15d84e5ecc140ae40862c9f1bb42
                  MATRIX: 813->18|958->68|986->71|1012->89|1051->91|1083->97|1390->377|1428->406|1467->407|1516->428|1602->487|1620->496|1661->516|1710->537|1763->559|1809->578|1848->608|1887->609|1936->630|2018->685|2032->690|2074->711|2123->732|2176->754|2222->773|2237->779|2310->843|2350->845|2399->867|2516->962|2565->984|2692->1089|2741->1110|3095->1434|3124->1450
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|44->11|44->11|44->11|45->12|46->13|46->13|46->13|47->14|48->15|50->17|50->17|50->17|51->18|52->19|52->19|52->19|53->20|54->21|56->23|56->23|56->23|56->23|57->24|57->24|58->25|58->25|59->26|68->35|68->35
                  -- GENERATED --
              */
          