
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

object basket extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._
/*7.2*/import models.users._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*8.1*/("""
"""),format.raw/*9.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*10.2*/main("Shopping Basket", customer)/*10.35*/ {_display_(Seq[Any](format.raw/*10.37*/("""


"""),format.raw/*13.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*16.4*/if(flash.containsKey("success"))/*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""
			  """),format.raw/*17.6*/("""<div class="alert alert-success">
			      """),_display_(/*18.11*/flash/*18.16*/.get("success")),format.raw/*18.31*/("""
			  """),format.raw/*19.6*/("""</div>
		""")))}),format.raw/*20.4*/(""" 

		
        """),format.raw/*23.9*/("""<div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*25.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*25.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*31.31*/routes/*31.37*/.ShoppingCtrl.emptyBasket()),format.raw/*31.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*37.31*/routes/*37.37*/.ShoppingCtrl.placeOrder()),format.raw/*37.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*47.24*/("""{"""),format.raw/*47.25*/("""
		"""),format.raw/*48.3*/("""return confirm('Are you sure?');
	"""),format.raw/*49.2*/("""}"""),format.raw/*49.3*/("""
"""),format.raw/*50.1*/("""</script>
""")))}),format.raw/*51.2*/("""
"""),format.raw/*52.1*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
    <!-- The header row-->
    <tr>
        <th>Name</th>
        <th>Brand</th>
        <th>Size</th>
        <th>Price</th>
        <th>Total</th>
        <th>Quantity</th>
    </tr>
    </thead>
    <tbody>
        """),_display_(/*65.10*/if(customer.getBasket() != null)/*65.42*/ {_display_(Seq[Any](format.raw/*65.44*/("""
            """),format.raw/*66.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*67.14*/for(i <- customer.getBasket().getBasketProduct()) yield /*67.63*/ {_display_(Seq[Any](format.raw/*67.65*/("""
            """),format.raw/*68.13*/("""<tr>
                <td>"""),_display_(/*69.22*/i/*69.23*/.getProducts.getName),format.raw/*69.43*/("""</td>
                <td>"""),_display_(/*70.22*/i/*70.23*/.getProducts.getBrand()),format.raw/*70.46*/("""</td>
                <td>&euro; """),_display_(/*71.29*/("%.2f".format(i.getPrice))),format.raw/*71.56*/("""</td>
                <td>&euro; """),_display_(/*72.29*/("%.2f".format(i.getProductTotal))),format.raw/*72.63*/("""</td>
                <td>"""),_display_(/*73.22*/i/*73.23*/.getQuantity()),format.raw/*73.37*/("""</td>
                <td><a href=""""),_display_(/*74.31*/routes/*74.37*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*74.69*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                <td><a href=""""),_display_(/*75.31*/routes/*75.37*/.ShoppingCtrl.addOne(i.getId)),format.raw/*75.66*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
            </tr>
            """)))}),format.raw/*77.14*/("""<!-- End of For loop -->
      """)))}),format.raw/*78.8*/("""
    """),format.raw/*79.5*/("""</tbody>
</table>
"""))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 20 18:45:54 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 498055cac70465e4d3eb71f7f161970029be3ad8
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1170->120|1220->35|1248->142|1275->143|1347->189|1389->222|1429->224|1459->227|1532->274|1573->306|1613->308|1646->314|1717->358|1731->363|1767->378|1800->384|1840->394|1881->408|2030->530|2102->580|2309->760|2324->766|2372->793|2694->1088|2709->1094|2756->1120|3083->1419|3112->1420|3142->1423|3203->1457|3231->1458|3259->1459|3300->1470|3328->1471|3651->1767|3692->1799|3732->1801|3773->1814|3875->1889|3940->1938|3980->1940|4021->1953|4074->1979|4084->1980|4125->2000|4179->2027|4189->2028|4233->2051|4294->2085|4342->2112|4403->2146|4458->2180|4512->2207|4522->2208|4557->2222|4620->2258|4635->2264|4688->2296|4809->2390|4824->2396|4874->2425|4999->2519|5061->2551|5093->2556
                  LINES: 28->1|31->4|32->5|33->6|34->7|37->2|39->8|40->9|41->10|41->10|41->10|44->13|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|51->20|54->23|56->25|56->25|62->31|62->31|62->31|68->37|68->37|68->37|78->47|78->47|79->48|80->49|80->49|81->50|82->51|83->52|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|108->77|109->78|110->79
                  -- GENERATED --
              */
          