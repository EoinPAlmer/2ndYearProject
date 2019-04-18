
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(cForm: Form[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Customer",user)/*6.27*/{_display_(Seq[Any](format.raw/*6.28*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new customer</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addCustomerSubmit, 'class -> "form-horizontal", 'role -> "form")/*12.104*/ {_display_(Seq[Any](format.raw/*12.106*/("""
        """),format.raw/*13.37*/("""
        """),format.raw/*14.99*/("""
        """),_display_(/*15.10*/CSRF/*15.14*/.formField),format.raw/*15.24*/("""
             """),_display_(/*16.15*/inputText(cForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*16.86*/("""
             """),_display_(/*17.15*/inputText(cForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*17.84*/("""
             """),_display_(/*18.15*/inputDate(cForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*18.120*/("""
             """),_display_(/*19.15*/inputText(cForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*19.92*/("""         
             """),_display_(/*20.15*/inputText(cForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*20.91*/("""
             """),_display_(/*21.15*/inputText(cForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*21.91*/("""
             """),_display_(/*22.15*/inputText(cForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*22.84*/("""
             """),_display_(/*23.15*/inputText(cForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*23.92*/("""
             """),_display_(/*24.15*/inputText(cForm("creditCard"), '_label -> "Credit Card",'class -> "form-control")),format.raw/*24.96*/("""

             """),_display_(/*26.15*/inputText(cForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*26.103*/("""
             """),_display_(/*27.15*/inputText(cForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*27.76*/("""
            
            """),format.raw/*29.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update Customer" class="btn btn-primary">
                <a href=""""),_display_(/*35.27*/routes/*35.33*/.HomeController.usersCustomer()),format.raw/*35.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*39.6*/(""" """),format.raw/*39.24*/("""
""")))}),format.raw/*40.2*/(""" """))
      }
    }
  }

  def render(cForm:Form[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(cForm,user)

  def f:((Form[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (cForm,user) => apply(cForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 18 15:44:19 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/registerUser.scala.html
                  HASH: 70567861ed6a842fd444a43a6fb7e6af4d162bef
                  MATRIX: 994->1|1127->65|1171->62|1199->81|1226->83|1259->108|1297->109|1328->114|1651->411|1759->509|1800->511|1837->548|1874->647|1911->657|1924->661|1955->671|1997->686|2089->757|2131->772|2221->841|2263->856|2390->961|2432->976|2530->1053|2581->1077|2678->1153|2720->1168|2817->1244|2859->1259|2949->1328|2991->1343|3089->1420|3131->1435|3233->1516|3276->1532|3386->1620|3428->1635|3510->1696|3564->1722|3960->2091|3975->2097|4027->2128|4187->2258|4216->2276|4248->2278
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|43->12|43->12|44->13|45->14|46->15|46->15|46->15|47->16|47->16|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|57->26|57->26|58->27|58->27|60->29|66->35|66->35|66->35|70->39|70->39|71->40
                  -- GENERATED --
              */
          