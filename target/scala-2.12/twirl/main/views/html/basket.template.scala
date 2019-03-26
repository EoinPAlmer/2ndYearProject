
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


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Shopping Basket", customer)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""


"""),format.raw/*12.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*15.4*/if(flash.containsKey("success"))/*15.36*/ {_display_(Seq[Any](format.raw/*15.38*/("""
			  """),format.raw/*16.6*/("""<div class="alert alert-success">
			      """),_display_(/*17.11*/flash/*17.16*/.get("success")),format.raw/*17.31*/("""
			  """),format.raw/*18.6*/("""</div>
		""")))}),format.raw/*19.4*/(""" 

		"""),format.raw/*21.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Brand</th>
				<th>Price</th>
				<th>Total</th>
				<th>Quantity</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*35.18*/if(customer.getBasket() != null)/*35.50*/ {_display_(Seq[Any](format.raw/*35.52*/("""
                    """),format.raw/*36.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*37.22*/for(i <- customer.getBasket().getBasketProducts()) yield /*37.72*/ {_display_(Seq[Any](format.raw/*37.74*/("""
                    """),format.raw/*38.21*/("""<tr>
                        <td>"""),_display_(/*39.30*/i/*39.31*/.getBasket.getName),format.raw/*39.49*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getBasket.getBrand()),format.raw/*40.52*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getPrice))),format.raw/*41.64*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getProductTotal))),format.raw/*42.71*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getQuantity()),format.raw/*43.45*/("""</td>
                        <td><a href=""""),_display_(/*44.39*/routes/*44.45*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*44.77*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*45.39*/routes/*45.45*/.ShoppingCtrl.addOne(i.getId)),format.raw/*45.74*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*47.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*48.16*/("""
			"""),format.raw/*49.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*53.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*53.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*59.31*/routes/*59.37*/.ShoppingCtrl.emptyBasket()),format.raw/*59.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*65.31*/routes/*65.37*/.ShoppingCtrl.placeOrder()),format.raw/*65.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*75.24*/("""{"""),format.raw/*75.25*/("""
		"""),format.raw/*76.3*/("""return confirm('Are you sure?');
	"""),format.raw/*77.2*/("""}"""),format.raw/*77.3*/("""
"""),format.raw/*78.1*/("""</script>
""")))}))
      }
    }
  }

  def render(customer:models.users.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.users.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 26 15:43:49 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 40323bbb6034ca1c0c08dd4d77177d5653c9f47d
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1191->35|1219->119|1246->120|1317->166|1358->199|1397->201|1427->204|1500->251|1541->283|1581->285|1614->291|1685->335|1699->340|1735->355|1768->361|1808->371|1840->376|2183->692|2224->724|2264->726|2313->747|2423->830|2489->880|2529->882|2578->903|2639->937|2649->938|2688->956|2750->991|2760->992|2802->1013|2871->1055|2919->1082|2988->1124|3043->1158|3105->1193|3115->1194|3150->1208|3221->1252|3236->1258|3289->1290|3418->1392|3433->1398|3483->1427|3624->1537|3695->1577|3726->1581|3903->1731|3975->1781|4182->1961|4197->1967|4245->1994|4567->2289|4582->2295|4629->2321|4956->2620|4985->2621|5015->2624|5076->2658|5104->2659|5132->2660
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|78->47|79->48|80->49|84->53|84->53|90->59|90->59|90->59|96->65|96->65|96->65|106->75|106->75|107->76|108->77|108->77|109->78
                  -- GENERATED --
              */
          