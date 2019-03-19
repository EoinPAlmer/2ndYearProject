
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import play.api.Play.current
/*4.2*/import models.Products._


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("Shopping Basket", customer)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""


"""),format.raw/*10.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		
        """),format.raw/*20.9*/("""<div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*22.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*22.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.ShoppingCtrl.emptyBasket()),format.raw/*28.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.ShoppingCtrl.placeOrder()),format.raw/*34.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*44.24*/("""{"""),format.raw/*44.25*/("""
		"""),format.raw/*45.3*/("""return confirm('Are you sure?');
	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/("""
"""),format.raw/*47.1*/("""</script>

<table class="table table-bordered table-hover table-condensed">
    <thead>
    <!-- The header row-->
    <tr>
        <th>Name</th>
        <th>Description</th>
        <th>Item Price</th>
        <th>Total</th>
        <th>Quantity</th>
        <th>dec.</th>
        <th>inc.</th>
    </tr>
    </thead>
    <tbody>
        """),_display_(/*63.10*/if(Customer.getBasket() != null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
            """),format.raw/*64.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*65.14*/for(i <- customer.getBasket().getBasketItems()) yield /*65.61*/ {_display_(Seq[Any](format.raw/*65.63*/("""
            """),format.raw/*66.13*/("""<tr>
                <td>"""),_display_(/*67.22*/i/*67.23*/.getProducts.getName),format.raw/*67.43*/("""</td>
                <td>"""),_display_(/*68.22*/i/*68.23*/.getProducts.getDescription()),format.raw/*68.52*/("""</td>
                <td>&euro; """),_display_(/*69.29*/("%.2f".format(i.getPrice))),format.raw/*69.56*/("""</td>
                <td>&euro; """),_display_(/*70.29*/("%.2f".format(i.getItemTotal))),format.raw/*70.60*/("""</td>
                <td>"""),_display_(/*71.22*/i/*71.23*/.getQuantity()),format.raw/*71.37*/("""</td>
                <td><a href=""""),_display_(/*72.31*/routes/*72.37*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*72.69*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                <td><a href=""""),_display_(/*73.31*/routes/*73.37*/.ShoppingCtrl.addOne(i.getId)),format.raw/*73.66*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
            </tr>
            """)))}),format.raw/*75.14*/("""<!-- End of For loop -->
      """)))}),format.raw/*76.8*/("""
    """),format.raw/*77.5*/("""</tbody>
</table>
""")))}))
      }
    }
  }

  def render(customer:models.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 19 15:23:27 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 28caefc191663d24841f01ae78110dc21b8ff8ee
                  MATRIX: 958->1|1058->31|1094->61|1147->29|1174->86|1201->87|1272->133|1313->166|1352->168|1382->171|1455->218|1496->250|1536->252|1569->258|1640->302|1654->307|1690->322|1723->328|1763->338|1804->352|1953->474|2025->524|2232->704|2247->710|2295->737|2617->1032|2632->1038|2679->1064|3006->1363|3035->1364|3065->1367|3126->1401|3154->1402|3182->1403|3549->1743|3590->1775|3630->1777|3671->1790|3773->1865|3836->1912|3876->1914|3917->1927|3970->1953|3980->1954|4021->1974|4075->2001|4085->2002|4135->2031|4196->2065|4244->2092|4305->2126|4357->2157|4411->2184|4421->2185|4456->2199|4519->2235|4534->2241|4587->2273|4708->2367|4723->2373|4773->2402|4898->2496|4960->2528|4992->2533
                  LINES: 28->1|31->3|32->4|35->2|36->5|37->6|38->7|38->7|38->7|41->10|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|51->20|53->22|53->22|59->28|59->28|59->28|65->34|65->34|65->34|75->44|75->44|76->45|77->46|77->46|78->47|94->63|94->63|94->63|95->64|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|99->68|99->68|100->69|100->69|101->70|101->70|102->71|102->71|102->71|103->72|103->72|103->72|104->73|104->73|104->73|106->75|107->76|108->77
                  -- GENERATED --
              */
          