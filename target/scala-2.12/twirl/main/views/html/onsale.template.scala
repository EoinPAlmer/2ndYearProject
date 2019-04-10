
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

        <h2 class = "text-center text-muted"><span class = "logo">Sneaker Sancturay</span> Products In Stock</h2>

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

            <div class = "col-lg-6 col-md-6 col-sm-12 col-xs-12 col-centered">
                        <div id="actions">
                             """),_display_(/*34.31*/for(c <- categories) yield /*34.51*/{_display_(Seq[Any](format.raw/*34.52*/("""
                                """),format.raw/*35.33*/("""<form action=""""),_display_(/*35.48*/routes/*35.54*/.HomeController.onsale()),format.raw/*35.78*/("""" method="GET">
                               <input type="search" id="searchbox" name="filter" value="Filter" placeholder="Filter by product name...">
                               <input type="submit" id="searchsubmit" value="Filter by name" class="btn-md btn-primary">""")))}),format.raw/*37.122*/("""
                            """),format.raw/*38.29*/("""</form>
                           </div>

                </div>

            <br>

            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                """),_display_(/*47.18*/for(p <- products) yield /*47.36*/ {_display_(Seq[Any](format.raw/*47.38*/("""
                    """),format.raw/*48.21*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
                        <div class="thumbnail">
                            """),_display_(/*50.30*/if(env.resource("public/images/productImages/" + p.getId + "thumb.jpg").isDefined)/*50.112*/{_display_(Seq[Any](format.raw/*50.113*/("""
                                """),format.raw/*51.33*/("""<img src="/assets/images/productImages/"""),_display_(/*51.73*/(p.getId + "thumb.jpg")),format.raw/*51.96*/("""" alt="...">
                            """)))}/*52.30*/else/*52.34*/{_display_(Seq[Any](format.raw/*52.35*/("""
                                """),format.raw/*53.33*/("""<img src=""""),_display_(/*53.44*/routes/*53.50*/.Assets.versioned("images/productplaceholder.svg")),format.raw/*53.100*/("""" alt="...">
                            """)))}),format.raw/*54.30*/("""

                            """),format.raw/*56.29*/("""<div class="caption">
                                <h3 class="text-center">"""),_display_(/*57.58*/p/*57.59*/.getName),format.raw/*57.67*/("""</h3>
                                <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*58.103*/("%.2f".format(p.getPrice))),format.raw/*58.130*/("""</h4>
                                <p class="text-center"><b>Size:</b> """),_display_(/*59.70*/p/*59.71*/.getSize),format.raw/*59.79*/("""</p>
                                <p class="text-center"><b>Stock:</b> """),_display_(/*60.71*/p/*60.72*/.getStock),format.raw/*60.81*/("""</p>
                                <p class="text-center"><b>Brand:</b> """),_display_(/*61.71*/p/*61.72*/.getBrand),format.raw/*61.81*/("""</p>
                                """),_display_(/*62.34*/if((user != null) && ("Admin".equals(user.getRole())))/*62.88*/ {_display_(Seq[Any](format.raw/*62.90*/("""
                                    """),format.raw/*63.37*/("""<p class = "text-center"><a href=""""),_display_(/*63.72*/routes/*63.78*/.HomeController.deleteProduct(p.getId)),format.raw/*63.116*/(""""
                                    onclick="return confirmDel();">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-trash"></span> </button>
                                    </a>
                                    </p>
                                    <p class = "text-center"><a href=""""),_display_(/*68.72*/routes/*68.78*/.HomeController.updateProduct(p.getId)),format.raw/*68.116*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-pencil"></span> </button>
                                    </a>
                                    </p>
                                    """),_display_(/*72.38*/if(p.getStock() == 0)/*72.59*/{_display_(Seq[Any](format.raw/*72.60*/("""
                                        """),format.raw/*73.41*/("""<td><img scr="asset/images/oos.jpg"/>
                                         </td>
                                    """)))}),format.raw/*75.38*/("""
                                    
                                """)))}),format.raw/*77.34*/("""

                                """),_display_(/*79.34*/if((user != null) && ("customer".equals(user.getRole())))/*79.91*/ {_display_(Seq[Any](format.raw/*79.93*/("""
                                    """),format.raw/*80.37*/("""<p class = "text-center"><a href=""""),_display_(/*80.72*/routes/*80.78*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*80.112*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> </button>
                                    </a>
                              """)))}),format.raw/*83.32*/("""
                            """),format.raw/*84.29*/("""</div>
                        </div>
                    </div>
                """)))}),format.raw/*87.18*/(""" """),format.raw/*87.19*/("""<!--End of the loop-->
            </div><!--End of product bounds-->
            <!-- /.column-->
        </div>
            <!-- /.row-->
    </div>
                </td>
            """)))}),format.raw/*94.14*/("""
        
        """),format.raw/*96.9*/("""</tbody>
    </table>
    """),_display_(/*98.6*/if((user != null) && ("admin".equals(user.getRole())))/*98.60*/ {_display_(Seq[Any](format.raw/*98.62*/("""
    """),format.raw/*99.5*/("""<p>
        <a href=""""),_display_(/*100.19*/routes/*100.25*/.HomeController.addProduct()),format.raw/*100.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*104.6*/("""

"""),format.raw/*106.1*/("""</div>
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
                  DATE: Wed Apr 10 15:59:30 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: 7f6951f1699481334e98c86e8caea03b9486e416
                  MATRIX: 1048->1|1282->143|1312->165|1351->167|1382->172|1557->321|1597->353|1636->355|1676->368|1750->415|1764->420|1800->435|1841->448|1889->465|1926->475|2147->669|2162->675|2208->700|2348->813|2384->833|2423->834|2477->860|2516->872|2531->878|2583->909|2652->950|2663->951|2693->959|2746->984|2796->1007|2806->1008|2846->1027|2944->1094|2985->1107|3190->1285|3226->1305|3265->1306|3326->1339|3368->1354|3383->1360|3428->1384|3734->1658|3791->1687|4006->1875|4040->1893|4080->1895|4129->1916|4292->2052|4384->2134|4424->2135|4485->2168|4552->2208|4596->2231|4657->2273|4670->2277|4709->2278|4770->2311|4808->2322|4823->2328|4895->2378|4968->2420|5026->2450|5132->2529|5142->2530|5171->2538|5307->2646|5356->2673|5458->2748|5468->2749|5497->2757|5599->2832|5609->2833|5639->2842|5741->2917|5751->2918|5781->2927|5846->2965|5909->3019|5949->3021|6014->3058|6076->3093|6091->3099|6151->3137|6539->3498|6554->3504|6614->3542|6902->3803|6932->3824|6971->3825|7040->3866|7193->3988|7295->4059|7357->4094|7423->4151|7463->4153|7528->4190|7590->4225|7605->4231|7661->4265|7913->4486|7970->4515|8083->4597|8112->4598|8329->4784|8374->4802|8427->4829|8490->4883|8530->4885|8562->4890|8612->4912|8628->4918|8678->4946|8807->5044|8837->5046
                  LINES: 28->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|46->15|51->20|51->20|51->20|53->22|53->22|53->22|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|59->28|65->34|65->34|65->34|66->35|66->35|66->35|66->35|68->37|69->38|78->47|78->47|78->47|79->48|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|84->53|84->53|84->53|84->53|85->54|87->56|88->57|88->57|88->57|89->58|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|94->63|94->63|94->63|94->63|99->68|99->68|99->68|103->72|103->72|103->72|104->73|106->75|108->77|110->79|110->79|110->79|111->80|111->80|111->80|111->80|114->83|115->84|118->87|118->87|125->94|127->96|129->98|129->98|129->98|130->99|131->100|131->100|131->100|135->104|137->106
                  -- GENERATED --
              */
          