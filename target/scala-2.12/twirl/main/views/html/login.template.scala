
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Login],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.users.Login], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
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

""")))}),format.raw/*36.2*/(""" """),format.raw/*36.18*/("""
"""),format.raw/*37.1*/("""<script>

    function confirmDel()"""),format.raw/*39.26*/("""{"""),format.raw/*39.27*/("""
        """),format.raw/*40.9*/("""return confirm('Are you sure?');
    """),format.raw/*41.5*/("""}"""),format.raw/*41.6*/("""

        """),format.raw/*43.9*/("""$(document).ready(function () """),format.raw/*43.39*/("""{"""),format.raw/*43.40*/("""

            """),format.raw/*45.13*/("""var docHeight = $(window).height();
            var footerHeight = $('#footer').height();
            var footerTop = $('#footer').position().top + footerHeight;

            if (footerTop < docHeight) """),format.raw/*49.40*/("""{"""),format.raw/*49.41*/("""
                """),format.raw/*50.17*/("""$('#footer').css('margin-top', 650 + (docHeight - footerTop) + 'px');
            """),format.raw/*51.13*/("""}"""),format.raw/*51.14*/("""
        """),format.raw/*52.9*/("""}"""),format.raw/*52.10*/(""");
</script>
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.users.Login],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.users.Login],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 24 15:20:27 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/login.scala.html
                  HASH: f0b3773f89cb6b95c52281bdb1d4543d495469b0
                  MATRIX: 651->1|1007->18|1163->81|1190->83|1216->101|1255->103|1287->109|1594->389|1632->418|1671->419|1720->440|1806->499|1824->508|1865->528|1914->549|1967->571|2013->590|2052->620|2091->621|2140->642|2222->697|2236->702|2278->723|2327->744|2380->766|2426->785|2441->791|2514->855|2554->857|2603->879|2720->974|2769->996|2896->1101|2945->1122|3300->1447|3329->1463|3357->1464|3420->1499|3449->1500|3485->1509|3549->1546|3577->1547|3614->1557|3672->1587|3701->1588|3743->1602|3973->1804|4002->1805|4047->1822|4157->1904|4186->1905|4222->1914|4251->1915
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|37->6|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|54->23|54->23|54->23|54->23|55->24|55->24|56->25|56->25|57->26|67->36|67->36|68->37|70->39|70->39|71->40|72->41|72->41|74->43|74->43|74->43|76->45|80->49|80->49|81->50|82->51|82->51|83->52|83->52
                  -- GENERATED --
              */
          