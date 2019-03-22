
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

object products extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.products.Product],List[models.products.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.products.Product],categories: List[models.products.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""    """),_display_(/*2.6*/main("products", user)/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
        """),format.raw/*3.9*/("""<div class="container">

            <h2 class = "text-center text-muted"><span class = "logo">Sneaker Sancturay</span> Products In Stock</h2>

            """),_display_(/*7.14*/if(flash.containsKey("success"))/*7.46*/ {_display_(Seq[Any](format.raw/*7.48*/("""
                """),format.raw/*8.17*/("""<div class="alert alert-success">
                """),_display_(/*9.18*/flash/*9.23*/.get("success")),format.raw/*9.38*/("""
                """),format.raw/*10.17*/("""</div>

            """)))}),format.raw/*12.14*/("""

            """),format.raw/*14.13*/("""<div class="row">

                <div class = "col-lg-6 col-md-6 col-sm-12 col-xs-12 col-centered">
                <h3 class = "text-center text-muted">Categories</h3>

                        <a href=""""),_display_(/*19.35*/routes/*19.41*/.HomeController.products(0)),format.raw/*19.68*/(""""><button class = "btn btn-lg btn-Dark">All Categories
                           </button></a>
                        """),_display_(/*21.26*/for(c <- categories) yield /*21.46*/{_display_(Seq[Any](format.raw/*21.47*/("""

                            """),format.raw/*23.29*/("""<a href = """"),_display_(/*23.41*/routes/*23.47*/.HomeController.products(c.getId)),format.raw/*23.80*/(""""><button class = "btn btn-lg btn-Dark">"""),_display_(/*23.121*/c/*23.122*/.getName),format.raw/*23.130*/("""
                            """),format.raw/*24.29*/("""<span class = "badge">"""),_display_(/*24.52*/c/*24.53*/.getProducts.size()),format.raw/*24.72*/("""</span></button>
                            </a>
                        """)))}),format.raw/*26.26*/("""
                """),format.raw/*27.17*/("""</div>

                <br>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                    """),_display_(/*33.22*/for(p <- products) yield /*33.40*/ {_display_(Seq[Any](format.raw/*33.42*/("""
                        """),format.raw/*34.25*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
                            <div class="thumbnail">
                                """),_display_(/*36.34*/if(env.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*36.111*/{_display_(Seq[Any](format.raw/*36.112*/("""
                                    """),format.raw/*37.37*/("""<img src="/assets/images/productImages/"""),_display_(/*37.77*/(p.getId + ".jpg")),format.raw/*37.95*/("""" alt="...">
                                """)))}/*38.34*/else/*38.38*/{_display_(Seq[Any](format.raw/*38.39*/("""
                                    """),format.raw/*39.37*/("""<img src=""""),_display_(/*39.48*/routes/*39.54*/.Assets.versioned("images/productplaceholder.svg")),format.raw/*39.104*/("""" alt="...">
                                """)))}),format.raw/*40.34*/("""

                                """),format.raw/*42.33*/("""<div class="caption">
                                    <h3 class="text-center">"""),_display_(/*43.62*/p/*43.63*/.getName),format.raw/*43.71*/("""</h3>
                                    <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*44.107*/("%.2f".format(p.getPrice))),format.raw/*44.134*/("""</h4>
                                    <p class="text-center"><b>Size:</b> """),_display_(/*45.74*/p/*45.75*/.getSize),format.raw/*45.83*/("""</p>
                                    <p class="text-center"><b>Stock:</b> """),_display_(/*46.75*/p/*46.76*/.getStock),format.raw/*46.85*/("""</p>
                                    <p class="text-center"><b>Brand:</b> """),_display_(/*47.75*/p/*47.76*/.getCategory.getName),format.raw/*47.96*/("""</p>
                                    """),_display_(/*48.38*/if((user != null) && ("admin".equals(user.getRole())))/*48.92*/ {_display_(Seq[Any](format.raw/*48.94*/("""
                                        """),format.raw/*49.41*/("""<p class = "text-center"><a href=""""),_display_(/*49.76*/routes/*49.82*/.HomeController.deleteProduct(p.getId)),format.raw/*49.120*/(""""
                                        onclick="return confirmDel();">
                                            <button class = "btn btn-lg btn-dark"><span class="glyphicon glyphicon-trash thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                        <p class = "text-center"><a href=""""),_display_(/*54.76*/routes/*54.82*/.HomeController.updateProduct(p.getId)),format.raw/*54.120*/("""">
                                            <button class = "btn btn-lg btn-Dark"><span class="glyphicon glyphicon-pencil thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                    """)))}),format.raw/*58.38*/("""
                                """),format.raw/*59.33*/("""</div>
                            </div>
                        </div>
                    """)))}),format.raw/*62.22*/(""" """),format.raw/*62.23*/("""<!--End of the loop-->
                </div><!--End of product bounds-->
                <!-- /.column-->
            </div>
                <!-- /.row-->
        </div>
            <!-- /.container-->
    """)))}),format.raw/*69.6*/("""
"""))
      }
    }
  }

  def render(products:List[models.products.Product],categories:List[models.products.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.products.Product],List[models.products.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Mar 22 12:24:04 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/products.scala.html
                  HASH: 74fc24ea9f56417c5340a77ecf1109bf5443971c
                  MATRIX: 1044->1|1274->138|1304->143|1334->165|1373->167|1408->176|1591->333|1631->365|1670->367|1714->384|1791->435|1804->440|1839->455|1884->472|1936->493|1978->507|2211->713|2226->719|2274->746|2422->867|2458->887|2497->888|2555->918|2594->930|2609->936|2663->969|2732->1010|2743->1011|2773->1019|2830->1048|2880->1071|2890->1072|2930->1091|3036->1166|3081->1183|3249->1324|3283->1342|3323->1344|3376->1369|3547->1513|3634->1590|3674->1591|3739->1628|3806->1668|3845->1686|3910->1732|3923->1736|3962->1737|4027->1774|4065->1785|4080->1791|4152->1841|4229->1887|4291->1921|4401->2004|4411->2005|4440->2013|4580->2125|4629->2152|4735->2231|4745->2232|4774->2240|4880->2319|4890->2320|4920->2329|5026->2408|5036->2409|5077->2429|5146->2471|5209->2525|5249->2527|5318->2568|5380->2603|5395->2609|5455->2647|5874->3039|5889->3045|5949->3083|6264->3367|6325->3400|6450->3494|6479->3495|6717->3703
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|43->12|45->14|50->19|50->19|50->19|52->21|52->21|52->21|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|57->26|58->27|64->33|64->33|64->33|65->34|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|80->49|85->54|85->54|85->54|89->58|90->59|93->62|93->62|100->69
                  -- GENERATED --
              */
          