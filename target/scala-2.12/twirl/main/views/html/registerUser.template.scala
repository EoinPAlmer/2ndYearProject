
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

object registerUser extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.users.UserPassword2],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(regForm: Form[models.users.UserPassword2],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Register User",user)/*5.28*/{_display_(Seq[Any](format.raw/*5.29*/("""

    """),format.raw/*7.57*/("""
	"""),_display_(/*8.3*/if(flash.containsKey("error"))/*8.33*/ {_display_(Seq[Any](format.raw/*8.35*/("""
		"""),format.raw/*9.3*/("""<div class="alert alert-success">
			"""),_display_(/*10.5*/flash/*10.10*/.get("error")),format.raw/*10.23*/("""
		"""),format.raw/*11.3*/("""</div>
	""")))}),format.raw/*12.3*/("""

    """),format.raw/*14.5*/("""<!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*17.6*/form(action=routes.LoginController.registerUserSubmit(), 'class -> "form-horizontal", 'role -> "form")/*17.108*/ {_display_(Seq[Any](format.raw/*17.110*/("""
        """),format.raw/*18.37*/("""
        """),format.raw/*19.99*/("""
        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""
        """),format.raw/*21.9*/("""<h2 class = "text-center text-muted"><span class = "logo"></span>Create Your Accont Today</h2>

        <div class="row text-center">
            <div class="col-md-offset-4 col-md-4">
                <form role="form">
            """),_display_(/*26.14*/inputText(regForm("email"), '_label -> "Email", 'class -> "form-control")),format.raw/*26.87*/("""       
            """),_display_(/*27.14*/inputText(regForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*27.85*/("""
            """),_display_(/*28.14*/inputDate(regForm("dateOfBirth"), args = 'size -> 10, '_label -> "Date Of Birth", 'class -> "form-control")),format.raw/*28.121*/("""
            """),_display_(/*29.14*/inputText(regForm("password"), '_label -> "Password", 'class -> "form-control")),format.raw/*29.93*/("""
            """),_display_(/*30.14*/inputText(regForm("password2"), '_label -> "Confirm Password", 'class -> "form-control")),format.raw/*30.102*/("""
            """),_display_(/*31.14*/inputText(regForm("street1"), '_label -> "Street 1", 'class -> "form-control")),format.raw/*31.92*/("""
            """),_display_(/*32.14*/inputText(regForm("street2"), '_label -> "Street 2", 'class -> "form-control")),format.raw/*32.92*/("""
            """),_display_(/*33.14*/inputText(regForm("town"), '_label -> "Town", 'class -> "form-control")),format.raw/*33.85*/("""
            """),_display_(/*34.14*/inputText(regForm("postCode"), '_label -> "PostCode", 'class -> "form-control")),format.raw/*34.93*/("""
            """),_display_(/*35.14*/inputText(regForm("creditCard"), '_label -> "Credit Card",'class -> "form-control")),format.raw/*35.97*/("""
            
            """),_display_(/*37.14*/inputText(regForm("role").copy(value=Some("customer")), '_label -> "",'hidden -> "hidden")),format.raw/*37.104*/("""
            """),_display_(/*38.14*/inputText(regForm("email"), '_label -> "", 'hidden -> "hidden")),format.raw/*38.77*/("""
            
            """),format.raw/*40.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Register user" class="btn btn-primary">
                <a href=""""),_display_(/*46.27*/routes/*46.33*/.LoginController.registerUser()),format.raw/*46.64*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
                   </form>
            </div>
        </div>
    """)))}),format.raw/*53.6*/(""" """),format.raw/*53.24*/("""
""")))}),format.raw/*54.2*/(""" """))
      }
    }
  }

  def render(regForm:Form[models.users.UserPassword2],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(regForm,user)

  def f:((Form[models.users.UserPassword2],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (regForm,user) => apply(regForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 14:12:08 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/registerUser.scala.html
                  HASH: 1f3966e4898a9807d9fd7f9a3ffb2860f65e6e63
                  MATRIX: 999->1|1139->71|1183->69|1210->87|1237->89|1271->115|1309->116|1342->174|1370->177|1408->207|1447->209|1476->212|1540->250|1554->255|1588->268|1618->271|1657->280|1690->286|1969->539|2081->641|2122->643|2159->680|2196->779|2233->789|2246->793|2277->803|2313->812|2573->1045|2667->1118|2715->1139|2807->1210|2848->1224|2977->1331|3018->1345|3118->1424|3159->1438|3269->1526|3310->1540|3409->1618|3450->1632|3549->1710|3590->1724|3682->1795|3723->1809|3823->1888|3864->1902|3968->1985|4022->2012|4134->2102|4175->2116|4259->2179|4313->2205|4703->2568|4718->2574|4770->2605|4991->2796|5020->2814|5052->2816
                  LINES: 28->1|31->3|34->2|35->4|36->5|36->5|36->5|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|45->14|48->17|48->17|48->17|49->18|50->19|51->20|51->20|51->20|52->21|57->26|57->26|58->27|58->27|59->28|59->28|60->29|60->29|61->30|61->30|62->31|62->31|63->32|63->32|64->33|64->33|65->34|65->34|66->35|66->35|68->37|68->37|69->38|69->38|71->40|77->46|77->46|77->46|84->53|84->53|85->54
                  -- GENERATED --
              */
          