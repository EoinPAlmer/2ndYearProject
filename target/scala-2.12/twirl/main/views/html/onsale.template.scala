
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
            <th>Size</th>
            <th>Stock</th>
            <th>Price</th>
            """),_display_(/*38.14*/if((user != null) && ("customer".equals(user.getRole())))/*38.71*/ {_display_(Seq[Any](format.raw/*38.73*/("""
            """),format.raw/*39.13*/("""<th>Buy</th>
            """)))}),format.raw/*40.14*/("""
        """),format.raw/*41.9*/("""</tr>
        </thead>
        <tbody>
        <!-- Product row(s) -->
       
            """),format.raw/*46.71*/("""
            """),_display_(/*47.14*/for(i<-products) yield /*47.30*/ {_display_(Seq[Any](format.raw/*47.32*/("""
               """),format.raw/*48.16*/("""<tr>
                    """),_display_(/*49.22*/if(env.resource("public/images/productImages/" + i.getId + "thumb.jpg").isDefined)/*49.104*/ {_display_(Seq[Any](format.raw/*49.106*/("""
                        """),format.raw/*50.25*/("""<td><img src="/assets/images/productImages/"""),_display_(/*50.69*/(i.getId + "thumb.jpg")),format.raw/*50.92*/(""""/></td>
                    """)))}/*51.23*/else/*51.28*/{_display_(Seq[Any](format.raw/*51.29*/("""
                        """),format.raw/*52.25*/("""<td><img src="/assets/images/productImages/noImage.jpg"/></td>
""")))}),format.raw/*53.2*/("""
                  """),format.raw/*54.19*/("""<td>"""),_display_(/*54.24*/i/*54.25*/.getId),format.raw/*54.31*/("""</td>
                  <td>"""),_display_(/*55.24*/i/*55.25*/.getName),format.raw/*55.33*/("""</td>
                  <td>"""),_display_(/*56.24*/i/*56.25*/.getBrand),format.raw/*56.34*/("""</td>
                  <th>"""),_display_(/*57.24*/i/*57.25*/.getSize),format.raw/*57.33*/("""</th>
                  <td>"""),_display_(/*58.24*/i/*58.25*/.getStock),format.raw/*58.34*/("""</td>
                  <td>&euro; """),_display_(/*59.31*/("%.2f".format(i.getPrice))),format.raw/*59.58*/("""</td>

                  """),_display_(/*61.20*/if((user != null) && ("Admin".equals(user.getRole())))/*61.74*/ {_display_(Seq[Any](format.raw/*61.76*/("""
                  """),format.raw/*62.19*/("""<!-- Update button -->
						<td>
							<a href=""""),_display_(/*64.18*/routes/*64.24*/.HomeController.updateProduct(i.getId)),format.raw/*64.62*/("""" class="button-xs btn-danger">
								<span class="glyphicon glyphicon-pencil"></span>
							</a>
                        </td>
                  <!-- Delete button -->
						<td>
							<a href=""""),_display_(/*70.18*/routes/*70.24*/.HomeController.deleteProduct(i.getId)),format.raw/*70.62*/("""" class="button-xs btn-danger" onclick="return confirmDel();">
								<span class="glyphicon glyphicon-trash"></span>
							</a>
                        </td>
                  """)))}),format.raw/*74.20*/("""
                  """),_display_(/*75.20*/if((user != null) && ("customer".equals(user.getRole())))/*75.77*/ {_display_(Seq[Any](format.raw/*75.79*/("""
                        """),format.raw/*76.25*/("""<td><a href=""""),_display_(/*76.39*/routes/*76.45*/.ShoppingCtrl.addToBasket(i.getId)),format.raw/*76.79*/("""" class="btn btn-default btn-xs"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>
                  """)))}),format.raw/*77.20*/("""
               """),format.raw/*78.16*/("""</tr>
            """)))}),format.raw/*79.14*/("""
        
        """),format.raw/*81.9*/("""</tbody>
    </table>
    """),_display_(/*83.6*/if((user != null) && ("admin".equals(user.getRole())))/*83.60*/ {_display_(Seq[Any](format.raw/*83.62*/("""
    """),format.raw/*84.5*/("""<p>
        <a href=""""),_display_(/*85.19*/routes/*85.25*/.HomeController.addProduct()),format.raw/*85.53*/("""">
            <button class="btn btn-primary">Add an product</button>
        </a>
    </p>
    """)))}),format.raw/*89.6*/("""
"""),format.raw/*90.1*/("""</div>
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
                  DATE: Wed Apr 03 15:17:49 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/onsale.scala.html
                  HASH: 0a654b378eb145fc84362086fac648c69f9b3ab1
                  MATRIX: 1048->1|1282->143|1310->163|1348->164|1379->169|1434->266|1462->269|1502->301|1541->303|1570->306|1634->344|1648->349|1684->364|1714->367|1752->375|1784->380|1921->490|1936->496|1982->521|2068->580|2102->598|2142->600|2182->612|2221->624|2236->630|2290->663|2358->703|2369->704|2399->712|2452->737|2500->758|2510->759|2548->776|2620->818|2661->831|3149->1292|3215->1349|3255->1351|3296->1364|3353->1390|3389->1399|3508->1548|3549->1562|3581->1578|3621->1580|3665->1596|3718->1622|3810->1704|3851->1706|3904->1731|3975->1775|4019->1798|4068->1829|4081->1834|4120->1835|4173->1860|4267->1924|4314->1943|4346->1948|4356->1949|4383->1955|4439->1984|4449->1985|4478->1993|4534->2022|4544->2023|4574->2032|4630->2061|4640->2062|4669->2070|4725->2099|4735->2100|4765->2109|4828->2145|4876->2172|4929->2198|4992->2252|5032->2254|5079->2273|5157->2324|5172->2330|5231->2368|5458->2568|5473->2574|5532->2612|5743->2792|5790->2812|5856->2869|5896->2871|5949->2896|5990->2910|6005->2916|6060->2950|6208->3067|6252->3083|6302->3102|6347->3120|6400->3147|6463->3201|6503->3203|6535->3208|6584->3230|6599->3236|6648->3264|6776->3362|6804->3363
                  LINES: 28->1|34->3|34->3|34->3|35->4|38->7|39->8|39->8|39->8|40->9|41->10|41->10|41->10|42->11|43->12|44->13|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|52->21|53->22|69->38|69->38|69->38|70->39|71->40|72->41|77->46|78->47|78->47|78->47|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|84->53|85->54|85->54|85->54|85->54|86->55|86->55|86->55|87->56|87->56|87->56|88->57|88->57|88->57|89->58|89->58|89->58|90->59|90->59|92->61|92->61|92->61|93->62|95->64|95->64|95->64|101->70|101->70|101->70|105->74|106->75|106->75|106->75|107->76|107->76|107->76|107->76|108->77|109->78|110->79|112->81|114->83|114->83|114->83|115->84|116->85|116->85|116->85|120->89|121->90
                  -- GENERATED --
              */
          