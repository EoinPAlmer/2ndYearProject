
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
    <script>

        function confirmDel()"""),format.raw/*37.30*/("""{"""),format.raw/*37.31*/("""
            """),format.raw/*38.13*/("""return confirm('Are you sure?');
        """),format.raw/*39.9*/("""}"""),format.raw/*39.10*/("""
    
            """),format.raw/*41.13*/("""$(document).ready(function () """),format.raw/*41.43*/("""{"""),format.raw/*41.44*/("""
    
                """),format.raw/*43.17*/("""var docHeight = $(window).height();
                var footerHeight = $('#footer').height();
                var footerTop = $('#footer').position().top + footerHeight;
    
                if (footerTop < docHeight) """),format.raw/*47.44*/("""{"""),format.raw/*47.45*/("""
                    """),format.raw/*48.21*/("""$('#footer').css('margin-top', 500 + (docHeight - footerTop) + 'px');
                """),format.raw/*49.17*/("""}"""),format.raw/*49.18*/("""
            """),format.raw/*50.13*/("""}"""),format.raw/*50.14*/(""");
    </script>
""")))}),format.raw/*52.2*/(""" """),format.raw/*52.18*/("""
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
                  DATE: Tue Apr 23 17:21:48 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/login.scala.html
                  HASH: cd7fb1a80c61b30aa25812ec2b090f136761cbef
                  MATRIX: 651->1|1007->18|1163->81|1190->83|1216->101|1255->103|1287->109|1594->389|1632->418|1671->419|1720->440|1806->499|1824->508|1865->528|1914->549|1967->571|2013->590|2052->620|2091->621|2140->642|2222->697|2236->702|2278->723|2327->744|2380->766|2426->785|2441->791|2514->855|2554->857|2603->879|2720->974|2769->996|2896->1101|2945->1122|3339->1488|3368->1489|3409->1502|3477->1543|3506->1544|3552->1562|3610->1592|3639->1593|3689->1615|3935->1833|3964->1834|4013->1855|4127->1941|4156->1942|4197->1955|4226->1956|4274->1974|4303->1990
                  LINES: 24->1|29->2|34->3|35->4|35->4|35->4|37->6|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|46->15|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|54->23|54->23|54->23|54->23|55->24|55->24|56->25|56->25|57->26|68->37|68->37|69->38|70->39|70->39|72->41|72->41|72->41|74->43|78->47|78->47|79->48|80->49|80->49|81->50|81->50|83->52|83->52
                  -- GENERATED --
              */
          