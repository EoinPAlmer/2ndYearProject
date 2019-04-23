
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

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Customer],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.users.Customer],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Customers",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current customers</h1>


    """),format.raw/*6.71*/("""
	"""),_display_(/*7.3*/if(flash.containsKey("success"))/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""
		"""),format.raw/*8.3*/("""<div class="alert alert-success">
			"""),_display_(/*9.5*/flash/*9.10*/.get("success")),format.raw/*9.25*/("""
		"""),format.raw/*10.3*/("""</div>
""")))}),format.raw/*11.2*/("""

    """),format.raw/*13.5*/("""<div class="col-sm-9">
        <h4>Here are all the current customers on the system.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Email</th>
            <th>Role </th>
            <th>Name</th>
            <th>Password</th>
            <th>Street 1</th>
            <th>Street 2</th>
            <th>Town</th>
            <th>Postcode</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*32.66*/("""
            """),_display_(/*33.14*/for(c<-customers) yield /*33.31*/ {_display_(Seq[Any](format.raw/*33.33*/("""
               """),format.raw/*34.16*/("""<tr>
                  <td>"""),_display_(/*35.24*/c/*35.25*/.getEmail),format.raw/*35.34*/("""</td>
                  <td>"""),_display_(/*36.24*/c/*36.25*/.getRole),format.raw/*36.33*/("""</td>
                  <td>"""),_display_(/*37.24*/c/*37.25*/.getName),format.raw/*37.33*/("""</td>
                  <td>"""),_display_(/*38.24*/c/*38.25*/.getPassword),format.raw/*38.37*/("""</td>
                  <td>"""),_display_(/*39.24*/c/*39.25*/.getStreet1),format.raw/*39.36*/("""</td>
                  <td>"""),_display_(/*40.24*/c/*40.25*/.getStreet2),format.raw/*40.36*/("""</td>
                  <td>"""),_display_(/*41.24*/c/*41.25*/.getTown),format.raw/*41.33*/("""</td>
                  <td>"""),_display_(/*42.24*/c/*42.25*/.getPostCode),format.raw/*42.37*/("""</td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*45.18*/routes/*45.24*/.HomeController.deleteCustomer(c.getEmail)),format.raw/*45.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*50.14*/("""
        
        """),format.raw/*52.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*56.19*/routes/*56.25*/.HomeController.addCustomer()),format.raw/*56.54*/("""">
            <button class="btn btn-Dark">Add a new Customer</button>
        </a>
    </p>
</div>
<script>

    function confirmDel()"""),format.raw/*63.26*/("""{"""),format.raw/*63.27*/("""
        """),format.raw/*64.9*/("""return confirm('Are you sure?');
    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""

        """),format.raw/*67.9*/("""$(document).ready(function () """),format.raw/*67.39*/("""{"""),format.raw/*67.40*/("""

            """),format.raw/*69.13*/("""var docHeight = $(window).height();
            var footerHeight = $('#footer').height();
            var footerTop = $('#footer').position().top + footerHeight;

            if (footerTop < docHeight) """),format.raw/*73.40*/("""{"""),format.raw/*73.41*/("""
                """),format.raw/*74.17*/("""$('#footer').css('margin-top', 380 + (docHeight - footerTop) + 'px');
            """),format.raw/*75.13*/("""}"""),format.raw/*75.14*/("""
        """),format.raw/*76.9*/("""}"""),format.raw/*76.10*/(""");
</script>
 """)))}))
      }
    }
  }

  def render(customers:List[models.users.Customer],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(customers,user)

  def f:((List[models.users.Customer],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (customers,user) => apply(customers,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 20:50:42 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/customers.scala.html
                  HASH: 2c6cae642ebfbce1975234bdb72ab508a3118083
                  MATRIX: 991->1|1149->67|1179->89|1217->90|1248->95|1308->194|1336->197|1376->229|1415->231|1444->234|1507->272|1520->277|1555->292|1585->295|1623->303|1656->309|2236->914|2277->928|2310->945|2350->947|2394->963|2449->991|2459->992|2489->1001|2545->1030|2555->1031|2584->1039|2640->1068|2650->1069|2679->1077|2735->1106|2745->1107|2778->1119|2834->1148|2844->1149|2876->1160|2932->1189|2942->1190|2974->1201|3030->1230|3040->1231|3069->1239|3125->1268|3135->1269|3168->1281|3270->1356|3285->1362|3348->1404|3574->1599|3619->1617|3695->1666|3710->1672|3760->1701|3924->1837|3953->1838|3989->1847|4053->1884|4081->1885|4118->1895|4176->1925|4205->1926|4247->1940|4477->2142|4506->2143|4551->2160|4661->2242|4690->2243|4726->2252|4755->2253
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|63->32|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|76->45|76->45|76->45|81->50|83->52|87->56|87->56|87->56|94->63|94->63|95->64|96->65|96->65|98->67|98->67|98->67|100->69|104->73|104->73|105->74|106->75|106->75|107->76|107->76
                  -- GENERATED --
              */
          