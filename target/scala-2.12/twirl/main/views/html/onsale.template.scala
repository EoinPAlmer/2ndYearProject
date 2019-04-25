
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

object onsale extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.ProductOnSale],List[models.products.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.products.ProductOnSale],categories: List[models.products.Category],
user: models.users.User,env:play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("products", user)/*3.24*/ {_display_(Seq[Any](format.raw/*3.26*/("""
    """),format.raw/*4.5*/("""<div class="container">

        <h2 class = "text-center text-muted"><span class = "logo">Sneaker Sanctuary</span> Products In Stock</h2>

        """),_display_(/*8.10*/if(flash.containsKey("success"))/*8.42*/ {_display_(Seq[Any](format.raw/*8.44*/("""
            """),format.raw/*9.13*/("""<div class="alert alert-success">
            """),_display_(/*10.14*/flash/*10.19*/.get("success")),format.raw/*10.34*/("""
            """),format.raw/*11.13*/("""</div>

        """)))}),format.raw/*13.10*/("""

        """),format.raw/*15.9*/("""<div class="row">

            <div class = "col-lg-6 col-md-6 col-sm-12 col-xs-12 col-centered">
            <h3 class = "text-center text-muted">Categories</h3>

                    <a href=""""),_display_(/*20.31*/routes/*20.37*/.HomeController.onsale(0)),format.raw/*20.62*/(""""><button class = "btn btn-lg btn-Dark">All Categories
                       </button></a>
                    """),_display_(/*22.22*/for(c <- categories) yield /*22.42*/{_display_(Seq[Any](format.raw/*22.43*/("""

                        """),format.raw/*24.25*/("""<a href = """"),_display_(/*24.37*/routes/*24.43*/.HomeController.onsale(c.getId)),format.raw/*24.74*/(""""><button class = "btn btn-lg btn-Dark">"""),_display_(/*24.115*/c/*24.116*/.getName),format.raw/*24.124*/("""
                        """),format.raw/*25.25*/("""<span class = "badge">"""),_display_(/*25.48*/c/*25.49*/.getProducts.size()),format.raw/*25.68*/("""</span></button>
                        </a>
                    """)))}),format.raw/*27.22*/("""
            """),format.raw/*28.13*/("""</div>

            <br>

            <!-- <div class = "col-lg-6 col-md-1 col-sm-6 col-xs-6 col-centered">
                        <div id="actions">
                                <form action=""""),_display_(/*34.48*/routes/*34.54*/.HomeController.onsale(0)),format.raw/*34.79*/("""" method="GET">
                                <input type="search" id="searchbox" name="" value="" placeholder="Filter by product name...">
                                <input type="submit" id="searchsubmit" value="Filter by name" class="form-control">
                            </form>
                           </div>

                        </div> -->
            



            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                """),_display_(/*47.18*/for(p <- products) yield /*47.36*/ {_display_(Seq[Any](format.raw/*47.38*/("""
                    """),format.raw/*48.21*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
                        <div class="thumbnail">
                        
                            <div class="caption">
                                    <img src="/assets/images/productImages/"""),_display_(/*52.77*/(p.getId + ".jpg")),format.raw/*52.95*/("""" alt="..." height="260" width="310">
                                <h3 class="text-center">"""),_display_(/*53.58*/p/*53.59*/.getName),format.raw/*53.67*/("""</h3>
                                <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*54.103*/("€"+(p.getPrice))),format.raw/*54.121*/("""</h4>
                                <p class="text-center"><b>Size:</b> """),_display_(/*55.70*/p/*55.71*/.getSize),format.raw/*55.79*/("""</p>
                                <p class="text-center"><b>Stock:</b> """),_display_(/*56.71*/p/*56.72*/.getStock),format.raw/*56.81*/("""</p>
                                <p class="text-center"><b>Brand:</b> """),_display_(/*57.71*/p/*57.72*/.getBrand),format.raw/*57.81*/("""</p>
                                """),_display_(/*58.34*/if((user != null) && ("Admin".equals(user.getRole())))/*58.88*/ {_display_(Seq[Any](format.raw/*58.90*/("""
                                    """),format.raw/*59.37*/("""<p class = "text-center"><a href=""""),_display_(/*59.72*/routes/*59.78*/.HomeController.deleteProduct(p.getId)),format.raw/*59.116*/(""""
                                    onclick="return confirmDel();">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-trash"></span> </button>
                                    </a>
                                    </p>
                                    <p class = "text-center"><a href=""""),_display_(/*64.72*/routes/*64.78*/.HomeController.updateProduct(p.getId)),format.raw/*64.116*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-pencil"></span> </button>
                                    </a>
                                    </p>
                                    """),_display_(/*68.38*/if(p.getStock() == 0)/*68.59*/{_display_(Seq[Any](format.raw/*68.60*/("""
                                        """),format.raw/*69.41*/("""<td><img scr="asset/images/oos.jpg"/>
                                         </td>
                                    """)))}),format.raw/*71.38*/("""
                                    
                                """)))}),format.raw/*73.34*/("""

                                """),_display_(/*75.34*/if((user != null) && ("customer".equals(user.getRole())))/*75.91*/ {_display_(Seq[Any](format.raw/*75.93*/("""
                                    """),format.raw/*76.37*/("""<p class = "text-center"><a href=""""),_display_(/*76.72*/routes/*76.78*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*76.112*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> </button>
                                    </a>
                              """)))}),format.raw/*79.32*/("""
                            """),format.raw/*80.29*/("""</div>
                        </div>
                    </div>
                """)))}),format.raw/*83.18*/(""" """),format.raw/*83.19*/("""<!--End of the loop-->
            </div><!--End of product bounds-->
            <!-- /.column-->
        </div>
            <!-- /.row-->
    </div>
                </td>
            """)))}),format.raw/*90.14*/("""
        
        """),format.raw/*92.9*/("""</tbody>
    </table>
    """),_display_(/*94.6*/if((user != null) && ("admin".equals(user.getRole())))/*94.60*/ {_display_(Seq[Any](format.raw/*94.62*/("""
    """),format.raw/*95.5*/("""<p>
        <a href=""""),_display_(/*96.19*/routes/*96.25*/.HomeController.addProduct()),format.raw/*96.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*100.6*/("""

"""),format.raw/*102.1*/("""</div>
 """))
      }
    }
  }

  def render(products:List[models.products.ProductOnSale],categories:List[models.products.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.products.ProductOnSale],List[models.products.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 25 13:31:20 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: 309dcfe14b85c07044995eb582c2b14f1bb9c73d
                  MATRIX: 1048->1|1282->143|1312->165|1351->167|1382->172|1557->321|1597->353|1636->355|1676->368|1750->415|1764->420|1800->435|1841->448|1889->465|1926->475|2147->669|2162->675|2208->700|2348->813|2384->833|2423->834|2477->860|2516->872|2531->878|2583->909|2652->950|2663->951|2693->959|2746->984|2796->1007|2806->1008|2846->1027|2944->1094|2985->1107|3210->1305|3225->1311|3271->1336|3781->1819|3815->1837|3855->1839|3904->1860|4189->2118|4228->2136|4350->2231|4360->2232|4389->2240|4525->2348|4565->2366|4667->2441|4677->2442|4706->2450|4808->2525|4818->2526|4848->2535|4950->2610|4960->2611|4990->2620|5055->2658|5118->2712|5158->2714|5223->2751|5285->2786|5300->2792|5360->2830|5748->3191|5763->3197|5823->3235|6111->3496|6141->3517|6180->3518|6249->3559|6402->3681|6504->3752|6566->3787|6632->3844|6672->3846|6737->3883|6799->3918|6814->3924|6870->3958|7122->4179|7179->4208|7292->4290|7321->4291|7538->4477|7583->4495|7636->4522|7699->4576|7739->4578|7771->4583|7820->4605|7835->4611|7884->4639|8013->4737|8043->4739
                  LINES: 28->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|46->15|51->20|51->20|51->20|53->22|53->22|53->22|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|59->28|65->34|65->34|65->34|78->47|78->47|78->47|79->48|83->52|83->52|84->53|84->53|84->53|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|90->59|90->59|95->64|95->64|95->64|99->68|99->68|99->68|100->69|102->71|104->73|106->75|106->75|106->75|107->76|107->76|107->76|107->76|110->79|111->80|114->83|114->83|121->90|123->92|125->94|125->94|125->94|126->95|127->96|127->96|127->96|131->100|133->102
                  -- GENERATED --
              */
          