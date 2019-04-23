
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
            """),format.raw/*27.13*/("""<div class="container">
		<table class="table table-bordered table-hover table-condensed">
			<thead>
			<!-- The header row-->
			<tr>
				<th>Name</th>
				<th>Brand</th>
				<th>Price</th>
				<th>Total</th>
				<th>Size</th>
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
                        <td>"""),_display_(/*50.30*/i/*50.31*/.getProduct.getSize()),format.raw/*50.52*/("""</td>
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
</div>
<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*82.24*/("""{"""),format.raw/*82.25*/("""
		"""),format.raw/*83.3*/("""return confirm('Are you sure?');
	"""),format.raw/*84.2*/("""}"""),format.raw/*84.3*/("""
"""),format.raw/*85.1*/("""</script>
 <script>

    function confirmDel()"""),format.raw/*88.26*/("""{"""),format.raw/*88.27*/("""
        """),format.raw/*89.9*/("""return confirm('Are you sure?');
    """),format.raw/*90.5*/("""}"""),format.raw/*90.6*/("""

        """),format.raw/*92.9*/("""$(document).ready(function () """),format.raw/*92.39*/("""{"""),format.raw/*92.40*/("""

            """),format.raw/*94.13*/("""var docHeight = $(window).height();
            var footerHeight = $('#footer').height();
            var footerTop = $('#footer').position().top + footerHeight;

            if (footerTop < docHeight) """),format.raw/*98.40*/("""{"""),format.raw/*98.41*/("""
                """),format.raw/*99.17*/("""$('#footer').css('margin-top', 500 + (docHeight - footerTop) + 'px');
            """),format.raw/*100.13*/("""}"""),format.raw/*100.14*/("""
        """),format.raw/*101.9*/("""}"""),format.raw/*101.10*/(""");
</script>
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
                  DATE: Tue Apr 23 18:56:43 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 98517dd27400f3a3234826314071a6a011764c1c
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1191->35|1219->119|1246->120|1317->166|1358->199|1397->201|1427->204|1510->260|1549->290|1589->292|1634->309|1716->364|1730->369|1764->382|1809->399|1856->415|1886->418|1939->445|1980->477|2020->479|2053->485|2124->529|2138->534|2174->549|2207->555|2247->565|2289->579|2654->917|2695->949|2735->951|2784->972|2894->1055|2960->1105|3000->1107|3049->1128|3110->1162|3120->1163|3160->1182|3222->1217|3232->1218|3275->1240|3344->1282|3392->1309|3461->1351|3516->1385|3578->1420|3588->1421|3630->1442|3701->1486|3716->1492|3789->1544|3918->1646|3933->1652|4003->1701|4144->1811|4215->1851|4246->1855|4423->2005|4495->2055|4702->2235|4717->2241|4765->2268|5087->2563|5102->2569|5149->2595|5482->2900|5511->2901|5541->2904|5602->2938|5630->2939|5658->2940|5732->2986|5761->2987|5797->2996|5861->3033|5889->3034|5926->3044|5984->3074|6013->3075|6055->3089|6285->3291|6314->3292|6359->3309|6470->3391|6500->3392|6537->3401|6567->3402
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|57->26|58->27|73->42|73->42|73->42|74->43|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|85->54|86->55|87->56|91->60|91->60|97->66|97->66|97->66|103->72|103->72|103->72|113->82|113->82|114->83|115->84|115->84|116->85|119->88|119->88|120->89|121->90|121->90|123->92|123->92|123->92|125->94|129->98|129->98|130->99|131->100|131->100|132->101|132->101
                  -- GENERATED --
              */
          