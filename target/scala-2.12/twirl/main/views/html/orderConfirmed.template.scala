
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

object orderConfirmed extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[models.users.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.users.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import play.api.Play.current
/*5.2*/import models.shopping._
/*6.2*/import models.products._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*7.1*/("""
"""),format.raw/*8.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*9.2*/main("Order Confirmation", customer)/*9.38*/ {_display_(Seq[Any](format.raw/*9.40*/("""


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
				<th>Description</th>
				<th>Item Price</th>
				<th>Quantity</th>
                <th>Total</th>
			</tr>
			</thead>
			<tbody>
                """),_display_(/*33.18*/if(order != null)/*33.35*/ {_display_(Seq[Any](format.raw/*33.37*/("""
                    """),format.raw/*34.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*35.22*/for(p <- order.getProducts) yield /*35.49*/ {_display_(Seq[Any](format.raw/*35.51*/("""
                    """),format.raw/*36.21*/("""<tr>
                        <td>"""),_display_(/*37.30*/p/*37.31*/.getName),format.raw/*37.39*/("""</td>
                        <td>"""),_display_(/*38.30*/p/*38.31*/.getBrand),format.raw/*38.40*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(p.getPrice))),format.raw/*39.64*/("""</td>
                        <td>"""),_display_(/*40.30*/p/*40.31*/.getQuantity()),format.raw/*40.45*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(p.getProductTotal))),format.raw/*41.71*/("""</td>
                    </tr>
                    """)))}),format.raw/*43.22*/("""<!-- End of For loop -->
              """)))}),format.raw/*44.16*/("""
			"""),format.raw/*45.4*/("""</tbody>
		</table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*49.68*/("%.2f".format(order.getOrderTotal))),format.raw/*49.104*/("""</strong></p>
            </div>  
        </div>
        </div>
</div>
""")))}),format.raw/*54.2*/("""
"""))
      }
    }
  }

  def render(customer:models.users.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.users.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 22 12:24:04 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/orderConfirmed.scala.html
                  HASH: a7e960073bbec81b237d78d762ab3ea3f8328dc5
                  MATRIX: 998->1|1138->72|1174->102|1206->128|1259->69|1287->153|1314->154|1385->200|1429->236|1468->238|1498->241|1571->288|1612->320|1652->322|1685->328|1756->372|1770->377|1806->392|1839->398|1879->408|1911->413|2217->692|2243->709|2283->711|2332->732|2442->815|2485->842|2525->844|2574->865|2635->899|2645->900|2674->908|2736->943|2746->944|2776->953|2845->995|2893->1022|2955->1057|2965->1058|3000->1072|3069->1114|3124->1148|3208->1201|3279->1241|3310->1245|3486->1394|3544->1430|3647->1503
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|52->21|64->33|64->33|64->33|65->34|66->35|66->35|66->35|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|71->40|71->40|71->40|72->41|72->41|74->43|75->44|76->45|80->49|80->49|85->54
                  -- GENERATED --
              */
          