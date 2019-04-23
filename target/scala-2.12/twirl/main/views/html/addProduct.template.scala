
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.ProductOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.products.ProductOnSale],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*4.2*/import helper._


Seq[Any](format.raw/*2.1*/("""

"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Add Product",user)/*6.26*/{_display_(Seq[Any](format.raw/*6.27*/("""
    """),format.raw/*7.5*/("""<p class="lead">Add a new product</p>

    <!-- Use a views.html.helpers package method to create the form (instead of html)-->
    <!-- Note the arguments that are being passed to the scala function form (they are
         essentially instructions for constructing an HTML form element)-->
    """),_display_(/*12.6*/form(action=routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form",
           'method -> "POST", 'enctype -> "multipart/form-data")/*13.65*/ {_display_(Seq[Any](format.raw/*13.67*/("""
        """),format.raw/*14.37*/("""
        """),format.raw/*15.99*/("""
        """),_display_(/*16.10*/CSRF/*16.14*/.formField),format.raw/*16.24*/("""

        """),format.raw/*18.9*/("""<!-- Use helper methods to add fields to the form -->
        <!-- Note that the form fields are related to the fields of the productForm object -->
        <!-- Note the arguments that are being passed to the scala function inputText (they are 
             essentially instructions for constructing an HTML input element)-->
        <!-- Note the """),_display_(/*22.24*/select),format.raw/*22.30*/(""" """),format.raw/*22.31*/("""function's argument options. This needs to be a map of ids-to-names
             and this is provided by the method Category.options(), which we added to the Category
             class in the previous step. -->

             <div class="row text-center">
                <div class="col-md-offset-4 col-md-4">
                    <form role="form">
            """),_display_(/*29.14*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*29.89*/("""
            """),format.raw/*30.13*/("""<p><strong>Categories</strong></p>
            """),_display_(/*31.14*/for((value, name) <- products.Category.options) yield /*31.61*/ {_display_(Seq[Any](format.raw/*31.63*/("""
                """),format.raw/*32.17*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*32.67*/value),format.raw/*32.72*/(""""  
                    """),_display_(/*33.22*/if(productForm("id").getValue.isPresent && productForm("id").getValue.get != "")/*33.102*/ {_display_(Seq[Any](format.raw/*33.104*/(""" 
                        """),_display_(/*34.26*/if(products.Category.inCategory(value.toLong, productForm("id").getValue.get.toLong))/*34.111*/ {_display_(Seq[Any](format.raw/*34.113*/("""
                            """),format.raw/*35.29*/("""checked
                        """)))}),format.raw/*36.26*/("""
                    """)))}),format.raw/*37.22*/(""" 
                """),format.raw/*38.17*/("""/> """),_display_(/*38.21*/name),format.raw/*38.25*/(""" """),format.raw/*38.26*/("""</br>
            """)))}),format.raw/*39.14*/("""
            """),format.raw/*40.13*/("""</p>
            
            """),_display_(/*42.14*/inputText(productForm("brand"), '_label -> "Brand", 'class -> "form-control")),format.raw/*42.91*/("""
            """),_display_(/*43.14*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*43.91*/("""
            """),_display_(/*44.14*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*44.91*/("""
            """),_display_(/*45.14*/inputText(productForm("size"), '_label -> "Size", 'class -> "form-control")),format.raw/*45.89*/("""

            """),format.raw/*47.13*/("""<label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload">    

            """),_display_(/*50.14*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*50.78*/("""
            
            """),format.raw/*52.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update product" class="btn btn-Dark">
                <a href=""""),_display_(/*58.27*/routes/*58.33*/.HomeController.onsale(0)),format.raw/*58.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
        </form>
    </div>
</div>
    """)))}),format.raw/*65.6*/(""" """),format.raw/*65.24*/("""
""")))}),format.raw/*66.2*/(""" """))
      }
    }
  }

  def render(productForm:Form[models.products.ProductOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.products.ProductOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Apr 23 15:13:56 IST 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addProduct.scala.html
                  HASH: a52bdd2e9210d8777063ebe9fb3ae6e347427edc
                  MATRIX: 1000->1|1147->79|1191->76|1219->95|1246->97|1278->121|1316->122|1347->127|1669->423|1842->587|1882->589|1919->626|1956->725|1993->735|2006->739|2037->749|2074->759|2451->1109|2478->1115|2507->1116|2897->1479|2993->1554|3034->1567|3109->1615|3172->1662|3212->1664|3257->1681|3334->1731|3360->1736|3412->1761|3502->1841|3543->1843|3597->1870|3692->1955|3733->1957|3790->1986|3854->2019|3907->2041|3953->2059|3984->2063|4009->2067|4038->2068|4088->2087|4129->2100|4187->2131|4285->2208|4326->2222|4424->2299|4465->2313|4563->2390|4604->2404|4700->2479|4742->2493|4888->2612|4973->2676|5027->2702|5419->3067|5434->3073|5480->3098|5674->3262|5703->3280|5735->3282
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|44->13|44->13|45->14|46->15|47->16|47->16|47->16|49->18|53->22|53->22|53->22|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|64->33|65->34|65->34|65->34|66->35|67->36|68->37|69->38|69->38|69->38|69->38|70->39|71->40|73->42|73->42|74->43|74->43|75->44|75->44|76->45|76->45|78->47|81->50|81->50|83->52|89->58|89->58|89->58|96->65|96->65|97->66
                  -- GENERATED --
              */
          