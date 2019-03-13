
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

class basket extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User.Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customer: models.User.Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import play.api.Play.current
import models.products._

Seq[Any](format.raw/*1.34*/("""

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
        """),_display_(/*63.10*/if(customer.getBasket() != null)/*63.42*/ {_display_(Seq[Any](format.raw/*63.44*/("""
            """),format.raw/*64.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*65.14*/for(i <- customer.getBasket().getBasketItems()) yield /*65.61*/ {_display_(Seq[Any](format.raw/*65.63*/("""
            """),format.raw/*66.13*/("""<tr>
                <td>"""),_display_(/*67.22*/i/*67.23*/.getItem.getName),format.raw/*67.39*/("""</td>
                <td>"""),_display_(/*68.22*/i/*68.23*/.getItem.getDescription()),format.raw/*68.48*/("""</td>
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

  def render(customer:models.User.Customer): play.twirl.api.HtmlFormat.Appendable = apply(customer)

  def f:((models.User.Customer) => play.twirl.api.HtmlFormat.Appendable) = (customer) => apply(customer)

  def ref: this.type = this

}


}

/**/
object basket extends basket_Scope0.basket
              /*
                  -- GENERATED --
                  DATE: Wed Mar 13 17:13:12 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 93492a7cf83aaf4ef0708653c92d015589f1fa0f
                  MATRIX: 761->1|941->33|969->91|996->92|1067->138|1108->171|1147->173|1177->176|1250->223|1291->255|1331->257|1364->263|1435->307|1449->312|1485->327|1518->333|1558->343|1599->357|1748->479|1820->529|2027->709|2042->715|2090->742|2412->1037|2427->1043|2474->1069|2801->1368|2830->1369|2860->1372|2921->1406|2949->1407|2977->1408|3344->1748|3385->1780|3425->1782|3466->1795|3568->1870|3631->1917|3671->1919|3712->1932|3765->1958|3775->1959|3812->1975|3866->2002|3876->2003|3922->2028|3983->2062|4031->2089|4092->2123|4144->2154|4198->2181|4208->2182|4243->2196|4306->2232|4321->2238|4374->2270|4495->2364|4510->2370|4560->2399|4685->2493|4747->2525|4779->2530
                  LINES: 27->1|33->1|35->5|36->6|37->7|37->7|37->7|40->10|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|47->17|50->20|52->22|52->22|58->28|58->28|58->28|64->34|64->34|64->34|74->44|74->44|75->45|76->46|76->46|77->47|93->63|93->63|93->63|94->64|95->65|95->65|95->65|96->66|97->67|97->67|97->67|98->68|98->68|98->68|99->69|99->69|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|103->73|103->73|103->73|105->75|106->76|107->77
                  -- GENERATED --
              */
          