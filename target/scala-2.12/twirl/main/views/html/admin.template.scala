
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

object admin extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Admin],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users: List[models.users.Admin],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Admins",user)/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<h1>Current Admins</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current Admins on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*28.62*/("""
            """),_display_(/*29.14*/for(u<-users) yield /*29.27*/ {_display_(Seq[Any](format.raw/*29.29*/("""
               """),format.raw/*30.16*/("""<tr>
                  <td>"""),_display_(/*31.24*/u/*31.25*/.getEmail),format.raw/*31.34*/("""</td>
                  <td>"""),_display_(/*32.24*/u/*32.25*/.getRole),format.raw/*32.33*/("""</td>
                  <td>"""),_display_(/*33.24*/u/*33.25*/.getName),format.raw/*33.33*/("""</td>
                  <td>"""),_display_(/*34.24*/u/*34.25*/.getPassword),format.raw/*34.37*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*37.18*/routes/*37.24*/.HomeController.updateAdmin(u.getEmail)),format.raw/*37.63*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*43.18*/routes/*43.24*/.HomeController.deleteAdmin(u.getEmail)),format.raw/*43.63*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*48.14*/("""
        
        """),format.raw/*50.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*54.19*/routes/*54.25*/.HomeController.addAdmin()),format.raw/*54.51*/("""">
            <button class="btn btn-primary">Add a new Admin</button>
        </a>
    </p>
</div>
 """)))}))
      }
    }
  }

  def render(users:List[models.users.Admin],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(users,user)

  def f:((List[models.users.Admin],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (users,user) => apply(users,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 12:34:41 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/admin.scala.html
                  HASH: 1e0ecf592df8abc0bf2b4c3e2d985216a9811e6a
                  MATRIX: 984->1|1135->60|1162->79|1200->80|1231->85|1288->181|1316->184|1356->216|1395->218|1424->221|1487->259|1500->264|1535->279|1565->282|1603->290|1636->296|2096->777|2137->791|2166->804|2206->806|2250->822|2305->850|2315->851|2345->860|2401->889|2411->890|2440->898|2496->927|2506->928|2535->936|2591->965|2601->966|2634->978|2736->1053|2751->1059|2811->1098|3038->1298|3053->1304|3113->1343|3339->1538|3384->1556|3460->1605|3475->1611|3522->1637
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|59->28|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|68->37|68->37|68->37|74->43|74->43|74->43|79->48|81->50|85->54|85->54|85->54
                  -- GENERATED --
              */
          