
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
        """),_display_(/*15.10*/if(flash.containsKey("error"))/*15.40*/ {_display_(Seq[Any](format.raw/*15.42*/("""
                """),format.raw/*16.17*/("""<div class="alert alert-success">
                    """),_display_(/*17.22*/flash/*17.27*/.get("error")),format.raw/*17.40*/("""
                """),format.raw/*18.17*/("""</div>
        """)))}),format.raw/*19.10*/("""

	"""),format.raw/*21.2*/("""<div class="col-md-12">
		"""),_display_(/*22.4*/if(flash.containsKey("success"))/*22.36*/ {_display_(Seq[Any](format.raw/*22.38*/("""
			  """),format.raw/*23.6*/("""<div class="alert alert-success">
			      """),_display_(/*24.11*/flash/*24.16*/.get("success")),format.raw/*24.31*/("""
			  """),format.raw/*25.6*/("""</div>
		""")))}),format.raw/*26.4*/(""" 

		"""),format.raw/*28.3*/("""<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Brand</th>
				<th>Price</th>
				<th>Total</th>
				<th>Stocky</th>
                <th>dec.</th>
                <th>inc.</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*42.18*/if(customer.getBasket() != null)/*42.50*/ {_display_(Seq[Any](format.raw/*42.52*/("""
                    """),format.raw/*43.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*44.22*/for(i <- customer.getBasket().getBasketProducts()) yield /*44.72*/ {_display_(Seq[Any](format.raw/*44.74*/("""
                    """),format.raw/*45.21*/("""<tr>
                        <td>"""),_display_(/*46.30*/i/*46.31*/.getProduct.getName),format.raw/*46.50*/("""</td>
                        <td>"""),_display_(/*47.30*/i/*47.31*/.getProduct.getBrand()),format.raw/*47.53*/("""</td>
                        <td>&euro; """),_display_(/*48.37*/("%.2f".format(i.getPrice))),format.raw/*48.64*/("""</td>
                        <td>&euro; """),_display_(/*49.37*/("%.2f".format(i.getProductTotal))),format.raw/*49.71*/("""</td>
                        <td>"""),_display_(/*50.30*/i/*50.31*/.getProduct.getStock()),format.raw/*50.53*/("""</td>
                        <td><a href=""""),_display_(/*51.39*/routes/*51.45*/.ShoppingCtrl.removeOne(i.getId, i.getProduct.getId)),format.raw/*51.97*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                        <td><a href=""""),_display_(/*52.39*/routes/*52.45*/.ShoppingCtrl.addOne(i.getId, i.getProduct.getId)),format.raw/*52.94*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
                    </tr>
                    """)))}),format.raw/*54.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*55.16*/("""
			"""),format.raw/*56.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*60.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*60.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*66.31*/routes/*66.37*/.ShoppingCtrl.emptyBasket()),format.raw/*66.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*72.31*/routes/*72.37*/.ShoppingCtrl.placeOrder()),format.raw/*72.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*82.24*/("""{"""),format.raw/*82.25*/("""
		"""),format.raw/*83.3*/("""return confirm('Are you sure?');
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
"""),format.raw/*85.1*/("""</script>
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
                  DATE: Wed Apr 03 17:10:53 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 57b5397f4a587c05995142c94727f64e8c4bd64c
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1191->35|1219->119|1246->120|1317->166|1358->199|1397->201|1427->204|1510->260|1549->290|1589->292|1634->309|1716->364|1730->369|1764->382|1809->399|1856->415|1886->418|1939->445|1980->477|2020->479|2053->485|2124->529|2138->534|2174->549|2207->555|2247->565|2279->570|2620->884|2661->916|2701->918|2750->939|2860->1022|2926->1072|2966->1074|3015->1095|3076->1129|3086->1130|3126->1149|3188->1184|3198->1185|3241->1207|3310->1249|3358->1276|3427->1318|3482->1352|3544->1387|3554->1388|3597->1410|3668->1454|3683->1460|3756->1512|3885->1614|3900->1620|3970->1669|4111->1779|4182->1819|4213->1823|4390->1973|4462->2023|4669->2203|4684->2209|4732->2236|5054->2531|5069->2537|5116->2563|5443->2862|5472->2863|5502->2866|5563->2900|5591->2901|5619->2902
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|57->26|59->28|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|85->54|86->55|87->56|91->60|91->60|97->66|97->66|97->66|103->72|103->72|103->72|113->82|113->82|114->83|115->84|115->84|116->85
                  -- GENERATED --
              */
          