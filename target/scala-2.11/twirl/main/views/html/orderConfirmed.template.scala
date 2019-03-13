
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object orderConfirmed_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class orderConfirmed extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.User.Customer,models.shopping.ShopOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.User.Customer, order: models.shopping.ShopOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current
import models.shopping._
import models.products._

Seq[Any](format.raw/*1.68*/("""


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
                    """),_display_(/*35.22*/for(i <- order.getItems) yield /*35.46*/ {_display_(Seq[Any](format.raw/*35.48*/("""
                    """),format.raw/*36.21*/("""<tr>
                        <td>"""),_display_(/*37.30*/i/*37.31*/.getItem.getName),format.raw/*37.47*/("""</td>
                        <td>"""),_display_(/*38.30*/i/*38.31*/.getItem.getDescription),format.raw/*38.54*/("""</td>
                        <td>&euro; """),_display_(/*39.37*/("%.2f".format(i.getPrice))),format.raw/*39.64*/("""</td>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getQuantity()),format.raw/*40.45*/("""</td>
                        <td>&euro; """),_display_(/*41.37*/("%.2f".format(i.getItemTotal))),format.raw/*41.68*/("""</td>
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
""")))}))
      }
    }
  }

  def render(customer:models.User.Customer,order:models.shopping.ShopOrder): play.twirl.api.HtmlFormat.Appendable = apply(customer,order)

  def f:((models.User.Customer,models.shopping.ShopOrder) => play.twirl.api.HtmlFormat.Appendable) = (customer,order) => apply(customer,order)

  def ref: this.type = this

}


}

/**/
object orderConfirmed extends orderConfirmed_Scope0.orderConfirmed
              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 17:09:28 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/orderConfirmed.scala.html
                  HASH: c0cfd988d91aa92f9cd253f7cc4a0512499f2cc2
                  MATRIX: 803->1|1042->67|1071->152|1098->153|1169->199|1213->235|1252->237|1282->240|1355->287|1396->319|1436->321|1469->327|1540->371|1554->376|1590->391|1623->397|1663->407|1695->412|2001->691|2027->708|2067->710|2116->731|2226->814|2266->838|2306->840|2355->861|2416->895|2426->896|2463->912|2525->947|2535->948|2579->971|2648->1013|2696->1040|2758->1075|2768->1076|2803->1090|2872->1132|2924->1163|3008->1216|3079->1256|3110->1260|3286->1409|3344->1445
                  LINES: 27->1|34->1|37->7|38->8|39->9|39->9|39->9|42->12|45->15|45->15|45->15|46->16|47->17|47->17|47->17|48->18|49->19|51->21|63->33|63->33|63->33|64->34|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|69->39|70->40|70->40|70->40|71->41|71->41|73->43|74->44|75->45|79->49|79->49
                  -- GENERATED --
              */
          