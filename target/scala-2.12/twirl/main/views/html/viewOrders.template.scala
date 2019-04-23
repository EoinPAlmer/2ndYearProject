
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
                                <th>Name</th>
                                <th>Size</th>
                                <th>Price</th>
                                <th>Total</th>
                            </tr>
                            </thead>
                            <tbody>
                        """),_display_(/*37.26*/for(i <- o.getProducts()) yield /*37.51*/ {_display_(Seq[Any](format.raw/*37.53*/("""

                        """),format.raw/*39.25*/("""<tr>
                        <td>"""),_display_(/*40.30*/i/*40.31*/.getProduct.getName()),format.raw/*40.52*/("""</td>
                        <td>"""),_display_(/*41.30*/i/*41.31*/.getProduct.getSize()),format.raw/*41.52*/("""</td>
                        <td>&euro; """),_display_(/*42.37*/("%.2f".format(i.getPrice()))),format.raw/*42.66*/("""</td>
                        <td>&euro; """),_display_(/*43.37*/("%.2f".format(i.getProductTotal))),format.raw/*43.71*/("""</td>
                        
                    </tr>
                    """)))}),format.raw/*46.22*/("""<!-- End of For loop -->
                    
			</tbody>
        </table>
        <div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Order Total: &euro; """),_display_(/*52.68*/("%.2f".format(o.getOrderTotal))),format.raw/*52.100*/("""</strong></p>
            </div>  
        </div>
        <p>
            <a href=""""),_display_(/*56.23*/routes/*56.29*/.ShoppingCtrl.cancelOrder(o.getId())),format.raw/*56.65*/("""">
              <button class="btn btn-primary">Cancel Order</button>
            </a>
          </p>
         """)))}),format.raw/*60.11*/("""<!-- End of For loop -->
       
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
        <div>

        </div>
        <script>

            function confirmDel()"""),format.raw/*83.34*/("""{"""),format.raw/*83.35*/("""
                """),format.raw/*84.17*/("""return confirm('Are you sure?');
            """),format.raw/*85.13*/("""}"""),format.raw/*85.14*/("""
    
                """),format.raw/*87.17*/("""$(document).ready(function () """),format.raw/*87.47*/("""{"""),format.raw/*87.48*/("""
    
                    """),format.raw/*89.21*/("""var docHeight = $(window).height();
                    var footerHeight = $('#footer').height();
                    var footerTop = $('#footer').position().top + footerHeight;
    
                    if (footerTop < docHeight) """),format.raw/*93.48*/("""{"""),format.raw/*93.49*/("""
                        """),format.raw/*94.25*/("""$('#footer').css('margin-top', 10 + (docHeight - footerTop) + 'px');
                    """),format.raw/*95.21*/("""}"""),format.raw/*95.22*/("""
                """),format.raw/*96.17*/("""}"""),format.raw/*96.18*/(""");
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
                  DATE: Tue Apr 23 19:48:48 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/viewOrders.scala.html
                  HASH: 900ef0bc6dab79a55abe95e797a84dc0b061c55e
                  MATRIX: 968->1|1074->38|1110->68|1142->94|1195->35|1223->119|1250->120|1321->166|1358->195|1397->197|1428->201|1481->228|1522->260|1562->262|1595->268|1666->312|1680->317|1716->332|1749->338|1789->348|1859->390|1969->473|2015->503|2055->505|2109->531|2154->549|2164->550|2193->558|2777->1115|2818->1140|2858->1142|2912->1168|2973->1202|2983->1203|3025->1224|3087->1259|3097->1260|3139->1281|3208->1323|3258->1352|3327->1394|3382->1428|3491->1506|3722->1710|3776->1742|3887->1826|3902->1832|3959->1868|4103->1981|4940->2790|4969->2791|5014->2808|5087->2853|5116->2854|5166->2876|5224->2906|5253->2907|5307->2933|5565->3163|5594->3164|5647->3189|5764->3278|5793->3279|5838->3296|5867->3297
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|52->21|53->22|53->22|53->22|55->24|55->24|55->24|55->24|68->37|68->37|68->37|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|74->43|74->43|77->46|83->52|83->52|87->56|87->56|87->56|91->60|114->83|114->83|115->84|116->85|116->85|118->87|118->87|118->87|120->89|124->93|124->93|125->94|126->95|126->95|127->96|127->96
                  -- GENERATED --
              */
          