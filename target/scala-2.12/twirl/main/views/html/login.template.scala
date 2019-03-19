
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import helper._

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Login],models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.Login], user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
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


              /*
                  -- GENERATED --
                  DATE: Tue Mar 19 15:23:27 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/login.scala.html
                  HASH: 4c53b0e3cf4b050934750420ed00090b18be9591
                  MATRIX: 651->1|995->18|1139->69|1166->71|1192->89|1231->91|1263->97|1570->377|1608->406|1647->407|1696->428|1782->487|1800->496|1841->516|1890->537|1943->559|1989->578|2028->608|2067->609|2116->630|2198->685|2212->690|2254->711|2303->732|2356->754|2402->773|2417->779|2490->843|2530->845|2579->867|2696->962|2745->984|2872->1089|2921->1110|3275->1434|3304->1450
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|37->6|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|54->23|54->23|54->23|54->23|55->24|55->24|56->25|56->25|57->26|66->35|66->35
                  -- GENERATED --
              */
          