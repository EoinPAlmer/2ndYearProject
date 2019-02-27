
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Product],List[models.Category],models.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product],categories: List[models.Category], user: models.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.114*/("""
    """),_display_(/*2.6*/main("products", user)/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
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
                                    """),_display_(/*48.38*/if(user != null)/*48.54*/ {_display_(Seq[Any](format.raw/*48.56*/("""
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

  def render(products:List[models.Product],categories:List[models.Category],user:models.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Wed Feb 27 16:32:05 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/products.scala.html
                  HASH: bbf8f19f0733746c56c52cf3adcb889f529a2e69
                  MATRIX: 820->1|1028->113|1059->119|1089->141|1128->143|1163->152|1346->309|1386->341|1425->343|1469->360|1546->411|1559->416|1594->431|1639->448|1691->469|1733->483|1966->689|1981->695|2029->722|2177->843|2213->863|2252->864|2310->894|2349->906|2364->912|2418->945|2487->986|2498->987|2528->995|2585->1024|2635->1047|2645->1048|2685->1067|2791->1142|2836->1159|3004->1300|3038->1318|3078->1320|3131->1345|3302->1489|3389->1566|3429->1567|3494->1604|3561->1644|3600->1662|3665->1708|3678->1712|3717->1713|3782->1750|3820->1761|3835->1767|3907->1817|3984->1863|4046->1897|4156->1980|4166->1981|4195->1989|4335->2101|4384->2128|4490->2207|4500->2208|4529->2216|4635->2295|4645->2296|4675->2305|4781->2384|4791->2385|4832->2405|4901->2447|4926->2463|4966->2465|5035->2506|5097->2541|5112->2547|5172->2585|5591->2977|5606->2983|5666->3021|5981->3305|6042->3338|6167->3432|6196->3433|6434->3641
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|38->7|38->7|38->7|39->8|40->9|40->9|40->9|41->10|43->12|45->14|50->19|50->19|50->19|52->21|52->21|52->21|54->23|54->23|54->23|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|57->26|58->27|64->33|64->33|64->33|65->34|67->36|67->36|67->36|68->37|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|70->39|71->40|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|80->49|85->54|85->54|85->54|89->58|90->59|93->62|93->62|100->69
                  -- GENERATED --
              */
          