
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

object viewOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

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
"""),_display_(/*9.2*/main("View Orders", customer)/*9.31*/ {_display_(Seq[Any](format.raw/*9.33*/("""


	"""),format.raw/*12.2*/("""<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		
               
                    """),format.raw/*21.21*/("""<!-- Start of For loop - For each p in products add a row -->
                    """),_display_(/*22.22*/for(o <- customer.getOrders()) yield /*22.52*/ {_display_(Seq[Any](format.raw/*22.54*/("""

                        """),format.raw/*24.25*/("""<p>Order Number: """),_display_(/*24.43*/o/*24.44*/.getId()),format.raw/*24.52*/("""</p>
                        <table class="table table-bordered table-hover table-condensed">
                        
                            <thead>
                            <!-- The header row-->
                            <tr>
                                <th>Id</th>
                                <th>Name</th>
                                <th>Stock</th>
                                <th>Price</th>
                                <th>Total</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*38.26*/for(i <- o.getProducts()) yield /*38.51*/ {_display_(Seq[Any](format.raw/*38.53*/("""

                        """),format.raw/*40.25*/("""<tr>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getId),format.raw/*41.37*/("""</td>
                        <td>"""),_display_(/*42.30*/i/*42.31*/.getProduct.getName()),format.raw/*42.52*/("""</td>
                        <td>"""),_display_(/*43.30*/i/*43.31*/.getProduct.getStock()),format.raw/*43.53*/("""</td>
                        <td>&euro; """),_display_(/*44.37*/("%.2f".format(i.getPrice()))),format.raw/*44.66*/("""</td>
                        <td>&euro; """),_display_(/*45.37*/("%.2f".format(i.getProductTotal))),format.raw/*45.71*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*48.22*/("""<!-- End of For loop -->
                    
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*54.68*/("%.2f".format(o.getOrderTotal))),format.raw/*54.100*/("""</strong></p>
            </div>  
        </div>
        <p>
            <a href=""""),_display_(/*58.23*/routes/*58.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*58.65*/("""">
              <button class="btn btn-primary">Cancel Order</button>
            </a>
          </p>
         """)))}),format.raw/*62.11*/("""<!-- End of For loop -->
       
        </div>

        <div class="col-md-6">
                <p class="text-right">
                    <form action="/placeOrder" method="GET">
                        <script
                                src="https://checkout.stripe.com/checkout.js"
                                class="stripe-button"
                                data-key="pk_test_nVuHEQ2ji0jXquT0vTfBj1NR0081TzqDj8"
                                data-name="SneakerSanctuary"
                                data-description="Payment"
                                data-amount="shopping\Basket\getBasketTotal()">
                        </script>
                    </form>
                </p>
        </div>
        


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
                  SOURCE: /home/wdd/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: 3fb963b3529902c105ad35f31a7fb4dde396963b
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1195->35|1223->119|1250->120|1321->166|1358->195|1397->197|1428->201|1481->228|1522->260|1562->262|1595->268|1666->312|1680->317|1716->332|1749->338|1789->348|1859->390|1969->473|2015->503|2055->505|2109->531|2154->549|2164->550|2193->558|2822->1160|2863->1185|2903->1187|2957->1213|3018->1247|3028->1248|3055->1254|3117->1289|3127->1290|3169->1311|3231->1346|3241->1347|3284->1369|3353->1411|3403->1440|3472->1482|3527->1516|3636->1594|3867->1798|3921->1830|4032->1914|4047->1920|4104->1956|4248->2069
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|52->21|53->22|53->22|53->22|55->24|55->24|55->24|55->24|69->38|69->38|69->38|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|79->48|85->54|85->54|89->58|89->58|89->58|93->62
                  -- GENERATED --
              */
          