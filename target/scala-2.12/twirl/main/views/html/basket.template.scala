
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

		
        """),format.raw/*22.9*/("""<div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*24.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*24.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*30.31*/routes/*30.37*/.ShoppingCtrl.emptyBasket()),format.raw/*30.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*36.31*/routes/*36.37*/.ShoppingCtrl.placeOrder()),format.raw/*36.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*46.24*/("""{"""),format.raw/*46.25*/("""
		"""),format.raw/*47.3*/("""return confirm('Are you sure?');
	"""),format.raw/*48.2*/("""}"""),format.raw/*48.3*/("""
"""),format.raw/*49.1*/("""</script>
""")))}),format.raw/*50.2*/("""
"""),format.raw/*51.1*/("""<table class="table table-bordered table-hover table-condensed">
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
        """),_display_(/*65.10*/if(customer.getBasket() != null)/*65.42*/ {_display_(Seq[Any](format.raw/*65.44*/("""
            """),format.raw/*66.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*67.14*/for(i <- customer.getBasket().getBasketItems()) yield /*67.61*/ {_display_(Seq[Any](format.raw/*67.63*/("""
            """),format.raw/*68.13*/("""<tr>
                <td>"""),_display_(/*69.22*/i/*69.23*/.getItem.getName),format.raw/*69.39*/("""</td>
                <td>"""),_display_(/*70.22*/i/*70.23*/.getItem.getDescription()),format.raw/*70.48*/("""</td>
                <td>&euro; """),_display_(/*71.29*/("%.2f".format(i.getPrice))),format.raw/*71.56*/("""</td>
                <td>&euro; """),_display_(/*72.29*/("%.2f".format(i.getItemTotal))),format.raw/*72.60*/("""</td>
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
                  DATE: Tue Mar 19 16:30:06 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: f0e4121ed5cc5aafde6c3e3b603cebdeccc184fe
                  MATRIX: 964->1|1070->38|1106->68|1138->94|1191->35|1219->119|1246->120|1317->166|1358->199|1397->201|1427->204|1500->251|1541->283|1581->285|1614->291|1685->335|1699->340|1735->355|1768->361|1808->371|1849->385|1998->507|2070->557|2277->737|2292->743|2340->770|2662->1065|2677->1071|2724->1097|3051->1396|3080->1397|3110->1400|3171->1434|3199->1435|3227->1436|3268->1447|3296->1448|3652->1777|3693->1809|3733->1811|3774->1824|3876->1899|3939->1946|3979->1948|4020->1961|4073->1987|4083->1988|4120->2004|4174->2031|4184->2032|4230->2057|4291->2091|4339->2118|4400->2152|4452->2183|4506->2210|4516->2211|4551->2225|4614->2261|4629->2267|4682->2299|4803->2393|4818->2399|4868->2428|4993->2522|5055->2554|5087->2559
                  LINES: 28->1|31->4|32->5|33->6|36->2|38->7|39->8|40->9|40->9|40->9|43->12|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|50->19|53->22|55->24|55->24|61->30|61->30|61->30|67->36|67->36|67->36|77->46|77->46|78->47|79->48|79->48|80->49|81->50|82->51|96->65|96->65|96->65|97->66|98->67|98->67|98->67|99->68|100->69|100->69|100->69|101->70|101->70|101->70|102->71|102->71|103->72|103->72|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|108->77|109->78|110->79
                  -- GENERATED --
              */
          