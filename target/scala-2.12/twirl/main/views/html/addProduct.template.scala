
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
            """),_display_(/*25.14*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.89*/("""
            """),format.raw/*26.13*/("""<p><strong>Categories</strong></p>
            """),_display_(/*27.14*/for((value, name) <- products.Category.options) yield /*27.61*/ {_display_(Seq[Any](format.raw/*27.63*/("""
                """),format.raw/*28.17*/("""<input type="checkbox" name="catSelect[]" value=""""),_display_(/*28.67*/value),format.raw/*28.72*/(""""  
                    """),_display_(/*29.22*/if(productForm("id").getValue.isPresent && productForm("id").getValue.get != "")/*29.102*/ {_display_(Seq[Any](format.raw/*29.104*/(""" 
                        """),_display_(/*30.26*/if(products.Category.inCategory(value.toLong, productForm("id").getValue.get.toLong))/*30.111*/ {_display_(Seq[Any](format.raw/*30.113*/("""
                            """),format.raw/*31.29*/("""checked
                        """)))}),format.raw/*32.26*/("""
                    """)))}),format.raw/*33.22*/(""" 
                """),format.raw/*34.17*/("""/> """),_display_(/*34.21*/name),format.raw/*34.25*/(""" """),format.raw/*34.26*/("""</br>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</p>
            
            """),_display_(/*38.14*/inputText(productForm("brand"), '_label -> "Brand", 'class -> "form-control")),format.raw/*38.91*/("""
            """),_display_(/*39.14*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*39.91*/("""
            """),_display_(/*40.14*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*40.91*/("""

            """),format.raw/*42.13*/("""<label>Image Upload</label>
            <input class="btn-sm btn-default" type="file" name="upload">    

            """),_display_(/*45.14*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*45.78*/("""
            
            """),format.raw/*47.13*/("""<!-- We use the bootstrap actions class for the buttons at the bottom:
                1. The submit button for the form
                2. A button that allows the user to cancel without adding an item
            -->
            <div class="actions">
                <input type="submit" value="Add/Update product" class="btn btn-primary">
                <a href=""""),_display_(/*53.27*/routes/*53.33*/.HomeController.onsale(0)),format.raw/*53.58*/("""">
                    <button type="button" class="btn btn-warning">Cancel</button>
                </a>
            </div>
    """)))}),format.raw/*57.6*/(""" """),format.raw/*57.24*/("""
""")))}),format.raw/*58.2*/(""" """))
      }
    }
  }

  def render(productForm:Form[models.products.ProductOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(productForm,user)

  def f:((Form[models.products.ProductOnSale],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (productForm,user) => apply(productForm,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Mar 27 17:50:25 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addProduct.scala.html
                  HASH: 287171bd73cee127a4b80410b81509aa3d124461
                  MATRIX: 1000->1|1147->79|1191->76|1219->95|1246->97|1278->121|1316->122|1347->127|1669->423|1842->587|1882->589|1919->626|1956->725|1993->735|2006->739|2037->749|2074->759|2451->1109|2478->1115|2507->1116|2759->1341|2855->1416|2896->1429|2971->1477|3034->1524|3074->1526|3119->1543|3196->1593|3222->1598|3274->1623|3364->1703|3405->1705|3459->1732|3554->1817|3595->1819|3652->1848|3716->1881|3769->1903|3815->1921|3846->1925|3871->1929|3900->1930|3950->1949|3991->1962|4049->1993|4147->2070|4188->2084|4286->2161|4327->2175|4425->2252|4467->2266|4613->2385|4698->2449|4752->2475|5147->2843|5162->2849|5208->2874|5368->3004|5397->3022|5429->3024
                  LINES: 28->1|31->4|34->2|36->5|37->6|37->6|37->6|38->7|43->12|44->13|44->13|45->14|46->15|47->16|47->16|47->16|49->18|53->22|53->22|53->22|56->25|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|63->32|64->33|65->34|65->34|65->34|65->34|66->35|67->36|69->38|69->38|70->39|70->39|71->40|71->40|73->42|76->45|76->45|78->47|84->53|84->53|84->53|88->57|88->57|89->58
                  -- GENERATED --
              */
          