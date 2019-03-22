
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
/*4.2*/import helper._
/*5.2*/import play.api.Play.current
/*6.2*/import models.shopping._
/*7.2*/import models.products._
/*8.2*/import models.users._


Seq[Any](format.raw/*2.1*/("""(products: List[models.products.Product],categories: List[models.products.Category], user: models.users.User, env: play.api.Environment)

"""),format.raw/*9.1*/("""
"""),format.raw/*10.1*/("""<!-- Pass page title and user on to main -->
"""),_display_(/*11.2*/main("Shopping Basket", customer)/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""


"""),format.raw/*14.1*/("""<div class="row">

	<div class="col-md-12">
		"""),_display_(/*17.4*/if(flash.containsKey("success"))/*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
			  """),format.raw/*18.6*/("""<div class="alert alert-success">
			      """),_display_(/*19.11*/flash/*19.16*/.get("success")),format.raw/*19.31*/("""
			  """),format.raw/*20.6*/("""</div>
		""")))}),format.raw/*21.4*/(""" 

		
        """),format.raw/*24.9*/("""<div class="row">
            <div class="col-md-12">
                <p class="text-right"><strong>Basket Total: &euro; """),_display_(/*26.69*/("%.2f".format(customer.getBasket.getBasketTotal))),format.raw/*26.119*/("""</strong></p>
            </div>  
        </div>
        <div class="row">
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*32.31*/routes/*32.37*/.ShoppingCtrl.emptyBasket()),format.raw/*32.64*/("""" class="btn btn-danger btn-sm" onclick="return confirmDel();">
                    <span class="glyphicon glyphicon-trash"></span> Empty Basket</a>
                </p>
            </div>  
            <div class="col-md-6">
                <p class="text-right">
                    <a href=""""),_display_(/*38.31*/routes/*38.37*/.ShoppingCtrl.placeOrder()),format.raw/*38.63*/("""" class="btn btn-success btn-sm">
                    <span class="glyphicon glyphicon-euro"></span> Place Order</a>
                </p>
            </div>  
        </div>
    </div>
</div>

<script>
	// JavaScript function returns true if user clicks yes, otherwise, false
	function confirmDel() """),format.raw/*48.24*/("""{"""),format.raw/*48.25*/("""
		"""),format.raw/*49.3*/("""return confirm('Are you sure?');
	"""),format.raw/*50.2*/("""}"""),format.raw/*50.3*/("""
"""),format.raw/*51.1*/("""</script>
""")))}),format.raw/*52.2*/("""
"""),format.raw/*53.1*/("""<table class="table table-bordered table-hover table-condensed">
    <thead>
    <!-- The header row-->
    <tr>
        <th>Name</th>
        <th>Brand</th>
        <th>Size</th>
        <th>Price</th>
        <th>Total</th>
        <th>Quantity</th>
    </tr>
    </thead>
    <tbody>
        """),_display_(/*66.10*/if(customer.getBasket() != null)/*66.42*/ {_display_(Seq[Any](format.raw/*66.44*/("""
            """),format.raw/*67.13*/("""<!-- Start of For loop - For each p in products add a row -->
            """),_display_(/*68.14*/for(i <- customer.getBasket().getBasketProduct()) yield /*68.63*/ {_display_(Seq[Any](format.raw/*68.65*/("""
            """),format.raw/*69.13*/("""<tr>
                <td>"""),_display_(/*70.22*/i/*70.23*/.getName),format.raw/*70.31*/("""</td>
                <td>"""),_display_(/*71.22*/i/*71.23*/.getBrand()),format.raw/*71.34*/("""</td>
                <td>&euro; """),_display_(/*72.29*/("%.2f".format(i.getPrice))),format.raw/*72.56*/("""</td>
                <td>&euro; """),_display_(/*73.29*/("%.2f".format(i.getProductTotal))),format.raw/*73.63*/("""</td>
                <td>"""),_display_(/*74.22*/i/*74.23*/.getQuantity()),format.raw/*74.37*/("""</td>
                <td><a href=""""),_display_(/*75.31*/routes/*75.37*/.ShoppingCtrl.removeOne(i.getId)),format.raw/*75.69*/(""""><span class="glyphicon glyphicon-minus-sign"></span></a></td>
                <td><a href=""""),_display_(/*76.31*/routes/*76.37*/.ShoppingCtrl.addOne(i.getId)),format.raw/*76.66*/(""""><span class="glyphicon glyphicon-plus-sign"></span></a></td>
            </tr>
            """)))}),format.raw/*78.14*/("""<!-- End of For loop -->
      """)))}),format.raw/*79.8*/("""
    """),format.raw/*80.5*/("""</tbody>
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
                  DATE: Fri Mar 22 12:24:04 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/basket.scala.html
                  HASH: 83ffd7dc8e897ff2aa4f5af1a01f4431f0c60733
                  MATRIX: 964->1|1070->174|1093->191|1129->221|1161->247|1193->273|1243->35|1407->295|1435->296|1507->342|1549->375|1589->377|1619->380|1692->427|1733->459|1773->461|1806->467|1877->511|1891->516|1927->531|1960->537|2000->547|2041->561|2190->683|2262->733|2469->913|2484->919|2532->946|2854->1241|2869->1247|2916->1273|3243->1572|3272->1573|3302->1576|3363->1610|3391->1611|3419->1612|3460->1623|3488->1624|3811->1920|3852->1952|3892->1954|3933->1967|4035->2042|4100->2091|4140->2093|4181->2106|4234->2132|4244->2133|4273->2141|4327->2168|4337->2169|4369->2180|4430->2214|4478->2241|4539->2275|4594->2309|4648->2336|4658->2337|4693->2351|4756->2387|4771->2393|4824->2425|4945->2519|4960->2525|5010->2554|5135->2648|5197->2680|5229->2685
                  LINES: 28->1|31->4|32->5|33->6|34->7|35->8|38->2|40->9|41->10|42->11|42->11|42->11|45->14|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|52->21|55->24|57->26|57->26|63->32|63->32|63->32|69->38|69->38|69->38|79->48|79->48|80->49|81->50|81->50|82->51|83->52|84->53|97->66|97->66|97->66|98->67|99->68|99->68|99->68|100->69|101->70|101->70|101->70|102->71|102->71|102->71|103->72|103->72|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|109->78|110->79|111->80
                  -- GENERATED --
              */
          