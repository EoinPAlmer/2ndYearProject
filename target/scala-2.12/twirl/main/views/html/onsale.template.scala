
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

            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                """),_display_(/*34.18*/for(p <- products) yield /*34.36*/ {_display_(Seq[Any](format.raw/*34.38*/("""
                    """),format.raw/*35.21*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
                        <div class="thumbnail">
                            """),_display_(/*37.30*/if(env.resource("public/images/productImages/" + p.getId + "thumb.jpg").isDefined)/*37.112*/{_display_(Seq[Any](format.raw/*37.113*/("""
                                """),format.raw/*38.33*/("""<img src="/assets/images/productImages/"""),_display_(/*38.73*/(p.getId + "thumb.jpg")),format.raw/*38.96*/("""" alt="...">
                            """)))}/*39.30*/else/*39.34*/{_display_(Seq[Any](format.raw/*39.35*/("""
                                """),format.raw/*40.33*/("""<img src=""""),_display_(/*40.44*/routes/*40.50*/.Assets.versioned("images/productplaceholder.svg")),format.raw/*40.100*/("""" alt="...">
                            """)))}),format.raw/*41.30*/("""

                            """),format.raw/*43.29*/("""<div class="caption">
                                <h3 class="text-center">"""),_display_(/*44.58*/p/*44.59*/.getName),format.raw/*44.67*/("""</h3>
                                <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*45.103*/("%.2f".format(p.getPrice))),format.raw/*45.130*/("""</h4>
                                <p class="text-center"><b>Size:</b> """),_display_(/*46.70*/p/*46.71*/.getSize),format.raw/*46.79*/("""</p>
                                <p class="text-center"><b>Stock:</b> """),_display_(/*47.71*/p/*47.72*/.getStock),format.raw/*47.81*/("""</p>
                                <p class="text-center"><b>Brand:</b> """),_display_(/*48.71*/p/*48.72*/.getBrand),format.raw/*48.81*/("""</p>
                                """),_display_(/*49.34*/if((user != null) && ("Admin".equals(user.getRole())))/*49.88*/ {_display_(Seq[Any](format.raw/*49.90*/("""
                                    """),format.raw/*50.37*/("""<p class = "text-center"><a href=""""),_display_(/*50.72*/routes/*50.78*/.HomeController.deleteProduct(p.getId)),format.raw/*50.116*/(""""
                                    onclick="return confirmDel();">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-trash thrashbutton"></span> </button>
                                    </a>
                                    </p>
                                    <p class = "text-center"><a href=""""),_display_(/*55.72*/routes/*55.78*/.HomeController.updateProduct(p.getId)),format.raw/*55.116*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-pencil thrashbutton"></span> </button>
                                    </a>
                                    </p>
                                    """),_display_(/*59.38*/if(p.getStock() == 0)/*59.59*/{_display_(Seq[Any](format.raw/*59.60*/("""
                                        """),format.raw/*60.41*/("""<td><img scr="asset/images/oos.jpg"/>
                                         </td>
                                    """)))}),format.raw/*62.38*/("""
                                """)))}),format.raw/*63.34*/("""
                            """),format.raw/*64.29*/("""</div>
                        </div>
                    </div>
                """)))}),format.raw/*67.18*/(""" """),format.raw/*67.19*/("""<!--End of the loop-->
            </div><!--End of product bounds-->
            <!-- /.column-->
        </div>
            <!-- /.row-->
    </div>
                </td>
            """)))}),format.raw/*74.14*/("""
        
        """),format.raw/*76.9*/("""</tbody>
    </table>
    """),_display_(/*78.6*/if((user != null) && ("admin".equals(user.getRole())))/*78.60*/ {_display_(Seq[Any](format.raw/*78.62*/("""
    """),format.raw/*79.5*/("""<p>
        <a href=""""),_display_(/*80.19*/routes/*80.25*/.HomeController.addProduct()),format.raw/*80.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*84.6*/("""

"""),format.raw/*86.1*/("""</div>
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
                  DATE: Wed Apr 10 03:31:30 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: 028e4ff7c090ac80198b275e2d12b4987da16452
                  MATRIX: 1048->1|1282->143|1312->165|1351->167|1382->172|1557->321|1597->353|1636->355|1676->368|1750->415|1764->420|1800->435|1841->448|1889->465|1926->475|2147->669|2162->675|2208->700|2348->813|2384->833|2423->834|2477->860|2516->872|2531->878|2583->909|2652->950|2663->951|2693->959|2746->984|2796->1007|2806->1008|2846->1027|2944->1094|2985->1107|3141->1236|3175->1254|3215->1256|3264->1277|3427->1413|3519->1495|3559->1496|3620->1529|3687->1569|3731->1592|3792->1634|3805->1638|3844->1639|3905->1672|3943->1683|3958->1689|4030->1739|4103->1781|4161->1811|4267->1890|4277->1891|4306->1899|4442->2007|4491->2034|4593->2109|4603->2110|4632->2118|4734->2193|4744->2194|4774->2203|4876->2278|4886->2279|4916->2288|4981->2326|5044->2380|5084->2382|5149->2419|5211->2454|5226->2460|5286->2498|5687->2872|5702->2878|5762->2916|6063->3190|6093->3211|6132->3212|6201->3253|6354->3375|6419->3409|6476->3438|6589->3520|6618->3521|6835->3707|6880->3725|6933->3752|6996->3806|7036->3808|7068->3813|7117->3835|7132->3841|7181->3869|7309->3967|7338->3969
                  LINES: 28->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|46->15|51->20|51->20|51->20|53->22|53->22|53->22|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|59->28|65->34|65->34|65->34|66->35|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|71->40|72->41|74->43|75->44|75->44|75->44|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|81->50|86->55|86->55|86->55|90->59|90->59|90->59|91->60|93->62|94->63|95->64|98->67|98->67|105->74|107->76|109->78|109->78|109->78|110->79|111->80|111->80|111->80|115->84|117->86
                  -- GENERATED --
              */
          