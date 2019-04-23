
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

            

            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                """),_display_(/*36.18*/for(p <- products) yield /*36.36*/ {_display_(Seq[Any](format.raw/*36.38*/("""
                    """),format.raw/*37.21*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
                        <div class="thumbnail">
                            """),_display_(/*39.30*/if(env.resource("public/images/productImages/" + p.getId + "thumb.jpg").isDefined)/*39.112*/{_display_(Seq[Any](format.raw/*39.113*/("""
                                """),format.raw/*40.33*/("""<img src="/assets/images/productImages/"""),_display_(/*40.73*/(p.getId + "thumb.jpg")),format.raw/*40.96*/("""" alt="..." height="242" width="200">
                            """)))}/*41.30*/else/*41.34*/{_display_(Seq[Any](format.raw/*41.35*/("""
                                """),format.raw/*42.33*/("""<img src=""""),_display_(/*42.44*/routes/*42.50*/.Assets.versioned("images/productplaceholder.svg")),format.raw/*42.100*/("""" alt="..." height="242" width="200">
                            """)))}),format.raw/*43.30*/("""

                            """),format.raw/*45.29*/("""<div class="caption">
                                <h3 class="text-center">"""),_display_(/*46.58*/p/*46.59*/.getName),format.raw/*46.67*/("""</h3>
                                <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*47.103*/("%.2f".format(p.getPrice))),format.raw/*47.130*/("""</h4>
                                <p class="text-center"><b>Size:</b> """),_display_(/*48.70*/p/*48.71*/.getSize),format.raw/*48.79*/("""</p>
                                <p class="text-center"><b>Stock:</b> """),_display_(/*49.71*/p/*49.72*/.getStock),format.raw/*49.81*/("""</p>
                                <p class="text-center"><b>Brand:</b> """),_display_(/*50.71*/p/*50.72*/.getBrand),format.raw/*50.81*/("""</p>
                                """),_display_(/*51.34*/if((user != null) && ("Admin".equals(user.getRole())))/*51.88*/ {_display_(Seq[Any](format.raw/*51.90*/("""
                                    """),format.raw/*52.37*/("""<p class = "text-center"><a href=""""),_display_(/*52.72*/routes/*52.78*/.HomeController.deleteProduct(p.getId)),format.raw/*52.116*/(""""
                                    onclick="return confirmDel();">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-trash"></span> </button>
                                    </a>
                                    </p>
                                    <p class = "text-center"><a href=""""),_display_(/*57.72*/routes/*57.78*/.HomeController.updateProduct(p.getId)),format.raw/*57.116*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-pencil"></span> </button>
                                    </a>
                                    </p>
                                    """),_display_(/*61.38*/if(p.getStock() == 0)/*61.59*/{_display_(Seq[Any](format.raw/*61.60*/("""
                                        """),format.raw/*62.41*/("""<td><img scr="asset/images/oos.jpg"/>
                                         </td>
                                    """)))}),format.raw/*64.38*/("""
                                    
                                """)))}),format.raw/*66.34*/("""

                                """),_display_(/*68.34*/if((user != null) && ("customer".equals(user.getRole())))/*68.91*/ {_display_(Seq[Any](format.raw/*68.93*/("""
                                    """),format.raw/*69.37*/("""<p class = "text-center"><a href=""""),_display_(/*69.72*/routes/*69.78*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*69.112*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> </button>
                                    </a>
                              """)))}),format.raw/*72.32*/("""
                            """),format.raw/*73.29*/("""</div>
                        </div>
                    </div>
                """)))}),format.raw/*76.18*/(""" """),format.raw/*76.19*/("""<!--End of the loop-->
            </div><!--End of product bounds-->
            <!-- /.column-->
        </div>
            <!-- /.row-->
    </div>
                </td>
            """)))}),format.raw/*83.14*/("""
        
        """),format.raw/*85.9*/("""</tbody>
    </table>
    """),_display_(/*87.6*/if((user != null) && ("admin".equals(user.getRole())))/*87.60*/ {_display_(Seq[Any](format.raw/*87.62*/("""
    """),format.raw/*88.5*/("""<p>
        <a href=""""),_display_(/*89.19*/routes/*89.25*/.HomeController.addProduct()),format.raw/*89.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*93.6*/("""

"""),format.raw/*95.1*/("""</div>
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
                  DATE: Tue Apr 23 14:13:30 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: c16db6ac21dca8739e7a3eb3304fe37df0545da5
                  MATRIX: 1048->1|1282->143|1312->165|1351->167|1382->172|1557->321|1597->353|1636->355|1676->368|1750->415|1764->420|1800->435|1841->448|1889->465|1926->475|2147->669|2162->675|2208->700|2348->813|2384->833|2423->834|2477->860|2516->872|2531->878|2583->909|2652->950|2663->951|2693->959|2746->984|2796->1007|2806->1008|2846->1027|2944->1094|2985->1107|3155->1250|3189->1268|3229->1270|3278->1291|3441->1427|3533->1509|3573->1510|3634->1543|3701->1583|3745->1606|3831->1673|3844->1677|3883->1678|3944->1711|3982->1722|3997->1728|4069->1778|4167->1845|4225->1875|4331->1954|4341->1955|4370->1963|4506->2071|4555->2098|4657->2173|4667->2174|4696->2182|4798->2257|4808->2258|4838->2267|4940->2342|4950->2343|4980->2352|5045->2390|5108->2444|5148->2446|5213->2483|5275->2518|5290->2524|5350->2562|5738->2923|5753->2929|5813->2967|6101->3228|6131->3249|6170->3250|6239->3291|6392->3413|6494->3484|6556->3519|6622->3576|6662->3578|6727->3615|6789->3650|6804->3656|6860->3690|7112->3911|7169->3940|7282->4022|7311->4023|7528->4209|7573->4227|7626->4254|7689->4308|7729->4310|7761->4315|7810->4337|7825->4343|7874->4371|8002->4469|8031->4471
                  LINES: 28->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|46->15|51->20|51->20|51->20|53->22|53->22|53->22|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|59->28|67->36|67->36|67->36|68->37|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|74->43|76->45|77->46|77->46|77->46|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|83->52|88->57|88->57|88->57|92->61|92->61|92->61|93->62|95->64|97->66|99->68|99->68|99->68|100->69|100->69|100->69|100->69|103->72|104->73|107->76|107->76|114->83|116->85|118->87|118->87|118->87|119->88|120->89|120->89|120->89|124->93|126->95
                  -- GENERATED --
              */
          