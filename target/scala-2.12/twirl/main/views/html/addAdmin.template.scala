
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

object addAdmin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Admin],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[models.users.Admin],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import models.users.User
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Admin",user)/*6.24*/{_display_(Seq[Any](format.raw/*6.25*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new administrator</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addAdminSubmit(), 'class -> "form-horizontal", 'role -> "form")/*12.103*/ {_display_(Seq[Any](format.raw/*12.105*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""

            """),_display_(/*17.14*/inputText(userForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*17.88*/("""
            """),_display_(/*18.14*/inputText(userForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.86*/("""
            """),_display_(/*19.14*/inputText(userForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.94*/("""
            """),_display_(/*20.14*/inputText(userForm("role").copy(value=Some("admin")), '_label -> "",'hidden -> "hidden")),format.raw/*20.102*/("""
            """),_display_(/*21.14*/inputText(userForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*21.78*/("""
            
            """),format.raw/*23.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Admin" class="btn btn-primary">
                <a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.usersAdmin()),format.raw/*29.61*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*33.6*/(""" """),format.raw/*33.24*/("""
""")))}),format.raw/*34.2*/(""" """))
      }
    }
  }

  def render(userForm:Form[models.users.Admin],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(userForm,user)

  def f:((Form[models.users.Admin],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (userForm,user) => apply(userForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 03 15:56:02 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addAdmin.scala.html
                  HASH: 3883a7759a91c5bfbb6b4c936102f357feabae9a
                  MATRIX: 987->1|1120->64|1152->90|1196->62|1223->106|1250->108|1280->130|1318->131|1349->136|1677->438|1784->535|1825->537|1862->574|1899->673|1936->683|1949->687|1980->697|2022->712|2117->786|2158->800|2251->872|2292->886|2393->966|2434->980|2544->1068|2585->1082|2670->1146|2724->1172|3117->1538|3132->1544|3181->1572|3341->1702|3370->1720|3402->1722
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|54->23|60->29|60->29|60->29|64->33|64->33|65->34
                  -- GENERATED --
              */
          