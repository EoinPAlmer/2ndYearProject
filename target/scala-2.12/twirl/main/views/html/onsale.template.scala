
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

            <div class = "col-lg-6 col-md-6 col-sm-12 col-xs-12 col-centered">
                        <div id="actions">
                                <form action=""""),_display_(/*34.48*/routes/*34.54*/.HomeController.onsale(0)),format.raw/*34.79*/("""" method="GET">
                               <input type="search" id="searchbox" name="" value="" placeholder="Filter by product name...">
                               <input type="submit" id="searchsubmit" value="Filter by name" class="form-control">
                            </form>
                           </div>

            </div>

            <!-- <div id="actions">
                <form action=""""),_display_(/*43.32*/routes/*43.38*/.HomeController.onsale(0)),format.raw/*43.63*/("""" method="GET">
                <input type="search" id="searchbox">
                <input class="form-control" type="text" placeholder="Search" aria-label="Search">
            </div>
            <br> -->

            <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                """),_display_(/*51.18*/for(p <- products) yield /*51.36*/ {_display_(Seq[Any](format.raw/*51.38*/("""
                    """),format.raw/*52.21*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
                        <div class="thumbnail">
                            """),_display_(/*54.30*/if(env.resource("public/images/productImages/" + p.getId + "thumb.jpg").isDefined)/*54.112*/{_display_(Seq[Any](format.raw/*54.113*/("""
                                """),format.raw/*55.33*/("""<img src="/assets/images/productImages/"""),_display_(/*55.73*/(p.getId + "thumb.jpg")),format.raw/*55.96*/("""" alt="..." height="242" width="200">
                            """)))}/*56.30*/else/*56.34*/{_display_(Seq[Any](format.raw/*56.35*/("""
                                """),format.raw/*57.33*/("""<img src=""""),_display_(/*57.44*/routes/*57.50*/.Assets.versioned("images/productplaceholder.svg")),format.raw/*57.100*/("""" alt="..." height="242" width="200">
                            """)))}),format.raw/*58.30*/("""

                            """),format.raw/*60.29*/("""<div class="caption">
                                <h3 class="text-center">"""),_display_(/*61.58*/p/*61.59*/.getName),format.raw/*61.67*/("""</h3>
                                <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*62.103*/("%.2f".format(p.getPrice))),format.raw/*62.130*/("""</h4>
                                <p class="text-center"><b>Size:</b> """),_display_(/*63.70*/p/*63.71*/.getSize),format.raw/*63.79*/("""</p>
                                <p class="text-center"><b>Stock:</b> """),_display_(/*64.71*/p/*64.72*/.getStock),format.raw/*64.81*/("""</p>
                                <p class="text-center"><b>Brand:</b> """),_display_(/*65.71*/p/*65.72*/.getBrand),format.raw/*65.81*/("""</p>
                                """),_display_(/*66.34*/if((user != null) && ("Admin".equals(user.getRole())))/*66.88*/ {_display_(Seq[Any](format.raw/*66.90*/("""
                                    """),format.raw/*67.37*/("""<p class = "text-center"><a href=""""),_display_(/*67.72*/routes/*67.78*/.HomeController.deleteProduct(p.getId)),format.raw/*67.116*/(""""
                                    onclick="return confirmDel();">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-trash"></span> </button>
                                    </a>
                                    </p>
                                    <p class = "text-center"><a href=""""),_display_(/*72.72*/routes/*72.78*/.HomeController.updateProduct(p.getId)),format.raw/*72.116*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-pencil"></span> </button>
                                    </a>
                                    </p>
                                    """),_display_(/*76.38*/if(p.getStock() == 0)/*76.59*/{_display_(Seq[Any](format.raw/*76.60*/("""
                                        """),format.raw/*77.41*/("""<td><img scr="asset/images/oos.jpg"/>
                                         </td>
                                    """)))}),format.raw/*79.38*/("""
                                    
                                """)))}),format.raw/*81.34*/("""

                                """),_display_(/*83.34*/if((user != null) && ("customer".equals(user.getRole())))/*83.91*/ {_display_(Seq[Any](format.raw/*83.93*/("""
                                    """),format.raw/*84.37*/("""<p class = "text-center"><a href=""""),_display_(/*84.72*/routes/*84.78*/.ShoppingCtrl.addToBasket(p.getId)),format.raw/*84.112*/("""">
                                        <button class = "btn btn-lg btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span> </button>
                                    </a>
                              """)))}),format.raw/*87.32*/("""
                            """),format.raw/*88.29*/("""</div>
                        </div>
                    </div>
                """)))}),format.raw/*91.18*/(""" """),format.raw/*91.19*/("""<!--End of the loop-->
            </div><!--End of product bounds-->
            <!-- /.column-->
        </div>
            <!-- /.row-->
    </div>
                </td>
            """)))}),format.raw/*98.14*/("""
        
        """),format.raw/*100.9*/("""</tbody>
    </table>
    """),_display_(/*102.6*/if((user != null) && ("admin".equals(user.getRole())))/*102.60*/ {_display_(Seq[Any](format.raw/*102.62*/("""
    """),format.raw/*103.5*/("""<p>
        <a href=""""),_display_(/*104.19*/routes/*104.25*/.HomeController.addProduct()),format.raw/*104.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*108.6*/("""

"""),format.raw/*110.1*/("""</div>
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
                  DATE: Thu Apr 18 15:44:19 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: f315d3eccd0b8adabf4280e6b8da73ce75c32cb7
                  MATRIX: 1048->1|1282->143|1312->165|1351->167|1382->172|1557->321|1597->353|1636->355|1676->368|1750->415|1764->420|1800->435|1841->448|1889->465|1926->475|2147->669|2162->675|2208->700|2348->813|2384->833|2423->834|2477->860|2516->872|2531->878|2583->909|2652->950|2663->951|2693->959|2746->984|2796->1007|2806->1008|2846->1027|2944->1094|2985->1107|3207->1302|3222->1308|3268->1333|3709->1747|3724->1753|3770->1778|4108->2089|4142->2107|4182->2109|4231->2130|4394->2266|4486->2348|4526->2349|4587->2382|4654->2422|4698->2445|4784->2512|4797->2516|4836->2517|4897->2550|4935->2561|4950->2567|5022->2617|5120->2684|5178->2714|5284->2793|5294->2794|5323->2802|5459->2910|5508->2937|5610->3012|5620->3013|5649->3021|5751->3096|5761->3097|5791->3106|5893->3181|5903->3182|5933->3191|5998->3229|6061->3283|6101->3285|6166->3322|6228->3357|6243->3363|6303->3401|6691->3762|6706->3768|6766->3806|7054->4067|7084->4088|7123->4089|7192->4130|7345->4252|7447->4323|7509->4358|7575->4415|7615->4417|7680->4454|7742->4489|7757->4495|7813->4529|8065->4750|8122->4779|8235->4861|8264->4862|8481->5048|8527->5066|8581->5093|8645->5147|8686->5149|8719->5154|8769->5176|8785->5182|8835->5210|8964->5308|8994->5310
                  LINES: 28->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|44->13|46->15|51->20|51->20|51->20|53->22|53->22|53->22|55->24|55->24|55->24|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|58->27|59->28|65->34|65->34|65->34|74->43|74->43|74->43|82->51|82->51|82->51|83->52|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|88->57|89->58|91->60|92->61|92->61|92->61|93->62|93->62|94->63|94->63|94->63|95->64|95->64|95->64|96->65|96->65|96->65|97->66|97->66|97->66|98->67|98->67|98->67|98->67|103->72|103->72|103->72|107->76|107->76|107->76|108->77|110->79|112->81|114->83|114->83|114->83|115->84|115->84|115->84|115->84|118->87|119->88|122->91|122->91|129->98|131->100|133->102|133->102|133->102|134->103|135->104|135->104|135->104|139->108|141->110
                  -- GENERATED --
              */
          