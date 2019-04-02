
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


Seq[Any](_display_(/*3.2*/main("On Sale",user)/*3.22*/{_display_(Seq[Any](format.raw/*3.23*/("""
    """),format.raw/*4.5*/("""<h1>On sale here</h1>


    """),format.raw/*7.74*/("""
	"""),_display_(/*8.3*/if(flash.containsKey("success"))/*8.35*/ {_display_(Seq[Any](format.raw/*8.37*/("""
		"""),format.raw/*9.3*/("""<div class="alert alert-success">
			"""),_display_(/*10.5*/flash/*10.10*/.get("success")),format.raw/*10.25*/("""
		"""),format.raw/*11.3*/("""</div>
""")))}),format.raw/*12.2*/("""
    """),format.raw/*13.5*/("""<div class="col-sm-3">
		<h4>Categories</h4>
	        <ul class="list-group">
                    <a href = """"),_display_(/*16.33*/routes/*16.39*/.HomeController.onsale(0)),format.raw/*16.64*/("""" class="list-group-product">All Categories</a>
		        """),_display_(/*17.12*/for(c<-categories) yield /*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
			        """),format.raw/*18.12*/("""<a href = """"),_display_(/*18.24*/routes/*18.30*/.HomeController.onsale(c.getId())),format.raw/*18.63*/("""" class="list-group-product catheight">"""),_display_(/*18.103*/c/*18.104*/.getName),format.raw/*18.112*/("""
                        """),format.raw/*19.25*/("""<span class="badge">"""),_display_(/*19.46*/c/*19.47*/.getProducts.size),format.raw/*19.64*/("""</span> 
                    </a>
			    """)))}),format.raw/*21.9*/("""
            """),format.raw/*22.13*/("""</ul>
    </div>

    <div class="col-sm-9">
        <h4>Note that all products are second hand, unless otherwise stated.</h4>
        <table class="table table-bordered table-hover table-condensed">
            <thead>
        <!-- The header row-->
        <tr>
            <th>Image</th>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Stock</th>
            <th>Price</th>
            """),_display_(/*37.14*/if((user != null) && ("customer".equals(user.getRole())))/*37.71*/ {_display_(Seq[Any](format.raw/*37.73*/("""
            """),format.raw/*38.13*/("""<th>Buy</th>
            """)))}),format.raw/*39.14*/("""
        """),format.raw/*40.9*/("""</tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*45.71*/("""
            """),_display_(/*46.14*/for(i<-products) yield /*46.30*/ {_display_(Seq[Any](format.raw/*46.32*/("""
               """),format.raw/*47.16*/("""<tr>
                    """),_display_(/*48.22*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*48.104*/ {_display_(Seq[Any](format.raw/*48.106*/("""
                        """),format.raw/*49.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*49.69*/(i.getId + "thumb.jpg")),format.raw/*49.92*/(""""/></td>
                    """)))}/*50.23*/else/*50.28*/{_display_(Seq[Any](format.raw/*50.29*/("""
                        """),format.raw/*51.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*52.2*/("""
                  """),format.raw/*53.19*/("""<td>"""),_display_(/*53.24*/i/*53.25*/.getId),format.raw/*53.31*/("""</td>
                  <td>"""),_display_(/*54.24*/i/*54.25*/.getName),format.raw/*54.33*/("""</td>
                  <td>"""),_display_(/*55.24*/i/*55.25*/.getBrand),format.raw/*55.34*/("""</td>
                  <td>"""),_display_(/*56.24*/i/*56.25*/.getStock),format.raw/*56.34*/("""</td>
                  <td>&euro; """),_display_(/*57.31*/("%.2f".format(i.getPrice))),format.raw/*57.58*/("""</td>

                  """),_display_(/*59.20*/if((user != null) && ("Admin".equals(user.getRole())))/*59.74*/ {_display_(Seq[Any](format.raw/*59.76*/("""
                  """),format.raw/*60.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*62.18*/routes/*62.24*/.HomeController.updateProduct(i.getId)),format.raw/*62.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*68.18*/routes/*68.24*/.HomeController.deleteProduct(i.getId)),format.raw/*68.62*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*72.20*/("""
                  """),_display_(/*73.20*/if((user != null) && ("customer".equals(user.getRole())))/*73.77*/ {_display_(Seq[Any](format.raw/*73.79*/("""
                        """),format.raw/*74.25*/("""<td><a href=""""),_display_(/*74.39*/routes/*74.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*74.79*/("""" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
                  """)))}),format.raw/*75.20*/("""
               """),format.raw/*76.16*/("""</tr>
            """)))}),format.raw/*77.14*/("""
        
        """),format.raw/*79.9*/("""</tbody>
    </table>
    """),_display_(/*81.6*/if((user != null) && ("admin".equals(user.getRole())))/*81.60*/ {_display_(Seq[Any](format.raw/*81.62*/("""
    """),format.raw/*82.5*/("""<p>
        <a href=""""),_display_(/*83.19*/routes/*83.25*/.HomeController.addProduct()),format.raw/*83.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*87.6*/("""
"""),format.raw/*88.1*/("""</div>
 """)))}))
      }
    }
  }

  def render(products:List[models.products.ProductOnSale],categories:List[models.products.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.products.ProductOnSale],List[models.products.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 02 12:34:41 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: 56b08ca1d2ec2ade48eb27bd0690b517ee176611
                  MATRIX: 1048->1|1282->143|1310->163|1348->164|1379->169|1434->266|1462->269|1502->301|1541->303|1570->306|1634->344|1648->349|1684->364|1714->367|1752->375|1784->380|1921->490|1936->496|1982->521|2068->580|2102->598|2142->600|2182->612|2221->624|2236->630|2290->663|2358->703|2369->704|2399->712|2452->737|2500->758|2510->759|2548->776|2620->818|2661->831|3123->1266|3189->1323|3229->1325|3270->1338|3327->1364|3363->1373|3482->1522|3523->1536|3555->1552|3595->1554|3639->1570|3692->1596|3784->1678|3825->1680|3878->1705|3949->1749|3993->1772|4042->1803|4055->1808|4094->1809|4147->1834|4241->1898|4288->1917|4320->1922|4330->1923|4357->1929|4413->1958|4423->1959|4452->1967|4508->1996|4518->1997|4548->2006|4604->2035|4614->2036|4644->2045|4707->2081|4755->2108|4808->2134|4871->2188|4911->2190|4958->2209|5036->2260|5051->2266|5110->2304|5337->2504|5352->2510|5411->2548|5622->2728|5669->2748|5735->2805|5775->2807|5828->2832|5869->2846|5884->2852|5939->2886|6087->3003|6131->3019|6181->3038|6226->3056|6279->3083|6342->3137|6382->3139|6414->3144|6463->3166|6478->3172|6527->3200|6655->3298|6683->3299
                  LINES: 28->1|34->3|34->3|34->3|35->4|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|52->21|53->22|68->37|68->37|68->37|69->38|70->39|71->40|76->45|77->46|77->46|77->46|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|83->52|84->53|84->53|84->53|84->53|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|90->59|90->59|90->59|91->60|93->62|93->62|93->62|99->68|99->68|99->68|103->72|104->73|104->73|104->73|105->74|105->74|105->74|105->74|106->75|107->76|108->77|110->79|112->81|112->81|112->81|113->82|114->83|114->83|114->83|118->87|119->88
                  -- GENERATED --
              */
          