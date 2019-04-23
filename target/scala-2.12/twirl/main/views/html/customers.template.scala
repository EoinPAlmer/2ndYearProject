
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
            <th>Credit Card</th>
        </tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*33.62*/("""
            """),_display_(/*34.14*/for(c<-customers) yield /*34.31*/ {_display_(Seq[Any](format.raw/*34.33*/("""
               """),format.raw/*35.16*/("""<tr>
                  <td>"""),_display_(/*36.24*/c/*36.25*/.getEmail),format.raw/*36.34*/("""</td>
                  <td>"""),_display_(/*37.24*/c/*37.25*/.getRole),format.raw/*37.33*/("""</td>
                  <td>"""),_display_(/*38.24*/c/*38.25*/.getName),format.raw/*38.33*/("""</td>
                  <td>"""),_display_(/*39.24*/c/*39.25*/.getPassword),format.raw/*39.37*/("""</td>
                  <td>"""),_display_(/*40.24*/c/*40.25*/.getStreet1),format.raw/*40.36*/("""</td>
                  <td>"""),_display_(/*41.24*/c/*41.25*/.getStreet2),format.raw/*41.36*/("""</td>
                  <td>"""),_display_(/*42.24*/c/*42.25*/.getTown),format.raw/*42.33*/("""</td>
                  <td>"""),_display_(/*43.24*/c/*43.25*/.getPostCode),format.raw/*43.37*/("""</td>
                  <td>"""),_display_(/*44.24*/c/*44.25*/.getCreditCard),format.raw/*44.39*/("""</td>
                  <!-- Update button -->
						<td>
							<a href=""""),_display_(/*47.18*/routes/*47.24*/.HomeController.updateCustomer(c.getEmail)),format.raw/*47.66*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*53.18*/routes/*53.24*/.HomeController.deleteCustomer(c.getEmail)),format.raw/*53.66*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
               </tr>
            """)))}),format.raw/*58.14*/("""
        
        """),format.raw/*60.9*/("""</tbody>
    </table>

    <p>
        <a href=""""),_display_(/*64.19*/routes/*64.25*/.HomeController.addCustomer()),format.raw/*64.54*/("""">
            <button class="btn btn-primary">Add a new Customer</button>
        </a>
    </p>
</div>
<script>

    function confirmDel()"""),format.raw/*71.26*/("""{"""),format.raw/*71.27*/("""
        """),format.raw/*72.9*/("""return confirm('Are you sure?');
    """),format.raw/*73.5*/("""}"""),format.raw/*73.6*/("""

        """),format.raw/*75.9*/("""$(document).ready(function () """),format.raw/*75.39*/("""{"""),format.raw/*75.40*/("""

            """),format.raw/*77.13*/("""var docHeight = $(window).height();
            var footerHeight = $('#footer').height();
            var footerTop = $('#footer').position().top + footerHeight;

            if (footerTop < docHeight) """),format.raw/*81.40*/("""{"""),format.raw/*81.41*/("""
                """),format.raw/*82.17*/("""$('#footer').css('margin-top', 350 + (docHeight - footerTop) + 'px');
            """),format.raw/*83.13*/("""}"""),format.raw/*83.14*/("""
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/(""");
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
                  DATE: Tue Apr 23 14:12:08 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/customers.scala.html
                  HASH: d6fdb031df61eae49aaad7aab539d60d65a741b0
                  MATRIX: 991->1|1149->67|1179->89|1217->90|1248->95|1308->194|1336->197|1376->229|1415->231|1444->234|1507->272|1520->277|1555->292|1585->295|1623->303|1656->309|2269->943|2310->957|2343->974|2383->976|2427->992|2482->1020|2492->1021|2522->1030|2578->1059|2588->1060|2617->1068|2673->1097|2683->1098|2712->1106|2768->1135|2778->1136|2811->1148|2867->1177|2877->1178|2909->1189|2965->1218|2975->1219|3007->1230|3063->1259|3073->1260|3102->1268|3158->1297|3168->1298|3201->1310|3257->1339|3267->1340|3302->1354|3404->1429|3419->1435|3482->1477|3709->1677|3724->1683|3787->1725|4013->1920|4058->1938|4134->1987|4149->1993|4199->2022|4366->2161|4395->2162|4431->2171|4495->2208|4523->2209|4560->2219|4618->2249|4647->2250|4689->2264|4919->2466|4948->2467|4993->2484|5103->2566|5132->2567|5168->2576|5197->2577
                  LINES: 28->1|33->2|33->2|33->2|34->3|37->6|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|42->11|44->13|64->33|65->34|65->34|65->34|66->35|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|78->47|78->47|78->47|84->53|84->53|84->53|89->58|91->60|95->64|95->64|95->64|102->71|102->71|103->72|104->73|104->73|106->75|106->75|106->75|108->77|112->81|112->81|113->82|114->83|114->83|115->84|115->84
                  -- GENERATED --
              */
          