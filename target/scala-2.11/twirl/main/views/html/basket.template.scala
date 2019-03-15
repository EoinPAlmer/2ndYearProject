
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basket_Scope0 {
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current
import models.Products._

Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*7.2*/main("Shopping Basket", customer)/*7.35*/ {_display_(Seq[Any](format.raw/*7.37*/("""


"""),format.raw/*10.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*13.4*/if(flash.containsKey("success"))/*13.36*/ {_display_(Seq[Any](format.raw/*13.38*/("""
			  """),format.raw/*14.6*/("""<div class="alert alert-success">
			      """),_display_(/*15.11*/flash/*15.16*/.get("success")),format.raw/*15.31*/("""
			  """),format.raw/*16.6*/("""</div>
		""")))}),format.raw/*17.4*/(""" 

		
        """),format.raw/*20.9*/("""<div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*22.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*22.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*28.31*/routes/*28.37*/.ShoppingCtrl.emptyBasket()),format.raw/*28.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*34.31*/routes/*34.37*/.ShoppingCtrl.placeOrder()),format.raw/*34.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*44.24*/("""{"""),format.raw/*44.25*/("""
		"""),format.raw/*45.3*/("""return confirm('Are you sure?');
	"""),format.raw/*46.2*/("""}"""),format.raw/*46.3*/("""
"""),format.raw/*47.1*/("""</script>

<table class="table table-bordered table-hover table-condensed">
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
        """),_display_(/*63.10*/if(Customer.getBasket() != null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
            """),format.raw/*64.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*65.14*/for(i <- customer.getBasket().getBasketItems()) yield /*65.61*/ {_display_(Seq[Any](format.raw/*65.63*/("""
            """),format.raw/*66.13*/("""<tr>
                <td>"""),_display_(/*67.22*/i/*67.23*/.getProducts.getName),format.raw/*67.43*/("""</td>
                <td>"""),_display_(/*68.22*/i/*68.23*/.getProducts.getDescription()),format.raw/*68.52*/("""</td>
                <td>&euro; """),_display_(/*69.29*/("%.2f".format(i.getPrice))),format.raw/*69.56*/("""</td>
                <td>&euro; """),_display_(/*70.29*/("%.2f".format(i.getItemTotal))),format.raw/*70.60*/("""</td>
                <td>"""),_display_(/*71.22*/i/*71.23*/.getQuantity()),format.raw/*71.37*/("""</td>
                <td><a href=""""),_display_(/*72.31*/routes/*72.37*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*72.69*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                <td><a href=""""),_display_(/*73.31*/routes/*73.37*/.ShoppingCtrl.addOne(i.getId)),format.raw/*73.66*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
            </tr>
            """)))}),format.raw/*75.14*/("""<!-- End of For loop -->
      """)))}),format.raw/*76.8*/("""
    """),format.raw/*77.5*/("""</tbody>
</table>
""")))}))
      }
    }
  }

  def render(customer:models.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Fri Mar 15 12:46:30 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 0c83bd3975964e825da3a3ea2acc6651fd879476
                  MATRIX: 756->1|931->28|959->86|986->87|1057->133|1098->166|1137->168|1167->171|1240->218|1281->250|1321->252|1354->258|1425->302|1439->307|1475->322|1508->328|1548->338|1589->352|1738->474|1810->524|2017->704|2032->710|2080->737|2402->1032|2417->1038|2464->1064|2791->1363|2820->1364|2850->1367|2911->1401|2939->1402|2967->1403|3334->1743|3375->1775|3415->1777|3456->1790|3558->1865|3621->1912|3661->1914|3702->1927|3755->1953|3765->1954|3806->1974|3860->2001|3870->2002|3920->2031|3981->2065|4029->2092|4090->2126|4142->2157|4196->2184|4206->2185|4241->2199|4304->2235|4319->2241|4372->2273|4493->2367|4508->2373|4558->2402|4683->2496|4745->2528|4777->2533
                  LINES: 27->1|33->1|35->5|36->6|37->7|37->7|37->7|40->10|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|50->20|52->22|52->22|58->28|58->28|58->28|64->34|64->34|64->34|74->44|74->44|75->45|76->46|76->46|77->47|93->63|93->63|93->63|94->64|95->65|95->65|95->65|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|103->73|103->73|103->73|105->75|106->76|107->77
                  -- GENERATED --
              */
          