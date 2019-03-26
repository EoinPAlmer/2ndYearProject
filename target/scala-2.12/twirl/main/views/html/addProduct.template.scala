
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
/*1.2*/import helper._

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.products.ProductOnSale],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addProductForm: Form[models.products.ProductOnSale])(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

    """),_display_(/*5.6*/main("AddProduct", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

        """),format.raw/*7.9*/("""<div class="container">
            <h2 class = "text-center text-muted">Add A Product To <span class = "logo">Sneaker Sanctuary</span></h2>

            <div class="row">

                <div class="col-lg-8 col-md-8 col-sm-10 col-xs-12 col-centered">


                """),_display_(/*15.18*/form(action = routes.HomeController.addProductSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*15.154*/ {_display_(Seq[Any](format.raw/*15.156*/("""
                    """),format.raw/*16.49*/("""
                    """),format.raw/*17.109*/("""
                    """),_display_(/*18.22*/CSRF/*18.26*/.formField),format.raw/*18.36*/("""

                    """),_display_(/*20.22*/inputText(addProductForm("id"), '_label -> "ID", 'class -> "form-control")),format.raw/*20.96*/("""
                    """),_display_(/*21.22*/inputText(addProductForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*21.100*/("""
                    """),_display_(/*22.22*/inputText(addProductForm("brand"), '_label -> "Brand", 'class -> "form-control")),format.raw/*22.102*/("""
                    """),_display_(/*23.22*/inputText(addProductForm("size"), '_label -> "Size", 'class -> "form-control")),format.raw/*23.100*/("""
                    """),_display_(/*24.22*/inputText(addProductForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*24.102*/("""
                    """),_display_(/*25.22*/inputText(addProductForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*25.102*/("""

                    """),_display_(/*27.22*/inputText(addProductForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*27.89*/("""
                   
               
                    """),format.raw/*30.21*/("""<label>Image Upload</label>
                    <input class = "btn btn-dark" type = "file" name = "upload">

                    <br>

                    <div class="actions">
                        <input type="submit" value="Add Product" class="btn btn-dark">


                        """),format.raw/*39.131*/("""
                        """),format.raw/*40.25*/("""<a href=""""),_display_(/*40.35*/routes/*40.41*/.HomeController.products()),format.raw/*40.67*/("""" class="btn btn-danger">Cancel</a>


                    </div>
                </div>
            </div>
        </div>

    """)))}),format.raw/*48.6*/("""

    """)))}))
      }
    }
  }

  def render(addProductForm:Form[models.products.ProductOnSale],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProductForm)(user)

  def f:((Form[models.products.ProductOnSale]) => (models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProductForm) => (user) => apply(addProductForm)(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Mar 26 15:22:46 GMT 2019
                  SOURCE: /home/wdd/2ndYearProject/app/views/addProduct.scala.html
                  HASH: e27bd76e5d9f4a7743623c004af34281433f5a2f
                  MATRIX: 651->1|1023->18|1195->97|1227->104|1259->128|1298->130|1334->140|1634->413|1780->549|1821->551|1870->600|1920->709|1969->731|1982->735|2013->745|2063->768|2158->842|2207->864|2307->942|2356->964|2458->1044|2507->1066|2607->1144|2656->1166|2758->1246|2807->1268|2909->1348|2959->1371|3047->1438|3132->1495|3452->1892|3505->1917|3542->1927|3557->1933|3604->1959|3762->2087
                  LINES: 24->1|29->2|34->3|36->5|36->5|36->5|38->7|46->15|46->15|46->15|47->16|48->17|49->18|49->18|49->18|51->20|51->20|52->21|52->21|53->22|53->22|54->23|54->23|55->24|55->24|56->25|56->25|58->27|58->27|61->30|70->39|71->40|71->40|71->40|71->40|79->48
                  -- GENERATED --
              */
          