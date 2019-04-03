
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

object viewOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.Customer,play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: Wed Apr 03 15:17:49 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/viewOrder.scala.html
                  HASH: d74f6c1e9b48b815458e2b4598cf1391b859d0cd
                  MATRIX: 967->1|1073->38|1109->68|1141->94|1194->35|1222->119|1249->120|1320->166|1357->195|1396->197|1427->201|1480->228|1521->260|1561->262|1594->268|1665->312|1679->317|1715->332|1748->338|1788->348|1858->390|1968->473|2014->503|2054->505|2108->531|2153->549|2163->550|2192->558|2821->1160|2862->1185|2902->1187|2956->1213|3017->1247|3027->1248|3054->1254|3116->1289|3126->1290|3168->1311|3230->1346|3240->1347|3283->1369|3352->1411|3402->1440|3471->1482|3526->1516|3635->1594|3866->1798|3920->1830|4031->1914|4046->1920|4103->1956|4247->2069
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|52->21|53->22|53->22|53->22|55->24|55->24|55->24|55->24|69->38|69->38|69->38|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|79->48|85->54|85->54|89->58|89->58|89->58|93->62
                  -- GENERATED --
              */
          